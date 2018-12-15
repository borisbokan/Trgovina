package trgovina.model.pcg_trgovac;

import java.sql.Timestamp;
import java.util.Date;

public class TrgovacFizickoLice extends Trgovac {

    private String JmbgVlasnik;
    private Timestamp DatumRodjenja;
    private String BrojLicneKarte;
    private String MestoIzdavanjaLicKarte;

    public TrgovacFizickoLice() {
    }

    /**
     * @param jmbgVlasnik
     * @param datumRodjenja
     * @param brojLicneKarte
     * @param mestoIzdavanjaLicKarte
     */
    public TrgovacFizickoLice(String jmbgVlasnik, Timestamp datumRodjenja, String brojLicneKarte, String mestoIzdavanjaLicKarte) {
        this.JmbgVlasnik = jmbgVlasnik;
        this.DatumRodjenja = datumRodjenja;
        this.BrojLicneKarte = brojLicneKarte;
        this.MestoIzdavanjaLicKarte = mestoIzdavanjaLicKarte;
    }

    /**
     * @param id
     * @param prezimeImeVlasnika
     * @param ulicaBroj
     * @param mestoOrganizacije
     * @param brojTelefonaFiksni
     * @param brojTelefonaMobilni
     * @param brojFax
     * @param mailAdresa1
     * @param mailAdresa2
     * @param tekuciRacunDinarski1
     * @param tekuciRacunDinarski2
     * @param tekuciRacunDevizni1
     * @param tekuciRacunDevizni
     * @param dodatniOpis
     * @param jelAktivan
     * @param geoDuzinaLokacije
     * @param geoSirinaLokacije
     * @param jmbgVlasnik
     * @param datumRodjenja
     * @param brojLicneKarte
     * @param mestoIzdavanjaLicKarte
     */
    public TrgovacFizickoLice(int id, String prezimeImeVlasnika, String grad,String ulicaBroj, String mestoOrganizacije, String brojTelefonaFiksni, String brojTelefonaMobilni, String brojFax, String mailAdresa1, String mailAdresa2, String tekuciRacunDinarski1, String tekuciRacunDinarski2, String tekuciRacunDevizni1, String tekuciRacunDevizni, String dodatniOpis, boolean jelAktivan, String geoDuzinaLokacije, String geoSirinaLokacije, String jmbgVlasnik, Timestamp datumRodjenja, String brojLicneKarte, String mestoIzdavanjaLicKarte,String webStranica) {
        super(id, prezimeImeVlasnika, grad,ulicaBroj, mestoOrganizacije, brojTelefonaFiksni, brojTelefonaMobilni, brojFax, mailAdresa1, mailAdresa2, tekuciRacunDinarski1, tekuciRacunDinarski2, tekuciRacunDevizni1, tekuciRacunDevizni, dodatniOpis, jelAktivan, geoDuzinaLokacije, geoSirinaLokacije,webStranica);
        this.JmbgVlasnik = jmbgVlasnik;
        this.DatumRodjenja = datumRodjenja;
        this.BrojLicneKarte = brojLicneKarte;
        this.MestoIzdavanjaLicKarte = mestoIzdavanjaLicKarte;
    }

    public String getJmbgVlasnik() {
        return JmbgVlasnik;
    }

    public void setJmbgVlasnik(String jmbgVlasnik) {
        JmbgVlasnik = jmbgVlasnik;
    }

    public Timestamp getDatumRodjenja() {
        return DatumRodjenja;
    }

    public void setDatumRodjenja(Timestamp datumRodjenja) {
        DatumRodjenja = datumRodjenja;
    }

    public String getBrojLicneKarte() {
        return BrojLicneKarte;
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
        BrojLicneKarte = brojLicneKarte;
    }

    public String getMestoIzdavanjaLicKarte() {
        return MestoIzdavanjaLicKarte;
    }

    public void setMestoIzdavanjaLicKarte(String mestoIzdavanjaLicKarte) {
        MestoIzdavanjaLicKarte = mestoIzdavanjaLicKarte;
    }
}
