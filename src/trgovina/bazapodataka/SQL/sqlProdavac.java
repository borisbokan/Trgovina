/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka.SQL;

import java.sql.Timestamp;
import trgovina.model.pcg_prodavac.ProdavacFizickoLice;
import trgovina.model.pcg_prodavac.ProdavacPravnoLice;

/**
 *
 * @author borcha
 */
public class sqlProdavac {
    
      
    private static final String TABELA_tProdavac="tProdavac";
    private static final String tProdavac_id="id";
    private static final String tProdavac_prezime_ime_vlasnika="prezime_ime_vlasnika";
    private static final String tProdavac_ulica_broj="ulica_broj";
    private static final String tProdavac_mesto_organizacije="mesto_organizacije";
    private static final String tProdavac_broj_telefona_fiksni="broj_telefona_fiksni";
    private static final String tProdavac_broj_telefona_mobilni="broj_telefona_mobilni";
    private static final String tProdavac_broj_fax="broj_fax";
    private static final String tProdavac_mail_adresa1="mail_adresa1";
    private static final String tProdavac_mail_adresa2="mail_adresa2";
    private static final String tProdavac_tekuci_racun_dinarski1="tekuci_racun_dinarski1";
    private static final String tProdavac_tekuci_racun_dinarski2="tekuci_racun_dinarski2";
    private static final String tProdavac_tekuci_dacun_devizni1="tekuci_dacun_devizni1";
    private static final String tProdavac_tekuci_racun_devizni2="tekuci_racun_devizni2";
    private static final String tProdavac_dodatni_opis="dodatni_opis";
    private static final String tProdavac_jel_aktivan="jel_aktivan";
    private static final String tProdavac_geo_duzina="geo_duzina";
    private static final String tProdavac_geo_sirina="geo_sirina";
    private static final String tProdavac_naziv_organizacije="naziv_organizacije";
    private static final String tProdavac_tip_organizacije="tip_organizacije";
    private static final String tProdavac_delatnost="delatnost";
    private static final String tProdavac_pib="pib";
    private static final String tProdavac_pdv_broj="pdv_broj";
    private static final String tProdavac_maticni_broj="maticni_broj";
    private static final String tProdavac_datum_osnivanja="datum_osnivanja";
    private static final String tProdavac_jmbg_vlasnik="jmbg_vlasnik";
    private static final String tProdavac_datum_rodjenja="datum_rodjenja";
    private static final String tProdavac_broj_licne_karte="broj_licne_karte";
    private static final String tProdavac_mesto_izdavanja_lk="mesto_izdavanja_lk";
    private static final String tProdavac_pravno_fizicko="pravno_fizicko";
    
    
    private int id;
    private String prezime_ime_vlasnika;
    private String ulica_broj;
    private String mesto_organizacije;
    private String broj_telefona_fiksni;
    private String broj_telefona_mobilni;
    private String broj_fax;
    private String mail_adresa1;
    private String mail_adresa2;
    private String tekuci_racun_dinarski1;
    private String tekuci_racun_dinarski2;
    private String tekuci_dacun_devizni1;
    private String tekuci_racun_devizni2;
    private String dodatni_opis;
    private boolean jel_aktivan;
    private String geo_duzina;
    private String geo_sirina;
    private String naziv_organizacije;
    private String tip_organizacije;
    private String delatnost;
    private String pib;
    private String pdv_broj;
    private String maticni_broj;
    private String datum_osnivanja="0000-00-00 00:00:00";
    private String jmbg_vlasnik;
    private String datum_rodjenja="0000-00-00 00:00:00";
    private String broj_licne_karte;
    private String mesto_izdavanja_lk;
    private String pravno_fizicko;
    
    
    private ProdavacPravnoLice prodavacPravnoLice=new ProdavacPravnoLice();
    private ProdavacFizickoLice prodavacFizickoLice=new ProdavacFizickoLice();
    
    
    public sqlProdavac(){
        prodavacFizickoLice=null;
        prodavacPravnoLice=null;
    }
    
    
    public sqlProdavac(int _idProdavac){
            this.id=_idProdavac;
    }
    
