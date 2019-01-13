package trgovina.model.pcg_kupac;

import java.util.Date;

public class Uplata {

    private int id;
    private Kupac kupac;
    private String opisUplate;    
    private Date datumUplate;
    private double iznosUplate;
    
    
    public Uplata(){}   
     /**
      * Konstruktor potreban ukoliko se setuje ID za brisanje iz baze podataka.
      * @param id 
      */
     public Uplata(int id){
         this.id=id;
     }
    
    public Uplata(Kupac kupac,String _opisUplate, Date datumUplate, double iznosUplate) {
        
        this.kupac = kupac;
        this.opisUplate=_opisUplate;
        this.datumUplate = datumUplate;
        this.iznosUplate = iznosUplate;
        this.kupac = kupac;
    }
    
    /**
     * Konstruktor sa kupcem (korisnikom) </br>
     * Koristi se u bazi i za korinika i kupca
     *
     * @param id
     * @param kupac
     * @param _opisUplate 
     * @param datumUplate
     * @param iznosUplate
     */
    public Uplata(int id, Kupac kupac,String _opisUplate, Date datumUplate, double iznosUplate) {
        this.id = id;
        this.kupac = kupac;
        this.opisUplate=_opisUplate;
        this.datumUplate = datumUplate;
        this.iznosUplate = iznosUplate;
        this.kupac = kupac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatumUplate() {
        return datumUplate;
    }

    public void setDatumUplate(Date datumUplate) {
        this.datumUplate = datumUplate;
    }

    public double getIznosUplate() {
        return iznosUplate;
    }

    public void setIznosUplate(double iznosUplate) {
        this.iznosUplate = iznosUplate;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public String getOpisUplate() {
        return opisUplate;
    }

    public void setOpisUplate(String opisUplate) {
        this.opisUplate = opisUplate;
    }
    
    
}
