package cu.resort.homemgn.controller;

import cu.resort.homemgn.model.Casa;
import java.util.List;
import java.util.Optional;

public class HouseController {

    private CadenaController cadenaController;

    public HouseController() {
        cadenaController = new CadenaController();
    }

    public Casa crear(int number, int bedQty, boolean hasPool, int itemQty) {
        List<Casa> casas = cadenaController.leer().getCasas();
        Casa casa = new Casa(casas.size(),number, bedQty, hasPool, itemQty);
        casas.add(casa);
        return casa;
    }

    public Optional<Casa> leer(int id) {
        List<Casa> casas= cadenaController.leer().getCasas();
        if (id < casas.size() && casas.get(id).isSoftDelete()) {
            return Optional.of(casas.get(id));
        }
        return Optional.empty();
    }

    public Optional<Casa> actualizar(int id,int number, int bedQty, boolean hasPool, int itemQty) {
        Optional<Casa> casaOpt = leer(id);
        if (casaOpt.isPresent()) {
            Casa casa = casaOpt.get();
            casa.setNumber(number);
            casa.setBedQty(bedQty);
            casa.setHasPool(hasPool);
            
        }
        return casaOpt;
    }

    public boolean remover(int id) {
        Optional<Casa> casaOpt = leer(id);
        if (casaOpt.isPresent()) {
            Casa casa = casaOpt.get();
            casa.setSoftDelete(true);
        }
        return casaOpt.isPresent();
    }

    public CadenaController getCadenaController() {
        return cadenaController;
    }

}
