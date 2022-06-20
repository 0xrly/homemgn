
package cu.resort.homemgn.model;


public class Trabajador {
    private int id;
    private String name;
    private String address;
    private String CI;
    private boolean softDelete;

    public Trabajador(int id,String name, String address, String CI) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.CI = CI;
        this.softDelete = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
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
