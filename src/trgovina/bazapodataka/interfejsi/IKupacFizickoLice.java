package trgovina.bazapodataka.interfejsi;

import trgovina.model.pcg_kupac.KupacFizickoLice;

public interface IKupacFizickoLice {

    void SnimiKupcaFL(KupacFizickoLice _kupac);

    void IspraviKupcaFL(KupacFizickoLice _kupac);

    void ObrisiKupcaFL(KupacFizickoLice _kupac);

    KupacFizickoLice getKupacFizickoLice(KupacFizickoLice _kupac);

}
