
package model;


public class ContratoEmpresa extends Contrato{
    private Empresa empresa;

    public ContratoEmpresa(Empresa empresa, int daysQty, double cost, Casa casa) {
        super(daysQty, cost, casa);
        this.empresa = empresa;
    }
    
    
}
