
package cu.resort.homemgn.model;


public class ContratoEmpresa extends Contrato{
    private Empresa empresa;

    public ContratoEmpresa(int id,Empresa empresa, int daysQty, double cost, Casa casa) {
        super(id,daysQty, cost, casa);
        this.empresa = empresa;
    }
    
    
}
