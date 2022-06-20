
package cu.resort.homemgn.model;

import java.util.ArrayList;
import java.util.List;


public class Cadena {
   private List<Trabajador> trabajadores;
   private List<Contrato> contratos;
   private List<Empresa> empresas;
   private List<Casa> casas;

    public List<Trabajador> getTrabajadores() {
        if(trabajadores == null)
            trabajadores = new ArrayList<>();
        return trabajadores;
    }

    public List<Contrato> getContratos() {
        if(contratos == null)
            contratos = new ArrayList<>();
        return contratos;
    }

    public List<Empresa> getEmpresas() {
        if(empresas == null)
            empresas = new ArrayList<>();
        return empresas;
    }

    public List<Casa> getCasas() {
        if(casas == null)
            casas = new ArrayList<>();
        return casas;
    }

    public void setTrabajadores(List<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }

    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }

    public void setCasas(List<Casa> casas) {
        this.casas = casas;
    }
   
}

    
    
