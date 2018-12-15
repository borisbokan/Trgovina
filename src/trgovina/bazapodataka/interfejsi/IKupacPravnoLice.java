package trgovina.bazapodataka.interfejsi;

import trgovina.model.pcg_kupac.KupacPravnoLice;

public interface IKupacPravnoLice {

    void SnimiKupcaPL(KupacPravnoLice _kupac);

    void IspraviKupcaPL(KupacPravnoLice _kupac);

    void ObrisiKupcaPL(KupacPravnoLice _kupac);
    
    void ObrisiKupcaPL(int idKupac);

    KupacPravnoLice getKupacPravnoLice(KupacPravnoLice _kupac);


}
