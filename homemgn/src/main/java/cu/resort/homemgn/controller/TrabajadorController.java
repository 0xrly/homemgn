
package cu.resort.homemgn.controller;

import cu.resort.homemgn.model.Trabajador;
import java.util.List;
import java.util.Optional;




public class TrabajadorController {
    
    private CadenaController cadenaController;

    public TrabajadorController() {
        cadenaController = new CadenaController();
    }
    
    public Trabajador crear(String name, String address, String CI){
        List<Trabajador> trabajadores = cadenaController.leer().getTrabajadores();
        Trabajador trabajador = new Trabajador(trabajadores.size(),name, address, CI);
        trabajadores.add(trabajador);
        return trabajador;
    }
    
    public Optional<Trabajador> leer(int id){
        List<Trabajador> trabajadores = cadenaController.leer().getTrabajadores();
        if(id<trabajadores.size() && !trabajadores.get(id).isSoftDelete())
            return Optional.of(trabajadores.get(id));
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





