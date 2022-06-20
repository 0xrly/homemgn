
package cu.resort.homemgn.model;


public abstract class Contrato {
    private int id;
    protected int daysQty;
    protected double cost;
    protected Casa casa;
    private boolean softDelete;

    public Contrato(int id,int daysQty, double cost, Casa casa) {
        this.id = id;
        this.daysQty = daysQty;
        this.cost = cost;
        this.casa = casa;
        this.softDelete = false;
    }

    public int getDaysQty() {
        return daysQty;
    }

    public void setDaysQty(int daysQty) {
        this.daysQty = daysQty;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public int getId() {
        return id;
    }

    public boolean isSoftDelete() {
        return softDelete;
    }

    public void setSoftDelete(boolean softDelete) {
        this.softDelete = softDelete;
    }
    
    
    
}
