/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.model.pcg_korpa;

import java.sql.Timestamp;

/**
 *
 * @author borcha
 */
public class StavkaPorudzbenice {
    //TODO: Uraditi promene za ID prodavac u modelu
    private int id;
    private String tipPordzbenice;
    private String sifra_porudzbenice;
    private int id_kupac;
    private int id_artikal;
    private int kolicina;
    private Timestamp vremePorucivanja;

    public StavkaPorudzbenice() {
    }

    public StavkaPorudzbenice(int id, String tipPordzbenice, String sifra_porudzbenice, int idKupac, int idArtikal, int kolicina,Timestamp vreme) {
        this.id = id;
        this.tipPordzbenice = tipPordzbenice;
        this.sifra_porudzbenice = sifra_porudzbenice;
        this.id_kupac=idKupac;
        this.id_artikal = idArtikal;
        this.kolicina = kolicina;
        this.vremePorucivanja=vreme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipPordzbenice() {
        return tipPordzbenice;
    }

    public void setTipPordzbenice(String tipPordzbenice) {
        this.tipPordzbenice = tipPordzbenice;
    }

    public String getSifra_porudzbenice() {
        return sifra_porudzbenice;
    }

    public void setSifra_porudzbenice(String sifra_porudzbenice) {
        this.sifra_porudzbenice = sifra_porudzbenice;
    }
   

    public int getId_artikal() {
        return id_artikal;
    }

    public void setId_artikal(int id_artikal) {
        this.id_artikal = id_artikal;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public Timestamp getVremePorucivanja() {
        return vremePorucivanja;
    }

    public void setVremePorucivanja(Timestamp vremePorucivanja) {
        this.vremePorucivanja = vremePorucivanja;
    }

    public int getId_kupac() {
        return id_kupac;
    }

    public void setId_kupac(int id_kupac) {
        this.id_kupac = id_kupac;
    }
    
    
    
    
    
}
