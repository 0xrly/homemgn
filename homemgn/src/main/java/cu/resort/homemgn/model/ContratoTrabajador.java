
package cu.resort.homemgn.model;


public class ContratoTrabajador extends Contrato {

    public ContratoTrabajador(int id,Trabajador trabajador, int daysQty, double cost, Casa casa) {
        super(id,daysQty, cost, casa);
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
