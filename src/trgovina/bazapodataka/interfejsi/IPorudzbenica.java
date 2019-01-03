package trgovina.bazapodataka.interfejsi;

import trgovina.model.pcg_artikal.Artikal;
import trgovina.model.pcg_korpa.Korpa;
import trgovina.model.pcg_kupac.KupacFizickoLice;
import trgovina.model.pcg_kupac.KupacPravnoLice;

import java.util.ArrayList;
import trgovina.model.pcg_korpa.StavkaPorudzbenice;

public interface IPorudzbenica {

    void SnimiPorudbenicu(StavkaPorudzbenice stavkaPorudzbenice);

    void IspraviPorudbenicu(StavkaPorudzbenice stavkaPorudzbenice);
    
    void IspraviPorudbenicu(int id,StavkaPorudzbenice stavkaPorudzbenice);

    void ObrisiPorudbenicu(StavkaPorudzbenice stavkaPorudzbenice);
    
    void ObrisiPorudbenicu(int id);

    ArrayList<Artikal> getSadrzajPorudbenice(String sifraPorudzbenice);

    

}
