package trgovina.bazapodataka.interfejsi;

import trgovina.model.pcg_artikal.Artikal;
import trgovina.model.pcg_korpa.Korpa;
import trgovina.model.pcg_kupac.KupacFizickoLice;
import trgovina.model.pcg_kupac.KupacPravnoLice;

import java.util.ArrayList;

public interface IKorpa {

    void SnimiKorpu(Korpa korpa);

    void IspraviKorpu(Korpa korpa);

    void ObrisiKorpu(Korpa korpa);

    ArrayList<Artikal> getSadrzajKorpe(String sifraPorudzbenice);

    ArrayList<ArrayList<Artikal>> getSveKorpeKupcaPL(KupacPravnoLice kupacPL);

    ArrayList<ArrayList<Artikal>> getSveKorpeKupcaFL(KupacFizickoLice kupacFL);

}
