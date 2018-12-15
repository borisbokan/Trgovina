package trgovina.model.pcg_trgovac;

public class Trgovac {

    private int id;
    private boolean jelFilijala;
    private String PrezimeImeVlasnika;
    private String grad;
    private String UlicaBroj;
    private String MestoOrganizacije;
    private String BrojTelefonaFiksni;
    private String BrojTelefonaMobilni;
    private String BrojFax;
    private String MailAdresa1;
    private String MailAdresa2;
    private String TekuciRacunDinarski1;
    private String TekuciRacunDinarski2;
    private String TekuciRacunDevizni1;
    private String TekuciRacunDevizni2;
    private String DodatniOpis;
    private boolean jelAktivan;
    private String GeoDuzinaLokacije;
    private String GeoSirinaLokacije;
    private String WebStranica;


    public Trgovac() {
        this.id = 0;
        this.jelFilijala = false;
        this.PrezimeImeVlasnika = null;
        this.grad=null;
        this.UlicaBroj = null;
        this.MestoOrganizacije = null;
        this.BrojTelefonaFiksni = null;
        this.BrojTelefonaMobilni = null;
        this.BrojFax = null;
        this.MailAdresa1 = null;
        this.MailAdresa2 = null;
        this.TekuciRacunDinarski1 = null;
        this.TekuciRacunDinarski2 = null;
        this.TekuciRacunDevizni1 = null;
        this.TekuciRacunDevizni2 = null;
        this.DodatniOpis = null;
        this.jelAktivan = false;
        this.GeoDuzinaLokacije = null;
        this.GeoSirinaLokacije = null;
        this.WebStranica=null;
    }

    /**
     * @param id
     * @param prezimeImeVlasnika
     * @param ulicaBroj
     * @param grad
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
    public Trgovac(int id, String prezimeImeVlasnika,String grad, String ulicaBroj, String mestoOrganizacije, String brojTelefonaFiksni, String brojTelefonaMobilni, String brojFax, String mailAdresa1, String mailAdresa2, String tekuciRacunDinarski1, String tekuciRacunDinarski2, String tekuciRacunDevizni1, String tekuciRacunDevizni, String dodatniOpis, boolean jelAktivan, String geoDuzinaLokacije, String geoSirinaLokacije, String webStranica) {
        this.id = id;
        this.PrezimeImeVlasnika = prezimeImeVlasnika;
        this.UlicaBroj = ulicaBroj;
        this.grad=grad;
        this.MestoOrganizacije = mestoOrganizacije;
        this.BrojTelefonaFiksni = brojTelefonaFiksni;
        this.BrojTelefonaMobilni = brojTelefonaMobilni;
        this.BrojFax = brojFax;
        this.MailAdresa1 = mailAdresa1;
        this.MailAdresa2 = mailAdresa2;
        this.TekuciRacunDinarski1 = tekuciRacunDinarski1;
        this.TekuciRacunDinarski2 = tekuciRacunDinarski2;
        this.TekuciRacunDevizni1 = tekuciRacunDevizni1;
        this.TekuciRacunDevizni2 = tekuciRacunDevizni;
        this.DodatniOpis = dodatniOpis;
        this.jelAktivan = jelAktivan;
        this.GeoDuzinaLokacije = geoDuzinaLokacije;
        this.GeoSirinaLokacije = geoSirinaLokacije;
        this.WebStranica=webStranica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrezimeImeVlasnika() {
        return PrezimeImeVlasnika;
    }

    public void setPrezimeImeVlasnika(String prezimeImeVlasnika) {
        PrezimeImeVlasnika = prezimeImeVlasnika;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getUlicaBroj() {
        return UlicaBroj;
    }

    public void setUlicaBroj(String ulicaBroj) {
        UlicaBroj = ulicaBroj;
    }

    public String getMestoOrganizacije() {
        return MestoOrganizacije;
    }

    public void setMestoOrganizacije(String mestoOrganizacije) {
        MestoOrganizacije = mestoOrganizacije;
    }

    public String getBrojTelefonaFiksni() {
        return BrojTelefonaFiksni;
    }

    public void setBrojTelefonaFiksni(String brojTelefonaFiksni) {
        BrojTelefonaFiksni = brojTelefonaFiksni;
    }

    public String getBrojTelefonaMobilni() {
        return BrojTelefonaMobilni;
    }

    public void setBrojTelefonaMobilni(String brojTelefonaMobilni) {
        BrojTelefonaMobilni = brojTelefonaMobilni;
    }

    public String getBrojFax() {
        return BrojFax;
    }

    public void setBrojFax(String brojFax) {
        BrojFax = brojFax;
    }

    public String getMailAdresa1() {
        return MailAdresa1;
    }

    public void setMailAdresa1(String mailAdresa1) {
        MailAdresa1 = mailAdresa1;
    }

    public String getMailAdresa2() {
        return MailAdresa2;
    }

    public void setMailAdresa2(String mailAdresa2) {
        MailAdresa2 = mailAdresa2;
    }

    public String getTekuciRacunDinarski1() {
        return TekuciRacunDinarski1;
    }

    public void setTekuciRacunDinarski1(String tekuciRacunDinarski1) {
        TekuciRacunDinarski1 = tekuciRacunDinarski1;
    }

    public String getTekuciRacunDinarski2() {
        return TekuciRacunDinarski2;
    }

    public void setTekuciRacunDinarski2(String tekuciRacunDinarski2) {
        TekuciRacunDinarski2 = tekuciRacunDinarski2;
    }

    public String getTekuciRacunDevizni1() {
        return TekuciRacunDevizni1;
    }

    public void setTekuciRacunDevizni1(String tekuciRacunDevizni1) {
        TekuciRacunDevizni1 = tekuciRacunDevizni1;
    }

    public String getTekuciRacunDevizni2() {
        return TekuciRacunDevizni2;
    }

    public void setTekuciRacunDevizni2(String tekuciRacunDevizni2) {
        this.TekuciRacunDevizni2 = tekuciRacunDevizni2;
    }

    public String getDodatniOpis() {
        return DodatniOpis;
    }

    public void setDodatniOpis(String dodatniOpis) {
        DodatniOpis = dodatniOpis;
    }

    public boolean isJelAktivan() {
        return jelAktivan;
    }

    public void setJelAktivan(boolean jelAktivan) {
        this.jelAktivan = jelAktivan;
    }

    public String getGeoDuzinaLokacije() {
        return GeoDuzinaLokacije;
    }

    public void setGeoDuzinaLokacije(String geoDuzinaLokacije) {
        GeoDuzinaLokacije = geoDuzinaLokacije;
    }

    public String getGeoSirinaLokacije() {
        return GeoSirinaLokacije;
    }

    public void setGeoSirinaLokacije(String geoSirinaLokacije) {
        GeoSirinaLokacije = geoSirinaLokacije;
    }

    public String getWebStranica() {
        return WebStranica;
    }

    public void setWebStranica(String webStranica) {
        WebStranica = webStranica;
    }

    public boolean isJelFilijala() {
        return jelFilijala;
    }

    public void setJelFilijala(boolean jelFilijala) {
        this.jelFilijala = jelFilijala;
    }

    //Test
    public String toString() {
        return "Prezime,Ime: " + this.PrezimeImeVlasnika + " tel. " + this.BrojTelefonaFiksni;
    }
}
