
package model;


public class Trabajador {
    private String name;
    private String address;
    private String CI;

    public Trabajador(String name, String address, String CI) {
        this.name = name;
        this.address = address;
        this.CI = CI;
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
    
    
}
