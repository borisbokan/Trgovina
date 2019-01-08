/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.model.pcg_otpis;

import java.sql.Timestamp;
import trgovina.model.pcg_artikal.Artikal;

/**
 *
 * @author borcha
 */
public class StavkaOtpisa {
    
    private int id;
    private String brojOtpisa;
    private Artikal artikal;
    private int kolicina;
    private Timestamp vreme;
    private String vremeString;

    public StavkaOtpisa() {
    }

    public StavkaOtpisa(int id, String brojOtpisa, Artikal artikal, int kolicina, Timestamp vreme) {
        this.id = id;
        this.brojOtpisa = brojOtpisa;
        this.artikal = artikal;
        this.kolicina = kolicina;
        this.vreme = vreme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrojOtpisa() {
        return brojOtpisa;
    }

    public void setBrojOtpisa(String brojOtpisa) {
        this.brojOtpisa = brojOtpisa;
    }

    public Artikal getArtikal() {
        return artikal;
    }

    public void setArtikal(Artikal artikal) {
        this.artikal = artikal;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public Timestamp getVreme() {
        return vreme;
    }

    public void setVreme(Timestamp vreme) {
        this.vreme = vreme;
    }

    public String getVremeString() {
        return vremeString;
    }

    public void setVremeString(String vremeString) {
        this.vremeString = vremeString;
    }
    
    
    
    
    
    
    
}
