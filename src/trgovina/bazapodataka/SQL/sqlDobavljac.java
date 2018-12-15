
package trgovina.bazapodataka.SQL;

import trgovina.model.pcg_dobavljac.DobavljacFizickoLice;
import trgovina.model.pcg_dobavljac.DobavljacPravnoLice;

/**
 * @version 1.0
 * @author borcha - Bokan Boris (borisbokan@gmail.com)
 */
public class sqlDobavljac {


    //Kolone u bazi
    public static final String TABELA_tDobavljac = "tDobavljac";
    public static final String tDobavljac_id = "id";
    public static final String tDobavljac_prezimeImeVlasnika = "prezime_ime_vlasnika";
    public static final String tDobavljac_grad = "grad";
    public static final String tDobavljac_ulicaBroj = "ulica_broj";
    public static final String tDobavljac_mestoOrganizacije = "mesto_organizacije";
    public static final String tDobavljac_brojTelefonaFiksni = "broj_telefona_fiksni";
    public static final String tDobavljac_brojTelefonaMobilni = "broj_telefona_mobilni";
    public static final String tDobavljac_brojFax = "broj_fax";
    public static final String tDobavljac_mailAdresa1 = "mail_adresa1";
    public static final String tDobavljac_mailAdresa2 = "mail_adresa2";
    public static final String tDobavljac_tekuciRacunDin1 = "tekuci_racun_din1";
    public static final String tDobavljac_tekuciRacunDin2 = "tekuci_racun_din2";
    public static final String tDobavljac_tekuciRacunDev1 = "tekuci_racun_dev1";
    public static final String tDobavljac_tekuciRacunDev2 = "tekuci_racun_dev2";
    public static final String tDobavljac_dodatniOpis = "dodatni_opis";
    public static final String tDobavljac_jelAktivan = "jel_aktivan";
    public static final String tDobavljac_geoDuzinaLokacije = "geo_duzina_lokacije";
    public static final String tDobavljac_geoSirinaLokacije = "geo_sirina_lokacije";
    public static final String tDobavljac_webStranica="web_stranica";
    //deo od fizickog lica
    public static final String tDobavljac_jmbgVlasnik = "jmbg_vlasnik";
    public static final String tDobavljac_datumRodjenja = "datum_rodjenja";
    public static final String tDobavljac_brojLicneKarte = "brojLicne_karte";
    public static final String tDobavljac_mestoIzdavanjaLk = "mesto_izdavanja_lk";
    public static final String tDobavljac_pravnoIliFizicko = "pravno_ili_fizicko";
    //deo od pravnog lica
    public static final String tDobavljac_nazivOrganizacije = "naziv_organizacije";
    public static final String tDobavljac_tipOrganizacije = "tip_organizacije";
    public static final String tDobavljac_delatnost = "delatnost";
    public static final String tDobavljac_pib = "pib";
    public static final String tDobavljac_pdvBroj = "pdv_broj";
    public static final String tDobavljac_maticniBroj = "maticni_broj";
    public static final String tDobavljac_datumOsnivanja = "datum_osnivanja";



    private DobavljacPravnoLice dobavljacPravnoLice = new DobavljacPravnoLice();
    private DobavljacFizickoLice dobavljacFizickoLice = new DobavljacFizickoLice();

    private String tipDobavljaca = null;
    private String ImeVlasnika;
    private String Grad;
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
    private boolean isJelAktivan;
    private String GeoDuzinaLokacije;
    private String GeoSirinaLokacije;
    private String Jmbg;
    private String BrojLicneKarte;
    private String MestoIzdavanjaLicKarte;
    private String PravnoIliFizicko;
    private String NazivOrganizacije;
    private String TipOrganizacije;
    private String Delatnost;
    private String PIB;
    private String PdvBroj;
    private String MaticniBroj;
    private String DatumOsnivanja = "0000-00-00";
    private String DatumRodjenja = "0000-00-00";
    private int idDobavljac;
    private String WebStranica;


