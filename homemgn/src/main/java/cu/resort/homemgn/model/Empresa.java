
package cu.resort.homemgn.model;


public class Empresa {
    private int id;
    private String name;
    private String address;
    private String fax;
    private String email;
    private boolean softDelete;

    public Empresa(String name, String address, String fax, String email) {
        this.name = name;
        this.address = address;
        this.fax = fax;
        this.email = email;
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

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
