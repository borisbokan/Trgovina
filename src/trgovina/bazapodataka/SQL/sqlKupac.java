/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka.SQL;

import trgovina.model.pcg_kupac.KupacFizickoLice;
import trgovina.model.pcg_kupac.KupacPravnoLice;

/**
 * @version 1.0
 * @author borcha - Bokan Boris (borisbokan@gmail.com)
 */
public class sqlKupac {
    //Kolone u bazi

    public static final String TABELA_tKupac = "tKupac";
    public static final String tKupac_id = "id";
    public static final String tKupac_prezimeImeVlasnika = "prezime_ime_vlasnika";
    public static final String tKupac_grad = "grad";
    public static final String tKupac_ulicaBroj = "ulica_broj";
    public static final String tKupac_mestoOrganizacije = "mesto_organizacije";
    public static final String tKupac_brojTelefonaFiksni = "broj_telefona_fiksni";
    public static final String tKupac_brojTelefonaMobilni = "broj_telefona_mobilni";
    public static final String tKupac_brojFax = "broj_faxa";
    public static final String tKupac_mailAdresa1 = "mail_adresa1";
    public static final String tKupac_mailAdresa2 = "mail_adresa2";
    public static final String tKupac_tekuciRacunDin1 = "tekuci_dinarski_racun1";
    public static final String tKupac_tekuciRacunDin2 = "tekuci_dinarski_racun2";
    public static final String tKupac_tekuciRacunDev1 = "tekuci_devizni_racun1";
    public static final String tKupac_tekuciRacunDev2 = "tekuci_devizni_racun2";
    public static final String tKupac_dodatniOpis = "dodatni_opis";
    public static final String tKupac_jelAktivan = "jel_aktivan";
    public static final String tKupac_geoDuzinaLokacije = "geo_duzina";
    public static final String tKupac_geoSirinaLokacije = "geo_sirina";
    //deo od fizickog lica
    public static final String tKupac_jmbgVlasnik = "jmbg_vlasnik";
    public static final String tKupac_datumRodjenja = "datum_rodjenja";
    public static final String tKupac_brojLicneKarte = "broj_licne_karte";
    public static final String tKupac_mestoIzdavanjaLk = "mesto_izdavanja_licKarte";
    public static final String tKupac_pravnoIliFizicko = "pravno_ili_fizicko";
    //deo od pravnog lica
    public static final String tKupac_nazivOrganizacije = "naziv_organizacije";
    public static final String tKupac_tipOrganizacije = "tip_organizacije";
    public static final String tKupac_delatnost = "delatnost";
    public static final String tKupac_pib = "pib";
    public static final String tKupac_pdvBroj = "pdv_broj";
    public static final String tKupac_maticniBroj = "maticni_broj";
    public static final String tKupac_datumOsnivanja = "datum_osnivanja";
    public static final String tKupac_jelFilijala="jel_filijala";
    
    
    private KupacPravnoLice kupacPravnoLice=new KupacPravnoLice ();
    private KupacFizickoLice kupacFizickoLice=new KupacFizickoLice ();
    
   
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
    private String DatumOsnivanja="0000-00-00 00:00:00";
    private String DatumRodjenja= "0000-00-00 00:00:00";
    private boolean jelFilijala;
    private int idKupac;
    
    
    
    public sqlKupac(){
        this.kupacPravnoLice=null;
        this.kupacFizickoLice=null;
    }

    public sqlKupac (int _idKupac) {
        this.idKupac=_idKupac;
        
    }
    
    /**
     *  Konstruktor za pravno lice
     * @param kupacPravnoLice 
     */
    public sqlKupac(KupacPravnoLice kupacPravnoLice){
        this.PravnoIliFizicko = "pravno";

        this.idKupac =kupacPravnoLice.getId ();
        this.kupacPravnoLice = kupacPravnoLice;
        
        this.ImeVlasnika = this.kupacPravnoLice.getPrezimeImeVlasnika ();
        this.Grad = this.kupacPravnoLice.getGrad ();
        this.UlicaBroj = this.kupacPravnoLice.getUlicaBroj ();
        this.NazivOrganizacije = this.kupacPravnoLice.getNazivOrganizacije ();
        this.TipOrganizacije = this.kupacPravnoLice.getTipOrganizacije ();
        this.MestoOrganizacije = this.kupacPravnoLice.getMestoOrganizacije ();
        this.Delatnost = this.kupacPravnoLice.getDelatnost ();
        this.PIB = this.kupacPravnoLice.getPIB ();
        this.PdvBroj = this.kupacPravnoLice.getPdvBroj ();
        this.MaticniBroj = this.kupacPravnoLice.getMaticniBroj ();
        this.DatumOsnivanja = this.kupacPravnoLice.getDatumOsnivanja ().toString ();
        this.BrojTelefonaFiksni = this.kupacPravnoLice.getBrojTelefonaFiksni ();
        this.BrojTelefonaMobilni = this.kupacPravnoLice.getBrojTelefonaMobilni ();
        this.BrojFax = this.kupacPravnoLice.getBrojFax ();
        this.MailAdresa1 = this.kupacPravnoLice.getMailAdresa1 ();
        this.MailAdresa2 = this.kupacPravnoLice.getMailAdresa2 ();
        this.TekuciRacunDinarski1 = this.kupacPravnoLice.getTekuciRacunDinarski1 ();
        this.TekuciRacunDinarski2 = this.kupacPravnoLice.getTekuciRacunDinarski2 ();
        this.TekuciRacunDevizni1 = this.kupacPravnoLice.getTekuciRacunDevizni1 ();
        this.TekuciRacunDevizni2 = this.kupacPravnoLice.getTekuciRacunDevizni2 ();
        this.DodatniOpis = this.kupacPravnoLice.getDodatniOpis ();
        this.isJelAktivan = this.kupacPravnoLice.isJelAktivan ();
        this.GeoDuzinaLokacije = this.kupacPravnoLice.getGeoDuzinaLokacije ();
        this.GeoSirinaLokacije = this.kupacPravnoLice.getGeoSirinaLokacije ();
        this.jelFilijala=this.kupacPravnoLice.isJelFilijala ();
       
    
    }
    