    public sqlDobavljac() {

        this.dobavljacPravnoLice = null;
        this.dobavljacFizickoLice = null;

    }

    public sqlDobavljac(int _idDobavljac) {
        this.idDobavljac = _idDobavljac;
    }
    public void setIdDobavljac(int idDobavljac) {
        this.idDobavljac = idDobavljac;
    }

    public sqlDobavljac(DobavljacPravnoLice _dobavljacPravnoLice) {

        this.PravnoIliFizicko = "pravno";

        this.idDobavljac = _dobavljacPravnoLice.getId();

        this.dobavljacPravnoLice = _dobavljacPravnoLice;
        this.ImeVlasnika = this.dobavljacPravnoLice.getPrezimeImeVlasnika();
        this.Grad=this.dobavljacPravnoLice.getGrad();
        this.UlicaBroj = this.dobavljacPravnoLice.getUlicaBroj();
        this.NazivOrganizacije = this.dobavljacPravnoLice.getNazivOrganizacije();
        this.TipOrganizacije = this.dobavljacPravnoLice.getTipOrganizacije();
        this.MestoOrganizacije = this.dobavljacPravnoLice.getMestoOrganizacije();
        this.Delatnost = this.dobavljacPravnoLice.getDelatnost();
        this.PIB = this.dobavljacPravnoLice.getPIB();
        this.PdvBroj = this.dobavljacPravnoLice.getPdvBroj();
        this.MaticniBroj = this.dobavljacPravnoLice.getMaticniBroj();
        this.DatumOsnivanja = this.dobavljacPravnoLice.getDatumOsnivanja().toString();//datum
        this.BrojTelefonaFiksni = this.dobavljacPravnoLice.getBrojTelefonaFiksni();
        this.BrojTelefonaMobilni = this.dobavljacPravnoLice.getBrojTelefonaMobilni();
        this.BrojFax = this.dobavljacPravnoLice.getBrojFax();
        this.MailAdresa1 = this.dobavljacPravnoLice.getMailAdresa1();
        this.MailAdresa2 = this.dobavljacPravnoLice.getMailAdresa2();
        this.TekuciRacunDinarski1 = this.dobavljacPravnoLice.getTekuciRacunDinarski1();
        this.TekuciRacunDinarski2 = this.dobavljacPravnoLice.getTekuciRacunDinarski2();
        this.TekuciRacunDevizni1 = this.dobavljacPravnoLice.getTekuciRacunDevizni1();
        this.TekuciRacunDevizni2 = this.dobavljacPravnoLice.getTekuciRacunDevizni2();
        this.DodatniOpis = this.dobavljacPravnoLice.getDodatniOpis();
        this.isJelAktivan = this.dobavljacPravnoLice.isJelAktivan();
        this.GeoDuzinaLokacije = this.dobavljacPravnoLice.getGeoDuzinaLokacije();
        this.GeoSirinaLokacije = this.dobavljacPravnoLice.getGeoSirinaLokacije();
        this.WebStranica=this.dobavljacPravnoLice.getWebStranica();

    }


