package trgovina.bazapodataka.interfejsi;


import trgovina.model.pcg_prodavac.ProdavacPravnoLice;

import java.util.ArrayList;

public interface IProdavacPravnoLice {
    void SnimiProdavacPL(ProdavacPravnoLice _prodavac);

    void IspraviProdavacPL(ProdavacPravnoLice _prodavac);

    void ObrisiProdavacPL(ProdavacPravnoLice _prodavac);

    ProdavacPravnoLice getProdavacaPravnooLice(ProdavacPravnoLice _prodavac);

    ArrayList<ProdavacPravnoLice> getProdavciPL();

}