    /**
     * Konstruktor za fizicko lice
     * @param kupacFizickoLice 
     */
    public sqlKupac(KupacFizickoLice kupacFizickoLice){
        this.PravnoIliFizicko = "fizicko";

        this.idKupac = kupacFizickoLice.getId ();
        this.kupacFizickoLice = kupacFizickoLice;
        
        this.ImeVlasnika = this.kupacFizickoLice.getPrezimeImeVlasnika ();
        this.Grad = this.kupacFizickoLice.getGrad ();
        this.UlicaBroj = this.kupacFizickoLice.getUlicaBroj ();
        this.MestoOrganizacije = this.kupacFizickoLice.getMestoOrganizacije ();
        this.BrojTelefonaFiksni = this.kupacFizickoLice.getBrojTelefonaFiksni ();
        this.BrojTelefonaMobilni = this.kupacFizickoLice.getBrojTelefonaMobilni ();
        this.BrojFax = this.kupacFizickoLice.getBrojFax ();
        this.MailAdresa1 = this.kupacFizickoLice.getMailAdresa1 ();
        this.MailAdresa2 = this.kupacFizickoLice.getMailAdresa2 ();
        this.TekuciRacunDinarski1 = this.kupacFizickoLice.getTekuciRacunDinarski1 ();
        this.TekuciRacunDinarski2 = this.kupacFizickoLice.getTekuciRacunDinarski2 ();
        this.TekuciRacunDevizni1 = this.kupacFizickoLice.getTekuciRacunDevizni1 ();
        this.TekuciRacunDevizni2 = this.kupacFizickoLice.getTekuciRacunDevizni2 ();
        this.DodatniOpis = this.kupacFizickoLice.getDodatniOpis ();
        this.isJelAktivan = this.kupacFizickoLice.isJelAktivan ();
        this.GeoDuzinaLokacije = this.kupacFizickoLice.getGeoDuzinaLokacije ();
        this.GeoSirinaLokacije = this.kupacFizickoLice.getGeoSirinaLokacije ();
        
        //samo za fizicko lice
        this.Jmbg = this.kupacFizickoLice.getJmbgVlasnik ();
        this.BrojLicneKarte = this.kupacFizickoLice.getBrojLicneKarte ();
        this.MestoOrganizacije = this.kupacFizickoLice.getMestoOrganizacije ();
        this.MestoIzdavanjaLicKarte = this.kupacFizickoLice.getMestoIzdavanjaLicKarte ();
        this.DatumRodjenja = this.kupacFizickoLice.getDatumRodjenja ().toString ();
    }
    
