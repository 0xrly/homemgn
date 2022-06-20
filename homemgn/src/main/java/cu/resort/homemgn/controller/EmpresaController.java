
package cu.resort.homemgn.controller;

import cu.resort.homemgn.model.Empresa;

import java.util.List;
import java.util.Optional;


public class EmpresaController {
       private CadenaController cadenaController;

    public EmpresaController() {
        cadenaController = new CadenaController();
    }
    
    public Empresa crear(String name, String address, String fax, String email){
        List<Empresa> empresas = cadenaController.leer().getEmpresas();
        Empresa empresa = new Empresa(empresas.size(),name,address,fax, email);
        empresas.add(empresa);
        return empresa;
    }
    
    public Optional<Empresa> leer(int id){
        List<Empresa> empresas = cadenaController.leer().getEmpresas();
        if(id<empresas.size() && !empresas.get(id).isSoftDelete())
            return Optional.of(empresas.get(id));
        return Optional.empty();
    }
    
    public Optional<Empresa> actualizar(int id, String name, String address, String fax, String email){
        Optional<Empresa> empresaOpt = leer(id);
        if(empresaOpt.isPresent()){
         Empresa empresa = empresaOpt.get();
         empresa.setAddress(address);
         empresa.setEmail(email);
         empresa.setName(name);
         empresa.setFax(fax);
         
        }
        return empresaOpt;
    }
    
    public boolean remover(int id){
        Optional<Empresa> empresaOpt = leer(id);
        if(empresaOpt.isPresent()){
            Empresa empresa = empresaOpt.get();
            empresa.setSoftDelete(true);
        }
        return empresaOpt.isPresent();
    }

    public CadenaController getCadenaController() {
        return cadenaController;
    }
    
}
