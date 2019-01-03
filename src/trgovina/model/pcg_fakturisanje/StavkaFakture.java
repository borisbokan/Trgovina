/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.model.pcg_fakturisanje;

import java.sql.Timestamp;

/**
 *
 * @author borcha
 */
public class StavkaFakture {
     private int  id;
     private double pdv;
     private Timestamp datumIzdavanja;
     private Timestamp datumIzvrsenja;
     private int valuta;
     private double zateznaKamata;
     private int idArtikal;
     private int idKupac;
     private String brojFakture;
     private boolean jelNaOsnovuProfakture;
     private String brojProfakture;
     private int kolicina;

    public StavkaFakture() {
        
        this.pdv=0;
        this.datumIzdavanja=null;
        this.datumIzvrsenja=null;
        this.valuta=0;
        this.zateznaKamata=0;
        this.idArtikal=0;
        this.idKupac=0;
        this.brojFakture=null;
        this.jelNaOsnovuProfakture=false;
        this.brojProfakture=null;
        this.kolicina=0;
    }

    public StavkaFakture(int id, double pdv, Timestamp datumIzdavanja, Timestamp datumIzvrsenja, int valuta, double zateznaKamata, int idArtikal, int idKupac, String brojFakture, boolean jelNaOsnovuProfakture, String brojProfakture,int _kolicina) {
        this.id = id;
        this.pdv = pdv;
        this.datumIzdavanja = datumIzdavanja;
        this.datumIzvrsenja = datumIzvrsenja;
        this.valuta = valuta;
        this.zateznaKamata = zateznaKamata;
        this.idArtikal = idArtikal;
        this.idKupac = idKupac;
        this.brojFakture = brojFakture;
        this.jelNaOsnovuProfakture = jelNaOsnovuProfakture;
        this.brojProfakture = brojProfakture;
        this.kolicina=_kolicina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPdv() {
        return pdv;
    }

    public void setPdv(double pdv) {
        this.pdv = pdv;
    }

    public Timestamp getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(Timestamp datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }

    public Timestamp getDatumIzvrsenja() {
        return datumIzvrsenja;
    }

    public void setDatumIzvrsenja(Timestamp datumIzvrsenja) {
        this.datumIzvrsenja = datumIzvrsenja;
    }

    public int getValuta() {
        return valuta;
    }

    public void setValuta(int valuta) {
        this.valuta = valuta;
    }

    public double getZateznaKamata() {
        return zateznaKamata;
    }

    public void setZateznaKamata(double zateznaKamata) {
        this.zateznaKamata = zateznaKamata;
    }

    public int getIdArtikal() {
        return idArtikal;
    }

    public void setIdArtikal(int idArtikal) {
        this.idArtikal = idArtikal;
    }

    public int getIdKupac() {
        return idKupac;
    }

    public void setIdKupac(int idKupac) {
        this.idKupac = idKupac;
    }

    public String getBrojFakture() {
        return brojFakture;
    }

    public void setBrojFakture(String brojFakture) {
        this.brojFakture = brojFakture;
    }

    public boolean isJelNaOsnovuProfakture() {
        return jelNaOsnovuProfakture;
    }

    public void setJelNaOsnovuProfakture(boolean jelNaOsnovuProfakture) {
        this.jelNaOsnovuProfakture = jelNaOsnovuProfakture;
    }

    public String getBrojProfakture() {
        return brojProfakture;
    }

    public void setProfaktura(String brojProfakture) {
        this.brojProfakture = brojProfakture;
    }
    

        
    

   
     
     
     
}