    public sqlProdavac(ProdavacPravnoLice _prodavacPravnoLice){
        
        this.prodavacPravnoLice=_prodavacPravnoLice;
        this.pravno_fizicko="pravno";
        this.id=this.prodavacPravnoLice.getId();
        
            this.prezime_ime_vlasnika=this.prodavacPravnoLice.getPrezimeImeVlasnika();
            this.ulica_broj=this.prodavacPravnoLice.getUlicaBroj();
            this.mesto_organizacije=this.prodavacPravnoLice.getMestoOrganizacije();
            this.broj_telefona_fiksni=this.prodavacPravnoLice.getBrojTelefonaFiksni();
            this.broj_telefona_mobilni=this.prodavacPravnoLice.getBrojTelefonaMobilni();
            this.broj_fax=this.prodavacPravnoLice.getBrojFax();
            this.mail_adresa1=this.prodavacPravnoLice.getMailAdresa1();
            this.mail_adresa2=this.prodavacPravnoLice.getMailAdresa2();
            this.tekuci_racun_dinarski1=this.prodavacPravnoLice.getTekuciRacunDinarski1();
            this.tekuci_racun_dinarski2=this.prodavacPravnoLice.getTekuciRacunDinarski2();
            this.tekuci_dacun_devizni1=this.prodavacPravnoLice.getTekuciRacunDevizni1();
            this.tekuci_racun_devizni2=this.prodavacPravnoLice.getTekuciRacunDevizni2();
            this.dodatni_opis=this.prodavacPravnoLice.getDodatniOpis();
            this.jel_aktivan=this.prodavacPravnoLice.isJelAktivan();
            this.geo_duzina=this.prodavacPravnoLice.getGeoDuzinaLokacije();
            this.geo_sirina=this.prodavacPravnoLice.getGeoSirinaLokacije();
            this.naziv_organizacije=this.prodavacPravnoLice.getNazivOrganizacije();
            this.tip_organizacije=this.prodavacPravnoLice.getTipOrganizacije();
            this.delatnost=this.prodavacPravnoLice.getDelatnost();
            this.pib=this.prodavacPravnoLice.getPIB();
            this.pdv_broj=this.prodavacPravnoLice.getPdvBroj();
            this.maticni_broj=this.prodavacPravnoLice.getMaticniBroj();
            this.datum_osnivanja=this.prodavacPravnoLice.getDatumOsnivanja().toString();
           
        
    }
    
    
    public sqlProdavac(ProdavacFizickoLice _prodavacFizickoLice){
        this.prodavacFizickoLice=_prodavacFizickoLice;
        
        this.pravno_fizicko="fizicko";
        this.id=this.prodavacFizickoLice.getId();
               
        //Zajednicko sa pravnim licem
            this.prezime_ime_vlasnika=this.prodavacFizickoLice.getPrezimeImeVlasnika();
            this.ulica_broj=this.prodavacFizickoLice.getUlicaBroj();
            this.mesto_organizacije=this.prodavacFizickoLice.getMestoOrganizacije();
            this.broj_telefona_fiksni=this.prodavacFizickoLice.getBrojTelefonaFiksni();
            this.broj_telefona_mobilni=this.prodavacFizickoLice.getBrojTelefonaMobilni();
            this.broj_fax=this.prodavacFizickoLice.getBrojFax();
            this.mail_adresa1=this.prodavacFizickoLice.getMailAdresa1();
            this.mail_adresa2=this.prodavacFizickoLice.getMailAdresa2();
            this.tekuci_racun_dinarski1=this.prodavacFizickoLice.getTekuciRacunDinarski1();
            this.tekuci_racun_dinarski2=this.prodavacFizickoLice.getTekuciRacunDinarski2();
            this.tekuci_dacun_devizni1=this.prodavacFizickoLice.getTekuciRacunDevizni1();
            this.tekuci_racun_devizni2=this.prodavacFizickoLice.getTekuciRacunDevizni2();
            this.dodatni_opis=this.prodavacFizickoLice.getDodatniOpis();
            this.jel_aktivan=this.prodavacFizickoLice.isJelAktivan();
            this.geo_duzina=this.prodavacFizickoLice.getGeoDuzinaLokacije();
            this.geo_sirina=this.prodavacFizickoLice.getGeoSirinaLokacije();
                  
            //samo za fizicka lica
            this.jmbg_vlasnik=this.prodavacFizickoLice.getJmbgVlasnik();
            this.datum_rodjenja=this.prodavacFizickoLice.getDatumRodjenja().toString();
            this.broj_licne_karte=this.prodavacFizickoLice.getBrojLicneKarte();
            this.mesto_izdavanja_lk=this.prodavacFizickoLice.getMestoIzdavanjaLicKarte();
            
    }
    
        
    
