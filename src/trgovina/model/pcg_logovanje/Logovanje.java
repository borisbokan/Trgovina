/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.model.pcg_logovanje;

import java.sql.Timestamp;

/**
 *
 * @author borcha
 */
public class Logovanje {
    
    private int id;
    private int id_korisnik;
    private Timestamp vremeUlaska;
    private Timestamp vremeIzlaska;
    private String session_id;

    public Logovanje() {
    }

    public Logovanje(int id, int id_korisnik, Timestamp vremeUlaska, Timestamp vremeIzlaska, String session_id) {
        this.id = id;
        this.id_korisnik = id_korisnik;
        this.vremeUlaska = vremeUlaska;
        this.vremeIzlaska = vremeIzlaska;
        this.session_id = session_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_korisnik() {
        return id_korisnik;
    }

    public void setId_korisnik(int id_korisnik) {
        this.id_korisnik = id_korisnik;
    }

    public Timestamp getVremeUlaska() {
        return vremeUlaska;
    }

    public void setVremeUlaska(Timestamp vremeUlaska) {
        this.vremeUlaska = vremeUlaska;
    }

    public Timestamp getVremeIzlaska() {
        return vremeIzlaska;
    }

    public void setVremeIzlaska(Timestamp vremeIzlaska) {
        this.vremeIzlaska = vremeIzlaska;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }
    
  
    
}
