package trgovina.model.pcg_kupac;

import java.util.Date;

public class Uplata {

    private int id;
    private Kupac kupac;
    private Date datumUplate;
    private double iznosUplate;

    /**
     * @param id
     * @param datumUplate
     * @param iznosUplate
     */
    public Uplata(int id, Date datumUplate, double iznosUplate) {
        this.id = id;
        this.datumUplate = datumUplate;
        this.iznosUplate = iznosUplate;
    }

    /**
     * Konstruktor sa kupcem
     *
     * @param id
     * @param kupac
     * @param datumUplate
     * @param iznosUplate
     */
    public Uplata(int id, Kupac kupac, Date datumUplate, double iznosUplate) {
        this.id = id;
        this.kupac = kupac;
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
}