    public String SQLInsert_prodavaca(){
         
        String sql="INSERT INTO " + this.TABELA_tProdavac + "("  +
             tProdavac_prezime_ime_vlasnika + "," +
             tProdavac_ulica_broj + "," +   
             tProdavac_mesto_organizacije   + "," +
             tProdavac_broj_telefona_fiksni   + "," +
             tProdavac_broj_telefona_mobilni   + "," +
             tProdavac_broj_fax   + "," +
             tProdavac_mail_adresa1   + "," +
             tProdavac_mail_adresa2   + "," +
             tProdavac_tekuci_racun_dinarski1   + "," +
             tProdavac_tekuci_racun_dinarski2   + "," +
             tProdavac_tekuci_dacun_devizni1   + "," +
             tProdavac_tekuci_racun_devizni2   + "," +
             tProdavac_dodatni_opis   + "," +
             tProdavac_jel_aktivan   + "," +
             tProdavac_geo_duzina   + "," +
             tProdavac_geo_sirina   + "," +
             tProdavac_naziv_organizacije   + "," +
             tProdavac_tip_organizacije  + "," +
             tProdavac_delatnost   + "," +
             tProdavac_pib   + "," +
             tProdavac_pdv_broj   + "," +
             tProdavac_maticni_broj   + "," +
             tProdavac_datum_osnivanja   + "," +
             tProdavac_jmbg_vlasnik   + "," +
             tProdavac_datum_rodjenja   + "," +
             tProdavac_broj_licne_karte   + "," +
             tProdavac_mesto_izdavanja_lk  + ") VALUE ('" + 
                
                this.prezime_ime_vlasnika + "','" +
                this.ulica_broj+ "','" +
                this.mesto_organizacije + "','" +
                this.broj_telefona_fiksni + "','" +
                this.broj_telefona_mobilni + "','" +
                this.broj_fax + "','" +
                this.mail_adresa1 + "','" +
                this.mail_adresa2 + "','" +
                this.tekuci_racun_dinarski1+ "','" +
                this.tekuci_racun_dinarski2+ "','" +
                this.tekuci_dacun_devizni1+ "','" +
                this.tekuci_racun_devizni2+ "','" +
                this.dodatni_opis+ "'," +
                this.jel_aktivan+ ",'" +
                this.geo_duzina + "','" +
                this.geo_sirina + "','" +
                this.naziv_organizacije+ "','" +
                this.tip_organizacije + "','" +
                this.delatnost + "','" +
                this.pib + "','" +
                this.pdv_broj + "','" +
                this.maticni_broj + "','" +
                this.datum_osnivanja + "','" +
                this.jmbg_vlasnik + "','" +
                this.datum_rodjenja + "','" +
                this.broj_licne_karte + "','" +
                this.mesto_izdavanja_lk + "')";
                
             return sql;
        
    }
    
    
    public String SQLUpdate_prodavac(){
        
        String sql="UPDATE " + TABELA_tProdavac + " SET " +
             tProdavac_prezime_ime_vlasnika + "='" + this.prezime_ime_vlasnika + "'," +
             tProdavac_ulica_broj + "='" +  this.ulica_broj + "'," +
             tProdavac_mesto_organizacije   + "='" + this.mesto_organizacije + "'," +
             tProdavac_broj_telefona_fiksni   + "='" + this.broj_telefona_fiksni + "'," +
             tProdavac_broj_telefona_mobilni   + "='" + this.broj_telefona_mobilni + "'," +
             tProdavac_broj_fax   + "='" + this.broj_fax + "'," +
             tProdavac_mail_adresa1   + "='" + this.mail_adresa1 + "'," +
             tProdavac_mail_adresa2   + "='" + this.mail_adresa2 + "'," +
             tProdavac_tekuci_racun_dinarski1   + "='" + this.tekuci_racun_dinarski1 + "'," +
             tProdavac_tekuci_racun_dinarski2   + "='" + this.tekuci_racun_dinarski2 + "'," +
             tProdavac_tekuci_dacun_devizni1   + "='" +this.tekuci_dacun_devizni1 + "'," +
             tProdavac_tekuci_racun_devizni2   + "='" + this.tekuci_racun_devizni2 + "'," +
             tProdavac_dodatni_opis   + "='" + this.dodatni_opis + "'," +
             tProdavac_jel_aktivan   + "=" + this.jel_aktivan + "," + 
             tProdavac_geo_duzina   + "='" + this.geo_duzina + "'," +
             tProdavac_geo_sirina   + "='" + this.geo_sirina + "'," +
             tProdavac_naziv_organizacije   + "='" + this.naziv_organizacije + "'," +
             tProdavac_tip_organizacije  + "='" + this.tip_organizacije + "'," +
             tProdavac_delatnost   + "='" + this.delatnost + "'," +
             tProdavac_pib   + "='" + this.pib + "'," +
             tProdavac_pdv_broj   + "='" + this.pdv_broj + "'," +
             tProdavac_maticni_broj   + "='" + maticni_broj + "'," +
             tProdavac_datum_osnivanja   + "='" + this.datum_osnivanja + "'," +
             tProdavac_jmbg_vlasnik   + "='" + this.jmbg_vlasnik + "'," +
             tProdavac_datum_rodjenja   + "='" + this.datum_rodjenja + "'," +
             tProdavac_broj_licne_karte   + "='" + this.broj_licne_karte + "'," +
             tProdavac_mesto_izdavanja_lk  + "='" + this.mesto_izdavanja_lk + "'" + 
                " WHERE " + this.tProdavac_id + " = " + this.id;
                
             return sql;
    }

    
    /**
     * 
     * @return 
     */
    public String SQLDelete_prodavac() {
       
        String sql="DELETE FROM " + TABELA_tProdavac + " WHERE " + tProdavac_id + "=" + this.id;
        return sql;
    }
        
    
    
}
