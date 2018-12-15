package trgovina.bazapodataka.interfejsi;

import trgovina.model.pcg_dobavljac.DobavljacFizickoLice;
import trgovina.model.pcg_dobavljac.DobavljacPravnoLice;
import trgovina.model.pcg_fakturisanje.Faktura;
import trgovina.model.pcg_prijemnice.Prijemnica;
import trgovina.model.pcg_prodavac.ProdavacFizickoLice;
import trgovina.model.pcg_prodavac.ProdavacPravnoLice;

import java.util.ArrayList;

public interface IPrijemnica {

    void SnimiPrijemnicu(Prijemnica prijemnica);

    void IspraviPrijemnicu(Prijemnica prijemnica);

    void ObrisiPrijemnicu(Prijemnica prijemnica);

    ArrayList<ArrayList<Prijemnica>> getPrijemniceOdPL(DobavljacPravnoLice _pravnoLice, ProdavacPravnoLice _prodavacPravnoLice, Faktura faktura);

    ArrayList<ArrayList<Prijemnica>> getPrijemniceOdFL(DobavljacFizickoLice _pravnoLice, ProdavacFizickoLice _prodavacFizickoLice, Faktura faktura);


}