   public String SQLInsert_SnimiKupca () {

        String upit = "INSERT INTO " + TABELA_tKupac + " ("
                + tKupac_prezimeImeVlasnika + ","
                + tKupac_grad + ","
                + tKupac_ulicaBroj + ","
                + tKupac_mestoOrganizacije + ","
                + tKupac_brojTelefonaFiksni + ","
                + tKupac_brojTelefonaMobilni + ","
                + tKupac_brojFax + ","
                + tKupac_mailAdresa1 + ","
                + tKupac_mailAdresa2 + ","
                + tKupac_tekuciRacunDin1 + ","
                + tKupac_tekuciRacunDin2 + ","
                + tKupac_tekuciRacunDev1 + ","
                + tKupac_tekuciRacunDev2 + ","
                + tKupac_dodatniOpis + ","
                + tKupac_jelAktivan + ","
                + tKupac_geoDuzinaLokacije + ","
                + tKupac_geoSirinaLokacije + ","
                + tKupac_jmbgVlasnik + ","
                + tKupac_datumRodjenja + ","
                + tKupac_brojLicneKarte + ","
                + tKupac_mestoIzdavanjaLk + ","
                + tKupac_pravnoIliFizicko + ","
                + tKupac_nazivOrganizacije + ","
                + tKupac_tipOrganizacije + ","
                + tKupac_delatnost + ","
                + tKupac_pib + ","
                + tKupac_pdvBroj + ","
                + tKupac_maticniBroj + ","
                + tKupac_datumOsnivanja   
                + tKupac_jelFilijala + ") VALUE ('" 
             
                    + ImeVlasnika + "','"
                    + Grad + "','"
                    + UlicaBroj + "','"
                    + MestoOrganizacije + "','"
                    + BrojTelefonaFiksni + "','"
                    + BrojTelefonaMobilni + "','"
                    + BrojFax + "','"
                    + MailAdresa1 + "','"
                    + MailAdresa2 + "','"
                    + TekuciRacunDinarski1 + "','"
                    + TekuciRacunDinarski2 + "','"
                    + TekuciRacunDevizni1 + "','"
                    + TekuciRacunDevizni2 + "','"
                    + DodatniOpis + "',"
                    + isJelAktivan + ",'"
                    + GeoDuzinaLokacije + "','"
                    + GeoSirinaLokacije + "','"
                    + Jmbg + "','"
                    + DatumRodjenja + "','"
                    + BrojLicneKarte + "','"
                    + MestoIzdavanjaLicKarte + "','"
                    + PravnoIliFizicko + "','"
                    + NazivOrganizacije + "','"
                    + TipOrganizacije + "','"
                    + Delatnost + "','"
                    + PIB + "','"
                    + PdvBroj + "','"
                    + MaticniBroj + "','"
                    + DatumOsnivanja+ "',"
                    +  jelFilijala + ")";

        return upit;

    }
    
    public String SQLUpdate_IspraviKupca () {

        String upit = "UPDATE " + TABELA_tKupac + " SET "
                + tKupac_prezimeImeVlasnika + "='" + ImeVlasnika + "',"
                + tKupac_grad + "='" + Grad + "',"
                + tKupac_ulicaBroj + "='" + UlicaBroj + "',"
                + tKupac_mestoOrganizacije + "='" + MestoOrganizacije + "',"
                + tKupac_brojTelefonaFiksni + "='" + BrojTelefonaFiksni + "',"
                + tKupac_brojTelefonaMobilni + "='" + BrojTelefonaMobilni + "',"
                + tKupac_brojFax + "='" + BrojFax + "',"
                + tKupac_mailAdresa1 + "='" + MailAdresa1 + "',"
                + tKupac_mailAdresa2 + "='" + MailAdresa2 + "',"
                + tKupac_tekuciRacunDin1 + "='" + TekuciRacunDinarski1 + "',"
                + tKupac_tekuciRacunDin2 + "='" + TekuciRacunDinarski2 + "',"
                + tKupac_tekuciRacunDev1 + "='" + TekuciRacunDevizni1 + "',"
                + tKupac_tekuciRacunDev2 + "='" + TekuciRacunDevizni2 + "',"
                + tKupac_dodatniOpis + "='" + DodatniOpis + "',"
                + tKupac_jelAktivan + "=" + isJelAktivan + ","
                + tKupac_geoDuzinaLokacije + "='" + GeoDuzinaLokacije + "',"
                + tKupac_geoSirinaLokacije + "='" + GeoSirinaLokacije + "',"
                + tKupac_jmbgVlasnik + "='" + Jmbg + "',"
                + tKupac_datumRodjenja + "='" + DatumRodjenja + "',"
                + tKupac_brojLicneKarte + "='" + BrojLicneKarte + "',"
                + tKupac_mestoIzdavanjaLk + "='" + MestoIzdavanjaLicKarte + "',"
                + tKupac_pravnoIliFizicko + "='" + PravnoIliFizicko + "',"
                + tKupac_nazivOrganizacije + "='" + NazivOrganizacije + "',"
                + tKupac_tipOrganizacije + "='" + TipOrganizacije + "',"
                + tKupac_delatnost + "='" + Delatnost + "',"
                + tKupac_pib + "='" + PIB + "',"
                + tKupac_pdvBroj + "='" + PdvBroj + "',"
                + tKupac_maticniBroj + "='" + MaticniBroj + "',"
                + tKupac_datumOsnivanja + "='" + DatumOsnivanja + "',"
                + tKupac_jelFilijala + "=" + jelFilijala 
                + " WHERE " + tKupac_id + " = " + idKupac;

        return upit;

    }

    /**
     * Brisanje kupca.
     * @return String
     */
    public String SQLDelete_ObrisiKupca () {

        String upit = "DELETE FROM " + TABELA_tKupac + " WHERE " + tKupac_id + " = " + idKupac;

        return upit;
    }
    
}
