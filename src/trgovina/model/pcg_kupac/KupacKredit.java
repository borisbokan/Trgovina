package trgovina.model.pcg_kupac;

import java.util.ArrayList;

public class KupacKredit {

    private int id;
    private Kupac kupac;
    private ArrayList<Uplata> uplate;
    private double trenutnoZaduzenje;

    /**
     * Model za prikaz podataka uplata kredita na konto za web prodaju ili nesto tako.
     *
     * @param id
     * @param kupac
     * @param uplate ArrayList<Uplata>
     */
    public KupacKredit(int id, Kupac kupac, ArrayList<Uplata> uplate) {
        this.id = id;
        this.kupac = kupac;
        this.uplate = uplate;

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

    public ArrayList<Uplata> getUplate() {
        return uplate;
    }

    public void setUplate(ArrayList<Uplata> uplate) {
        this.uplate = uplate;
    }


    public double SumaSvihUplata() {
        double suma = 0;
        for (Uplata stavka : this.getUplate()) {
            suma += stavka.getIznosUplate();
        }
        return suma;
    }
}
