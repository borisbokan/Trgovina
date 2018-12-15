package trgovina.model.pcg_prodavac;

import trgovina.model.pcg_trgovac.TrgovacFizickoLice;

import java.sql.Timestamp;
import java.util.Date;

public class ProdavacFizickoLice extends TrgovacFizickoLice {
    //Ima iste parametere tj podatke..ne ponavljati tj sve menjati u klasama trgovac


    public ProdavacFizickoLice() {
    }

    /**
     * @param jmbgVlasnik
     * @param datumRodjenja
     * @param brojLicneKarte
     * @param mestoIzdavanjaLicKarte
     */
    public ProdavacFizickoLice(String jmbgVlasnik, Timestamp datumRodjenja, String brojLicneKarte, String mestoIzdavanjaLicKarte) {
        super(jmbgVlasnik, datumRodjenja, brojLicneKarte, mestoIzdavanjaLicKarte);
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
    public ProdavacFizickoLice(int id, String prezimeImeVlasnika,String grad, String ulicaBroj, String mestoOrganizacije, String brojTelefonaFiksni, String brojTelefonaMobilni, String brojFax, String mailAdresa1, String mailAdresa2, String tekuciRacunDinarski1, String tekuciRacunDinarski2, String tekuciRacunDevizni1, String tekuciRacunDevizni, String dodatniOpis, boolean jelAktivan, String geoDuzinaLokacije, String geoSirinaLokacije, String jmbgVlasnik, Timestamp datumRodjenja, String brojLicneKarte, String mestoIzdavanjaLicKarte,String webStranica) {
        super(id, prezimeImeVlasnika,grad, ulicaBroj, mestoOrganizacije, brojTelefonaFiksni, brojTelefonaMobilni, brojFax, mailAdresa1, mailAdresa2, tekuciRacunDinarski1, tekuciRacunDinarski2, tekuciRacunDevizni1, tekuciRacunDevizni, dodatniOpis, jelAktivan, geoDuzinaLokacije, geoSirinaLokacije, jmbgVlasnik, datumRodjenja, brojLicneKarte, mestoIzdavanjaLicKarte,webStranica);
    }

    @Override
    public String getJmbgVlasnik() {
        return super.getJmbgVlasnik();
    }

    @Override
    public void setJmbgVlasnik(String jmbgVlasnik) {
        super.setJmbgVlasnik(jmbgVlasnik);
    }

    @Override
    public Timestamp getDatumRodjenja() {
        return super.getDatumRodjenja();
    }

    @Override
    public void setDatumRodjenja(Timestamp datumRodjenja) {
        super.setDatumRodjenja(datumRodjenja);
    }

    @Override
    public String getBrojLicneKarte() {
        return super.getBrojLicneKarte();
    }

    @Override
    public void setBrojLicneKarte(String brojLicneKarte) {
        super.setBrojLicneKarte(brojLicneKarte);
    }

    @Override
    public String getMestoIzdavanjaLicKarte() {
        return super.getMestoIzdavanjaLicKarte();
    }

    @Override
    public void setMestoIzdavanjaLicKarte(String mestoIzdavanjaLicKarte) {
        super.setMestoIzdavanjaLicKarte(mestoIzdavanjaLicKarte);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getPrezimeImeVlasnika() {
        return super.getPrezimeImeVlasnika();
    }

    @Override
    public void setPrezimeImeVlasnika(String prezimeImeVlasnika) {
        super.setPrezimeImeVlasnika(prezimeImeVlasnika);
    }

    @Override
    public String getUlicaBroj() {
        return super.getUlicaBroj();
    }

    @Override
    public void setUlicaBroj(String ulicaBroj) {
        super.setUlicaBroj(ulicaBroj);
    }

    @Override
    public String getMestoOrganizacije() {
        return super.getMestoOrganizacije();
    }

    @Override
    public void setMestoOrganizacije(String mestoOrganizacije) {
        super.setMestoOrganizacije(mestoOrganizacije);
    }

    @Override
    public String getBrojTelefonaFiksni() {
        return super.getBrojTelefonaFiksni();
    }

    @Override
    public void setBrojTelefonaFiksni(String brojTelefonaFiksni) {
        super.setBrojTelefonaFiksni(brojTelefonaFiksni);
    }

    @Override
    public String getBrojTelefonaMobilni() {
        return super.getBrojTelefonaMobilni();
    }

    @Override
    public void setBrojTelefonaMobilni(String brojTelefonaMobilni) {
        super.setBrojTelefonaMobilni(brojTelefonaMobilni);
    }

    @Override
    public String getBrojFax() {
        return super.getBrojFax();
    }
}
