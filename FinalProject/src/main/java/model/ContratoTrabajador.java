
package model;


public class ContratoTrabajador extends Contrato {

    public ContratoTrabajador(Trabajador trabajador, int daysQty, double cost, Casa casa) {
        super(daysQty, cost, casa);
        this.trabajador = trabajador;
    }
    private Trabajador trabajador;

    

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }
    
}
