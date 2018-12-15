package trgovina.bazapodataka;

import trgovina.bazapodataka.interfejsi.IKorpa;
import trgovina.model.pcg_artikal.Artikal;
import trgovina.model.pcg_korpa.Korpa;
import trgovina.model.pcg_kupac.KupacFizickoLice;
import trgovina.model.pcg_kupac.KupacPravnoLice;

import java.util.ArrayList;

public class dbKorpa implements IKorpa {


    @Override
    public void SnimiKorpu(Korpa korpa) {

    }

    @Override
    public void IspraviKorpu(Korpa korpa) {

    }

    @Override
    public void ObrisiKorpu(Korpa korpa) {

    }

    @Override
    public ArrayList<Artikal> getSadrzajKorpe(String sifraPorudzbenice) {
        return null;
    }

    @Override
    public ArrayList<ArrayList<Artikal>> getSveKorpeKupcaPL(KupacPravnoLice kupacPL) {
        return null;
    }

    @Override
    public ArrayList<ArrayList<Artikal>> getSveKorpeKupcaFL(KupacFizickoLice kupacFL) {
        return null;
    }
}
