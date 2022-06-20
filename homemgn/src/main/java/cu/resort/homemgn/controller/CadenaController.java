
package cu.resort.homemgn.controller;

import cu.resort.homemgn.model.Cadena;



//SINGLETON
public class CadenaController {
    private static Cadena cadena;
    
    public Cadena crear(){
        if(cadena == null)
            cadena = new Cadena();
        return cadena;
    }
    
    public Cadena leer(){
        return crear();
    }
    
    public void reset(){
        cadena = new Cadena();
    }
}
