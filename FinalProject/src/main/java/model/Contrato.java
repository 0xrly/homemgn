
package model;


public class Contrato {
    protected int daysQty;
    protected double cost;
    protected Casa casa;

    public Contrato(int daysQty, double cost, Casa casa) {
        this.daysQty = daysQty;
        this.cost = cost;
        this.casa = casa;
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
    
}
