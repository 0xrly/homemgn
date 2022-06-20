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
    
    public Optional<Contrato> actualizar(int idContrato,int idTrabajador, int idCasa,int daysQty, double cost){
        Optional<Contrato> contratoOpt= leer(idContrato);
        Optional<Trabajador> trabajadorOpt =  trabajadorController.leer(idTrabajador);
        Optional<Casa> houseOpt = houseController.leer(idCasa);
        if(contratoOpt.isPresent()){
            Contrato contrato = contratoOpt.get();
            contrato.setCasa(houseOpt.get());
            contrato.
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
