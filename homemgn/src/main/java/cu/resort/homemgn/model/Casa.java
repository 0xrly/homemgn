
package cu.resort.homemgn.model;


public class Casa {
    private int id;
    private int number;
    private int bedQty;
    private boolean hasPool;
    private int itemQty;
    private boolean softDelete;

    public Casa(int id,int number, int bedQty, boolean hasPool, int itemQty) {
        this.id = id;
        this.number = number;
        this.bedQty = bedQty;
        this.hasPool = hasPool;
        this.itemQty = itemQty;
        this.softDelete = false;
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
