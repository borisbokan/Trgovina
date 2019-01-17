/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.model.pcg_poruke;

import java.sql.Timestamp;
import trgovina.model.pcg_kupac.Kupac;
import trgovina.model.pcg_prodavac.Prodavac;

/**
 *
 * @author borcha
 */
public class Poruka {
    
    private int id;
    private Kupac kupac;
    private Prodavac prodavac;
    private String idDijalog;
    private String poruka;
    private Timestamp vremePoruke;

    public Poruka() {
    }
    
    

    public Poruka(int id, Kupac kupac, Prodavac prodavac, String idDijalog, String poruka, Timestamp vremePoruke) {
        this.id = id;
        this.kupac = kupac;
        this.prodavac = prodavac;
        this.idDijalog = idDijalog;
        this.poruka = poruka;
        this.vremePoruke = vremePoruke;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public Prodavac getProdavac() {
        return prodavac;
    }

    public void setProdavac(Prodavac prodavac) {
        this.prodavac = prodavac;
    }

    public String getIdDijalog() {
        return idDijalog;
    }

    public void setIdDijalog(String idDijalog) {
        this.idDijalog = idDijalog;
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }

    public Timestamp getVremePoruke() {
        return vremePoruke;
    }

    public void setVremePoruke(Timestamp vremePoruke) {
        this.vremePoruke = vremePoruke;
    }
    
    
    
    
    
    
    
}
