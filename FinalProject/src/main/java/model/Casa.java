
package model;


public class Casa {
    private int number;
    private int bedQty;
    private boolean hasPool;
    private int itemQty;

    public Casa(int number, int bedQty, boolean hasPool, int itemQty) {
        this.number = number;
        this.bedQty = bedQty;
        this.hasPool = hasPool;
        this.itemQty = itemQty;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBedQty() {
        return bedQty;
    }

    public void setBedQty(int bedQty) {
        this.bedQty = bedQty;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public int getItemQty() {
        return itemQty;
    }

    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }
    
    
}
