package trgovina.bazapodataka.interfejsi;


import trgovina.model.pcg_prodavac.ProdavacFizickoLice;

import java.util.ArrayList;

public interface IProdavacFizickoLice {
    void SnimiProdavacFL(ProdavacFizickoLice _prodavac);

    void IspraviProdavacFL(ProdavacFizickoLice _prodavac);

    void ObrisiProdavacFL(ProdavacFizickoLice _prodavac);
    
    void ObrisiProdavacFL(int id);

    ProdavacFizickoLice getProdavacFizickoLice(ProdavacFizickoLice _prodavac);

    ArrayList<ProdavacFizickoLice> getProdavciFL();


}
