package trgovina.bazapodataka;

import trgovina.bazapodataka.interfejsi.IPrijemnica;
import trgovina.model.pcg_dobavljac.DobavljacFizickoLice;
import trgovina.model.pcg_dobavljac.DobavljacPravnoLice;
import trgovina.model.pcg_fakturisanje.Faktura;
import trgovina.model.pcg_prijemnice.Prijemnica;
import trgovina.model.pcg_prodavac.ProdavacFizickoLice;
import trgovina.model.pcg_prodavac.ProdavacPravnoLice;

import java.util.ArrayList;

public class dbPrijemnica implements IPrijemnica {

    @Override
    public void SnimiPrijemnicu(Prijemnica prijemnica) {

    }

    @Override
    public void IspraviPrijemnicu(Prijemnica prijemnica) {

    }

    @Override
    public void ObrisiPrijemnicu(Prijemnica prijemnica) {

    }

    @Override
    public ArrayList<ArrayList<Prijemnica>> getPrijemniceOdPL(DobavljacPravnoLice _pravnoLice, ProdavacPravnoLice _prodavacPravnoLice, Faktura faktura) {
        return null;
    }

    @Override
    public ArrayList<ArrayList<Prijemnica>> getPrijemniceOdFL(DobavljacFizickoLice _pravnoLice, ProdavacFizickoLice _prodavacFizickoLice, Faktura faktura) {
        return null;
    }
}
