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
    
    private int id;
    private String tipPordzbenice;
    private String sifra_porudzbenice;
    private String kupacPravnoIliFizicko;
    private int id_artikal;
    private int kolicina;
    private Timestamp vremePorucivanja;

    public StavkaPorudzbenice() {
    }

    public StavkaPorudzbenice(int id, String tipPordzbenice, String sifra_porudzbenice, String kupacPravnoIliFizicko, int id_artikal, int kolicina,Timestamp vreme) {
        this.id = id;
        this.tipPordzbenice = tipPordzbenice;
        this.sifra_porudzbenice = sifra_porudzbenice;
        this.kupacPravnoIliFizicko = kupacPravnoIliFizicko;
        this.id_artikal = id_artikal;
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

    public String getKupacPravnoIliFizicko() {
        return kupacPravnoIliFizicko;
    }

    public void setKupacPravnoIliFizicko(String kupacPravnoIliFizicko) {
        this.kupacPravnoIliFizicko = kupacPravnoIliFizicko;
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
    
    
    
    
    
}