    public sqlDobavljac(DobavljacFizickoLice _dobavljacFizickoLice) {

        this.dobavljacFizickoLice = _dobavljacFizickoLice;

        this.PravnoIliFizicko = "fizicko";
        this.idDobavljac = _dobavljacFizickoLice.getId();

        //zajednicko za pravno i fizicko lice
        this.ImeVlasnika = this.dobavljacFizickoLice.getPrezimeImeVlasnika();
        this.Grad = this.dobavljacFizickoLice.getGrad();
        this.UlicaBroj = this.dobavljacFizickoLice.getUlicaBroj();
        this.MestoOrganizacije = this.dobavljacFizickoLice.getMestoOrganizacije();
        this.BrojTelefonaFiksni = this.dobavljacFizickoLice.getBrojTelefonaFiksni();
        this.BrojTelefonaMobilni = this.dobavljacFizickoLice.getBrojTelefonaMobilni();
        this.BrojFax = this.dobavljacFizickoLice.getBrojFax();
        this.MailAdresa1 = this.dobavljacFizickoLice.getMailAdresa1();
        this.MailAdresa2 = this.dobavljacFizickoLice.getMailAdresa2();
        this.TekuciRacunDinarski1 = this.dobavljacFizickoLice.getTekuciRacunDinarski1();
        this.TekuciRacunDinarski2 = this.dobavljacFizickoLice.getTekuciRacunDinarski2();
        this.TekuciRacunDevizni1 = this.dobavljacFizickoLice.getTekuciRacunDevizni1();
        this.TekuciRacunDevizni2 = this.dobavljacFizickoLice.getTekuciRacunDevizni2();
        this.DodatniOpis = this.dobavljacFizickoLice.getDodatniOpis();
        this.isJelAktivan = this.dobavljacFizickoLice.isJelAktivan();
        this.GeoDuzinaLokacije = this.dobavljacFizickoLice.getGeoDuzinaLokacije();
        this.GeoSirinaLokacije = this.dobavljacFizickoLice.getGeoSirinaLokacije();
        this.WebStranica=this.dobavljacFizickoLice.getWebStranica();

        //samo za fizicko lice
        this.Jmbg = this.dobavljacFizickoLice.getJmbgVlasnik();
        this.BrojLicneKarte = this.dobavljacFizickoLice.getBrojLicneKarte();
        this.MestoOrganizacije = this.dobavljacFizickoLice.getMestoOrganizacije();
        this.MestoIzdavanjaLicKarte = this.dobavljacFizickoLice.getMestoIzdavanjaLicKarte();
        this.DatumRodjenja = this.dobavljacFizickoLice.getDatumRodjenja().toString(); //Datum


    }

    public String SQLInsert_SnimiDobavljaca() {


        String upit = "INSERT INTO " + TABELA_tDobavljac + " (" +
                tDobavljac_prezimeImeVlasnika + "," +
                tDobavljac_grad + "," +
                tDobavljac_ulicaBroj + "," +
                tDobavljac_mestoOrganizacije + "," +
                tDobavljac_brojTelefonaFiksni + "," +
                tDobavljac_brojTelefonaMobilni + "," +
                tDobavljac_brojFax + "," +
                tDobavljac_mailAdresa1 + "," +
                tDobavljac_mailAdresa2 + "," +
                tDobavljac_tekuciRacunDin1 + "," +
                tDobavljac_tekuciRacunDin2 + "," +
                tDobavljac_tekuciRacunDev1 + "," +
                tDobavljac_tekuciRacunDev2 + "," +
                tDobavljac_dodatniOpis + "," +
                tDobavljac_jelAktivan + "," +
                tDobavljac_geoDuzinaLokacije + "," +
                tDobavljac_geoSirinaLokacije + "," +
                tDobavljac_jmbgVlasnik + "," +
                tDobavljac_datumRodjenja + "," +
                tDobavljac_brojLicneKarte + "," +
                tDobavljac_mestoIzdavanjaLk + "," +
                tDobavljac_pravnoIliFizicko + "," +
                tDobavljac_nazivOrganizacije + "," +
                tDobavljac_tipOrganizacije + "," +
                tDobavljac_delatnost + "," +
                tDobavljac_pib + "," +
                tDobavljac_pdvBroj + "," +
                tDobavljac_maticniBroj + "," +
                tDobavljac_datumOsnivanja  + "," +
                tDobavljac_webStranica  + ") VALUE ('" +

                ImeVlasnika + "','" +
                Grad + "','" +
                UlicaBroj + "','" +
                MestoOrganizacije + "','" +
                BrojTelefonaFiksni + "','" +
                BrojTelefonaMobilni + "','" +
                BrojFax + "','" +
                MailAdresa1 + "','" +
                MailAdresa2 + "','" +
                TekuciRacunDinarski1 + "','" +
                TekuciRacunDinarski2 + "','" +
                TekuciRacunDevizni1 + "','" +
                TekuciRacunDevizni2 + "','" +
                DodatniOpis + "'," +
                isJelAktivan + ",'" +
                GeoDuzinaLokacije + "','" +
                GeoSirinaLokacije + "','" +
                Jmbg + "','" +
                DatumRodjenja + "','" +
                BrojLicneKarte + "','" +
                MestoIzdavanjaLicKarte + "','" +
                PravnoIliFizicko + "','" +
                NazivOrganizacije + "','" +
                TipOrganizacije + "','" +
                Delatnost + "','" +
                PIB + "','" +
                PdvBroj + "','" +
                MaticniBroj + "','" +
                DatumOsnivanja + "','" +
                WebStranica + "')";


        return upit;

    }

