/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.model.pcg_otpis;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author borcha
 */
public class Otpis {
    
    private String brojOtpisa;
    private Timestamp vreme;
    private String vremeString;
    private ArrayList<StavkaOtpisa> stavkeOtpisa;

    public Otpis() {
    }

    public Otpis(String brojOtpisa, Timestamp vreme, ArrayList<StavkaOtpisa> stavkeOtpisa) {
        this.brojOtpisa = brojOtpisa;
        this.vreme = vreme;
        this.stavkeOtpisa = stavkeOtpisa;
    }

    public String getBrojOtpisa() {
        return brojOtpisa;
    }

    public void setBrojOtpisa(String brojOtpisa) {
        this.brojOtpisa = brojOtpisa;
    }

    public Timestamp getVreme() {
        return vreme;
    }

    public void setVreme(Timestamp vreme) {
        this.vreme = vreme;
    }

    public ArrayList<StavkaOtpisa> getStavkeOtpisa() {
        return stavkeOtpisa;
    }

    public void setStavkeOtpisa(ArrayList<StavkaOtpisa> stavkeOtpisa) {
        this.stavkeOtpisa = stavkeOtpisa;
    }

    
    public void addStavkaOtpisa(StavkaOtpisa _stavka){
        this.stavkeOtpisa.add(_stavka);
    }
    
    
    public StavkaOtpisa getStavkaOtpisa(int _id){
        return this.stavkeOtpisa.get(_id);
    }
    
}
