package trgovina.model.pcg_prodavac;

import trgovina.model.pcg_trgovac.Trgovac;

public class Prodavac extends Trgovac {
    //Ima iste parametere tj podatke..ne ponavljati tj sve menjati u klasama trgovac

    public Prodavac() {
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
     */
    public Prodavac(int id, String prezimeImeVlasnika, String grad,String ulicaBroj, String mestoOrganizacije, String brojTelefonaFiksni, String brojTelefonaMobilni, String brojFax, String mailAdresa1, String mailAdresa2, String tekuciRacunDinarski1, String tekuciRacunDinarski2, String tekuciRacunDevizni1, String tekuciRacunDevizni, String dodatniOpis, boolean jelAktivan, String geoDuzinaLokacije, String geoSirinaLokacije,String webStranica) {
        super(id, prezimeImeVlasnika, grad,ulicaBroj, mestoOrganizacije, brojTelefonaFiksni, brojTelefonaMobilni, brojFax, mailAdresa1, mailAdresa2, tekuciRacunDinarski1, tekuciRacunDinarski2, tekuciRacunDevizni1, tekuciRacunDevizni, dodatniOpis, jelAktivan, geoDuzinaLokacije, geoSirinaLokacije,webStranica);
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
}
