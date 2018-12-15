package trgovina.bazapodataka.interfejsi;

import trgovina.model.pcg_artikal.Artikal;

import java.util.ArrayList;

public interface IArtikal {

    void UnosArtikla(Artikal artikal);

    void IspraviPodatkeArtikla(Artikal artikal);

    void ObrisiArtikal(Artikal artikal);

    void ObrisiArtikal(int idArtikal);

    ArrayList<Artikal> getArtikli();

    public Artikal getArtikal(int id);

    public Artikal getArtikal(Artikal artikal);

}