    /**
     * Sql upit za ispravku dobavljaca
     * @return String 
     */
    public String SQLUpdate_IspraviDobavljaca() {

        String upit = "UPDATE " + TABELA_tDobavljac + " SET " +
                tDobavljac_prezimeImeVlasnika + "='" + ImeVlasnika + "'," +
                tDobavljac_grad + "='" + Grad + "'," +
                tDobavljac_ulicaBroj + "='" + UlicaBroj + "'," +
                tDobavljac_mestoOrganizacije + "='" + MestoOrganizacije + "'," +
                tDobavljac_brojTelefonaFiksni + "='" + BrojTelefonaFiksni + "'," +
                tDobavljac_brojTelefonaMobilni + "='" + BrojTelefonaMobilni + "'," +
                tDobavljac_brojFax + "='" + BrojFax + "'," +
                tDobavljac_mailAdresa1 + "='" + MailAdresa1 + "'," +
                tDobavljac_mailAdresa2 + "='" + MailAdresa2 + "'," +
                tDobavljac_tekuciRacunDin1 + "='" + TekuciRacunDinarski1 + "'," +
                tDobavljac_tekuciRacunDin2 + "='" + TekuciRacunDinarski2 + "'," +
                tDobavljac_tekuciRacunDev1 + "='" + TekuciRacunDevizni1 + "'," +
                tDobavljac_tekuciRacunDev2 + "='" + TekuciRacunDevizni2 + "'," +
                tDobavljac_dodatniOpis + "='" + DodatniOpis + "'," +
                tDobavljac_jelAktivan + "=" + isJelAktivan + "," +
                tDobavljac_geoDuzinaLokacije + "='" + GeoDuzinaLokacije + "'," +
                tDobavljac_geoSirinaLokacije + "='" + GeoSirinaLokacije + "'," +
                tDobavljac_jmbgVlasnik + "='" + Jmbg + "'," +
                tDobavljac_datumRodjenja + "='" + DatumRodjenja+ "'," +
                tDobavljac_brojLicneKarte + "='" + BrojLicneKarte + "'," +
                tDobavljac_mestoIzdavanjaLk + "='" + MestoIzdavanjaLicKarte + "'," +
                tDobavljac_pravnoIliFizicko + "='" + PravnoIliFizicko + "'," +
                tDobavljac_nazivOrganizacije + "='" + NazivOrganizacije + "'," +
                tDobavljac_tipOrganizacije + "='" + TipOrganizacije + "'," +
                tDobavljac_delatnost + "='" + Delatnost + "'," +
                tDobavljac_pib + "='" + PIB + "'," +
                tDobavljac_pdvBroj + "='" + PdvBroj + "'," +
                tDobavljac_maticniBroj + "='" + MaticniBroj + "'," +
                tDobavljac_datumOsnivanja + "='" + DatumOsnivanja+ "'," +
                tDobavljac_webStranica + "='" + WebStranica  + "'" +
                    " WHERE " + tDobavljac_id + " = " + idDobavljac;

        return upit;

    }

    /**
     *  Sql upit za brisanje.
     * @return String
     */
    public String SQLDelete_ObrisiDobavljaca() {

        String upit = "DELETE FROM " + TABELA_tDobavljac + " WHERE " + tDobavljac_id + " = " + idDobavljac;

        return upit;
    }
}
