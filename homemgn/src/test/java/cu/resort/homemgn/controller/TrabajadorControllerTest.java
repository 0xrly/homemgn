
package cu.resort.homemgn.controller;

import cu.resort.homemgn.model.Trabajador;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;



public class TrabajadorControllerTest {
    private TrabajadorController trabajadorController;
    private CadenaController cadenaController;
    
    @Before
    public void init(){
        trabajadorController = new TrabajadorController();
        cadenaController = trabajadorController.getCadenaController();
    }
    
    
    @Test
    public void crear(){
        String name = "Orlandito";
        String address = "Varadero";
        String ci = "12345";
        Trabajador trabajador = trabajadorController.crear(name, address, ci);
        assertEquals(trabajador.getName(),name);
        assertEquals(trabajador.getAddress(),address);
        assertEquals(trabajador.getCI(),ci);
        assertEquals(trabajador.getId(),0);
        
        assertEquals(cadenaController.leer().getTrabajadores().size(),1);
        name = "Alejandro";
        address = "Boca";
        ci = "54321";
        trabajador = trabajadorController.crear(name, address, ci);
        assertEquals(trabajador.getName(),name);
        assertEquals(trabajador.getAddress(),address);
        assertEquals(trabajador.getCI(),ci);
        assertEquals(trabajador.getId(),1);
        assertEquals(cadenaController.leer().getTrabajadores().size(),2);
    }
    
    public void leer(int id){
    }
    @Test
    public void actualizar(){
                String name = "Orlandito";
        String address = "Varadero";
        String ci = "12345";
        Trabajador trabajador = trabajadorController.actualizar(name, address, ci);
        assertEquals(trabajador.getName(),name);
        assertEquals(trabajador.getAddress(),address);
        assertEquals(trabajador.getCI(),ci);
        assertEquals(trabajador.getId(),0);
    }
    
    public void remover(){
        
    }
//    
//    public static void main(String[] args) {
//        TrabajadorControllerTest test = new TrabajadorControllerTest();
//        test.crear();
//    }
}







