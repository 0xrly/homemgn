package cu.resort.homemgn.controller;

import cu.resort.homemgn.model.Casa;
import cu.resort.homemgn.model.Contrato;
import cu.resort.homemgn.model.ContratoTrabajador;
import cu.resort.homemgn.model.Trabajador;
import java.util.List;
import java.util.Optional;


public class TrabajadorContractController {
    
    private CadenaController cadenaController;
    
    private TrabajadorController trabajadorController;
    
    private HouseController houseController;

    public TrabajadorContractController() {
        cadenaController = new CadenaController();
        trabajadorController = new TrabajadorController();
        houseController = new HouseController();
    }
    
    public Optional<Contrato> crear(int idTrabajador, int idCasa,int daysQty, double cost){
        List<Contrato> contratos = cadenaController.leer().getContratos();
        Optional<Trabajador> trabajadorOpt =  trabajadorController.leer(idTrabajador);
        Optional<Casa> houseOpt = houseController.leer(idCasa);
        if(trabajadorOpt.isPresent() && houseOpt.isPresent()){
            Contrato contrato= new ContratoTrabajador(contratos.size(),trabajadorOpt.get(),daysQty,cost,houseOpt.get());
            contratos.add(contrato);
            return Optional.of(contrato);
        }
        return Optional.empty();
    }
    
    public Optional<Contrato> leer(int id){
        List<Contrato> contratos = cadenaController.leer().getContratos();
        if(id<contratos.size() && !contratos.get(id).isSoftDelete())
            return Optional.of(contratos.get(id));
        return Optional.empty();
    }
    
    public Optional<Trabajador> actualizar(int id, String name, String address, String CI){
        Optional<Trabajador> trabajadorOpt = leer(id);
        if(trabajadorOpt.isPresent()){
            Trabajador trabajador = trabajadorOpt.get();
            trabajador.setName(name);
            trabajador.setAddress(address);
            trabajador.setCI(CI);
        }
        return trabajadorOpt;
    }
    
    public boolean remover(int id){
        Optional<Trabajador> trabajadorOpt = leer(id);
        if(trabajadorOpt.isPresent()){
            Trabajador trabajador = trabajadorOpt.get();
            trabajador.setSoftDelete(true);
        }
        return trabajadorOpt.isPresent();
    }

    public CadenaController getCadenaController() {
        return cadenaController;
    }
    
}
