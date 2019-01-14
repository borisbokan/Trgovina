package trgovina.model.pcg_kupac;

import java.sql.Timestamp;

public class Trosak {


    private double suma;
    private int id;
    private Timestamp datumTroska;
    private Kupac kupac;
    private String opisTroska;

    
     public Trosak(Timestamp datumTroska, Kupac kupac, double suma, String opisTroska) {
        this.datumTroska = datumTroska;
        this.kupac = kupac;
        this.suma = suma;
        this.opisTroska = opisTroska;
    }
    
    /**
     * @param id
     * @param datumTroska
     * @param kupac
     * @param suma
     * @param opisTroska
     */

    public Trosak(int id, Timestamp datumTroska, Kupac kupac, double suma, String opisTroska) {
        this.id = id;
        this.datumTroska = datumTroska;
        this.kupac = kupac;
        this.suma = suma;
        this.opisTroska = opisTroska;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDatumTroska() {
        return datumTroska;
    }

    public void setDatumTroska(Timestamp datumTroska) {
        this.datumTroska = datumTroska;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public String getOpisTroska() {
        return opisTroska;
    }

    public void setOpisTroska(String opisTroska) {
        this.opisTroska = opisTroska;
    }
}
