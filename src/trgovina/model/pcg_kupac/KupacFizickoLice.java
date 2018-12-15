package trgovina.model.pcg_kupac;

import java.sql.Timestamp;
import trgovina.model.pcg_trgovac.TrgovacFizickoLice;


public class KupacFizickoLice extends TrgovacFizickoLice {
    //Ima iste parametere tj podatke..ne ponavljati tj sve menjati u klasama trgovac


    public KupacFizickoLice() {
    }

    /**
     * @param jmbgVlasnik
     * @param datumRodjenja
     * @param brojLicneKarte
     * @param mestoIzdavanjaLicKarte
     */
    public KupacFizickoLice(String jmbgVlasnik, Timestamp datumRodjenja, String brojLicneKarte, String mestoIzdavanjaLicKarte) {
        super(jmbgVlasnik, datumRodjenja, brojLicneKarte, mestoIzdavanjaLicKarte);
    }

    /**
     * Parametri za kupac fizicko lice.
     *
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
    public KupacFizickoLice(int id, String prezimeImeVlasnika, String grad,String ulicaBroj, String mestoOrganizacije, String brojTelefonaFiksni, String brojTelefonaMobilni, String brojFax, String mailAdresa1, String mailAdresa2, String tekuciRacunDinarski1, String tekuciRacunDinarski2, String tekuciRacunDevizni1, String tekuciRacunDevizni, String dodatniOpis, boolean jelAktivan, String geoDuzinaLokacije, String geoSirinaLokacije, String jmbgVlasnik, Timestamp datumRodjenja, String brojLicneKarte, String mestoIzdavanjaLicKarte,String webStranica) {
        super(id, prezimeImeVlasnika, grad,ulicaBroj, mestoOrganizacije, brojTelefonaFiksni, brojTelefonaMobilni, brojFax, mailAdresa1, mailAdresa2, tekuciRacunDinarski1, tekuciRacunDinarski2, tekuciRacunDevizni1, tekuciRacunDevizni, dodatniOpis, jelAktivan, geoDuzinaLokacije, geoSirinaLokacije, jmbgVlasnik, datumRodjenja, brojLicneKarte, mestoIzdavanjaLicKarte,webStranica);
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

    @Override
    public void setBrojFax(String brojFax) {
        super.setBrojFax(brojFax);
    }

    @Override
    public String getMailAdresa1() {
        return super.getMailAdresa1();
    }

    @Override
    public void setMailAdresa1(String mailAdresa1) {
        super.setMailAdresa1(mailAdresa1);
    }

    @Override
    public String getMailAdresa2() {
        return super.getMailAdresa2();
    }

    @Override
    public void setMailAdresa2(String mailAdresa2) {
        super.setMailAdresa2(mailAdresa2);
    }

    @Override
    public String getTekuciRacunDinarski1() {
        return super.getTekuciRacunDinarski1();
    }

    @Override
    public void setTekuciRacunDinarski1(String tekuciRacunDinarski1) {
        super.setTekuciRacunDinarski1(tekuciRacunDinarski1);
    }

    @Override
    public String getTekuciRacunDinarski2() {
        return super.getTekuciRacunDinarski2();
    }

    @Override
    public void setTekuciRacunDinarski2(String tekuciRacunDinarski2) {
        super.setTekuciRacunDinarski2(tekuciRacunDinarski2);
    }

    @Override
    public String getTekuciRacunDevizni1() {
        return super.getTekuciRacunDevizni1();
    }

    @Override
    public void setTekuciRacunDevizni1(String tekuciRacunDevizni1) {
        super.setTekuciRacunDevizni1(tekuciRacunDevizni1);
    }

    @Override
    public String getTekuciRacunDevizni2() {
        return super.getTekuciRacunDevizni2();
    }

    @Override
    public void setTekuciRacunDevizni2(String tekuciRacunDevizni) {
        super.setTekuciRacunDevizni2(tekuciRacunDevizni);
    }

    @Override
    public String getDodatniOpis() {
        return super.getDodatniOpis();
    }

    @Override
    public void setDodatniOpis(String dodatniOpis) {
        super.setDodatniOpis(dodatniOpis);
    }

    @Override
    public boolean isJelAktivan() {
        return super.isJelAktivan();
    }

    @Override
    public void setJelAktivan(boolean jelAktivan) {
        super.setJelAktivan(jelAktivan);
    }

    @Override
    public String getGeoDuzinaLokacije() {
        return super.getGeoDuzinaLokacije();
    }

    @Override
    public void setGeoDuzinaLokacije(String geoDuzinaLokacije) {
        super.setGeoDuzinaLokacije(geoDuzinaLokacije);
    }

    @Override
    public String getGeoSirinaLokacije() {
        return super.getGeoSirinaLokacije();
    }

    @Override
    public void setGeoSirinaLokacije(String geoSirinaLokacije) {
        super.setGeoSirinaLokacije(geoSirinaLokacije);
    }

    @Override
    public String getWebStranica() {
        return super.getWebStranica();
    }

    @Override
    public void setWebStranica(String webStranica) {
        super.setWebStranica(webStranica);
    }

    @Override
    public boolean isJelFilijala() {
        return super.isJelFilijala();
    }

    @Override
    public void setJelFilijala(boolean jelFilijala) {
        super.setJelFilijala(jelFilijala);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
