package trgovina.model.pcg_kupac;

import java.util.Date;

public class Trosak {


    private double suma;
    private int id;
    private Date datumTroska;
    private Kupac kupac;
    private String opisTroska;

    /**
     * @param id
     * @param datumTroska
     * @param kupac
     * @param suma
     * @param opisTroska
     */

    public Trosak(int id, Date datumTroska, Kupac kupac, double suma, String opisTroska) {
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

    public Date getDatumTroska() {
        return datumTroska;
    }

    public void setDatumTroska(Date datumTroska) {
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
