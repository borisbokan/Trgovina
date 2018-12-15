package trgovina.bazapodataka.interfejsi;

import trgovina.model.pcg_logovanje.Korisnik;

import java.util.ArrayList;

public interface IKorisnik {

    public void SnimiKorisnika(Korisnik korisnik);

    public void IspraviKOrisnika(Korisnik korisnik);

    public void ObrisiKorisnika(Korisnik korisnik);

    public void ObrisiKorisnika(int id);


    //Upiti ka dbKorisnik
    public ArrayList<Korisnik> sviKorisnici();

    public Korisnik getKorisnik(int id);


}
