package trgovina.bazapodataka.interfejsi;

import trgovina.model.pcg_artikal.Artikal;
import trgovina.model.pcg_korpa.Korpa;
import trgovina.model.pcg_kupac.KupacFizickoLice;
import trgovina.model.pcg_kupac.KupacPravnoLice;

import java.util.ArrayList;
import trgovina.model.pcg_korpa.StavkaPorudzbenice;

public interface IPorudzbenica {

    void SnimiPorudzbenicu(StavkaPorudzbenice stavkaPorudzbenice);
    
    void SnimiStavkePorudbzenice(ArrayList<StavkaPorudzbenice> stavkePorudbenice);

    void IspraviPorudzbenicu(StavkaPorudzbenice stavkaPorudzbenice);
    
    void IspraviPorudzbenicu(int id,StavkaPorudzbenice stavkaPorudzbenice);

    void ObrisiPorudzbenicu(StavkaPorudzbenice stavkaPorudzbenice);
    
    void ObrisiPorudzbenicu(int id);

    ArrayList<Artikal> getSadrzajPorudzbenice(String sifraPorudzbenice);

    

}
