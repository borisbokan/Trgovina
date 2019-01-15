/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.model.pcg_prijemnice;

import java.sql.Timestamp;

/**
 *
 * @author root
 */
public class StavkaPrijemnice {
               
        public   int   id;
        private  String  brojPrijemnice ; 
        private int idProdavac;
        private  int  idDobavljac ;
        private  int  idArtikal;
        private  double  visinaPdv;
        private  double  visinaRabat;
        private  double  nabavnaCena ;
        private int kolicina;
        private  Timestamp  datumPrijema ;

        /**
         * Prazan konstruktor
         */
        public StavkaPrijemnice(){
    
        }

        /**
         * 
         * @param id
         * @param brojPrijemnice
         * @param idProdavac
         * @param idDobavljac
         * @param idArtikal
         * @param visinaPdv
         * @param visinaRabat
         * @param nabavnaCena
         * @param kolicina
         * @param datumPrijema 
         */
    public StavkaPrijemnice(int id, String brojPrijemnice, int idProdavac, int idDobavljac, int idArtikal, double visinaPdv, double visinaRabat, double nabavnaCena, int kolicina, Timestamp datumPrijema) {
        this.id = id;
        this.brojPrijemnice = brojPrijemnice;
        this.idProdavac = idProdavac;
        this.idDobavljac = idDobavljac;
        this.idArtikal = idArtikal;
        this.visinaPdv = visinaPdv;
        this.visinaRabat = visinaRabat;
        this.nabavnaCena = nabavnaCena;
        this.kolicina = kolicina;
        this.datumPrijema = datumPrijema;
    }

      
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrojPrijemnice() {
        return brojPrijemnice;
    }

    public void setBrojPrijemnice(String brojPrijemnice) {
        this.brojPrijemnice = brojPrijemnice;
    }

    public int getIdDobavljac() {
        return idDobavljac;
    }

    public void setIdDobavljac(int idDobavljac) {
        this.idDobavljac = idDobavljac;
    }

    public int getIdArtikal() {
        return idArtikal;
    }

    public void setIdArtikal(int idArtikal) {
        this.idArtikal = idArtikal;
    }

    public double getVisinaPdv() {
        return visinaPdv;
    }

    public void setVisinaPdv(double visinaPdv) {
        this.visinaPdv = visinaPdv;
    }

    public double getVisinaRabat() {
        return visinaRabat;
    }

    public void setVisinaRabat(double visinaRabat) {
        this.visinaRabat = visinaRabat;
    }

    public double getNabavnaCena() {
        return nabavnaCena;
    }

    public void setNabavnaCena(double nabavnaCena) {
        this.nabavnaCena = nabavnaCena;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }
        
    
    
    public Timestamp getDatumPrijema() {
        return datumPrijema;
    }

    public void setDatumPrijema(Timestamp datumPrijema) {
        this.datumPrijema = datumPrijema;
    }

    public int getIdProdavac() {
        return idProdavac;
    }

    public void setIdProdavac(int idProdavac) {
        this.idProdavac = idProdavac;
    }
       
    

    
}
