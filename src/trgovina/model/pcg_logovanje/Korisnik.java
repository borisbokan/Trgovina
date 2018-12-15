package trgovina.model.pcg_logovanje;

import java.sql.Timestamp;
import java.util.Date;

public class Korisnik {

    private int id;
    private String Prezime;
    private String Ime;
    private Date DatumRodjenja;
    private String DatumRodjenjaString;
    private Timestamp DatumRodjenjaTimeStamp;
    private String SlikaKorisnika;
    private String MailAdresa;
    private String KorisnickoIme;
    private String Sifra;
    private String Token;

    public Korisnik() {
        this.id = 0;
        this.Prezime = null;
        this.Ime = null;
        this.DatumRodjenjaString = null;
        this.DatumRodjenja = null;
        this.SlikaKorisnika = null;
        this.MailAdresa = null;
        this.KorisnickoIme = null;
        this.Sifra = null;
        this.Token = null;
        this.DatumRodjenjaTimeStamp = null;
    }

    public Korisnik(int id, String prezime, String ime, Date datumRodjenja, Timestamp datumTiemStamp, String datumString, String slikaKorisnika, String mailAdresa, String korisnickoIme, String sifra, String token) {
        this.id = id;
        this.Prezime = prezime;
        this.Ime = ime;
        this.DatumRodjenja = datumRodjenja;
        this.DatumRodjenjaString = datumString;
        this.DatumRodjenjaTimeStamp = datumTiemStamp;
        this.SlikaKorisnika = slikaKorisnika;
        this.MailAdresa = mailAdresa;
        this.KorisnickoIme = korisnickoIme;
        this.Sifra = sifra;
        this.Token = token;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrezime() {
        return Prezime;
    }

    public void setPrezime(String prezime) {
        Prezime = prezime;
    }

    public String getIme() {
        return Ime;
    }

    public void setIme(String ime) {
        Ime = ime;
    }

    public String getDatumRodjenjaString() {
        return DatumRodjenjaString;
    }

    public void setDatumRodjenjaString(String datumRodjenjaString) {
        DatumRodjenjaString = datumRodjenjaString;
    }

    public Date getDatumRodjenja() {
        return DatumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        DatumRodjenja = datumRodjenja;
    }

    public Timestamp getDatumRodjenjaTimeStamp() {
        return DatumRodjenjaTimeStamp;
    }

    public void setDatumRodjenjaTimeStamp(Timestamp datumRodjenjaTimeStamp) {
        DatumRodjenjaTimeStamp = datumRodjenjaTimeStamp;
    }

    public String getSlikaKorisnika() {
        return SlikaKorisnika;
    }

    public void setSlikaKorisnika(String slikaKorisnika) {
        SlikaKorisnika = slikaKorisnika;
    }

    public String getMailAdresa() {
        return MailAdresa;
    }

    public void setMailAdresa(String mailAdresa) {
        MailAdresa = mailAdresa;
    }

    public String getKorisnickoIme() {
        return KorisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        KorisnickoIme = korisnickoIme;
    }

    public String getSifra() {
        return Sifra;
    }

    public void setSifra(String sifra) {
        Sifra = sifra;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }
}
