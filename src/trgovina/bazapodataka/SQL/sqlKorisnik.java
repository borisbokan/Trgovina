package trgovina.bazapodataka.SQL;

import trgovina.model.pcg_logovanje.Korisnik;

public class sqlKorisnik {

    private int idKorisnik;
    private Korisnik korisnik = new Korisnik();


    //Tabela tKorisnik
    public static final String TABELA_tKorisnik = "tKorisnik";
    public static final String tKorisnik_tKorisnik_id = "id";
    public static final String tKorisnik_prezime = "prezime";
    public static final String tKorisnik_ime = "ime";
    public static final String tKorisnik_emailadresa = "email";
    public static final String tKorisnik_token = "token";
    public static final String tKorisnik_datumrodjenja = "datum_rodjenja";
    public static final String tKorisnik_korisnickoIme = "korisnicko_ime";
    public static final String tKorisnik_sifra = "sifra";
    public static final String tKorisnik_slikaKorisnika = "slika_korisnika";


    public sqlKorisnik(int id) {
        this.idKorisnik = id;
    }

    public sqlKorisnik(Korisnik _korisnik) {
        this.korisnik = _korisnik;
    }

    /**
     * Svi podaci korisnika, sva polja korisnika.
     */
    public static final String SQLUPIT_PodaciKorisnika = "SELECT " +
            tKorisnik_tKorisnik_id + "," +
            tKorisnik_prezime + "," +
            tKorisnik_ime + "," +
            tKorisnik_datumrodjenja + "," +
            tKorisnik_korisnickoIme + "," +
            tKorisnik_emailadresa + "," +
            tKorisnik_sifra + "," +
            tKorisnik_token + "," +
            tKorisnik_slikaKorisnika +
            " FROM " + TABELA_tKorisnik;


    public String SQLINSERT_PodaciKorisnika() {
        String upit = "INSERT INTO " + TABELA_tKorisnik + " (" +
                tKorisnik_prezime + "," +
                tKorisnik_ime + "," +
                tKorisnik_datumrodjenja + "," +
                tKorisnik_korisnickoIme + "," +
                tKorisnik_sifra + "," +
                tKorisnik_emailadresa + "," +
                tKorisnik_token + "," +
                tKorisnik_slikaKorisnika + ") " +
                "VALUE ('" +
                korisnik.getPrezime() + "','" +
                korisnik.getIme() + "','" +
                korisnik.getDatumRodjenjaTimeStamp () + "','" +
                korisnik.getKorisnickoIme() + "','" +
                korisnik.getSifra() + "','" +
                korisnik.getMailAdresa() + "','" +
                korisnik.getToken() + "','" +
                korisnik.getSlikaKorisnika() + "')";

        return upit;
    }

    /**
     * Brisanje korisnika upit
     *
     * @return String
     */
    public String SQLDELETE_PodaciKorisnika() {
        String upit = "DELETE FROM " + TABELA_tKorisnik + " WHERE " + tKorisnik_tKorisnik_id + "=" + this.idKorisnik;

        return upit;
    }


    /**
     * Ispravka podataka korisnika. Koristi se kroz objekat Korisnik gde se menja po kriterijumu  metodi getId korisnika.
     *
     * @return
     */
    public String SQLUPDATE_PodaciKorisnika() {
        String upit = "UPDATE " + TABELA_tKorisnik + " SET " +
                tKorisnik_prezime + "='" + this.korisnik.getPrezime() + "'," +
                tKorisnik_ime + "='" + this.korisnik.getIme() + "'," +
                tKorisnik_datumrodjenja + "='" + this.korisnik.getDatumRodjenjaString() + "'," +
                tKorisnik_korisnickoIme + "='" + this.korisnik.getKorisnickoIme() + "'," +
                tKorisnik_sifra + "='" + this.korisnik.getSifra() + "'," +
                tKorisnik_emailadresa + "='" + this.korisnik.getMailAdresa() + "'," +
                tKorisnik_token + "='" + this.korisnik.getToken() + "'," +
                tKorisnik_slikaKorisnika + "='" + this.korisnik.getSlikaKorisnika() +
                "' WHERE " + tKorisnik_tKorisnik_id + "=" + this.korisnik.getId();
        return upit;
    }

}
