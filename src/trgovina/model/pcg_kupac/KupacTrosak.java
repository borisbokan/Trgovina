package trgovina.model.pcg_kupac;

import java.util.ArrayList;

public class KupacTrosak {

    private int id;
    private Kupac kupac;
    private ArrayList<Trosak> troskovi;
    private ArrayList<Uplata> uplate;
    private double trenutnoZaduzenje;

    /**
     * @param id
     * @param kupac
     * @param sviTroskovi
     * @param sveUplate
     */
    public KupacTrosak(int id, Kupac kupac, ArrayList<Trosak> sviTroskovi, ArrayList<Uplata> sveUplate) {
        this.id = id;
        this.kupac = kupac;
        this.troskovi = sviTroskovi;
        this.trenutnoZaduzenje = 0.00;
        this.uplate = sveUplate;

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

    public ArrayList<Trosak> getTrosak() {
        return troskovi;
    }

    public void setTrosak(ArrayList<Trosak> trosak) {
        this.troskovi = trosak;
    }

    public double getTrenutnoZaduzenje() {
        return trenutnoZaduzenje;
    }

    public void setTrenutnoZaduzenje(double trenutnoZaduzenje) {
        this.trenutnoZaduzenje = trenutnoZaduzenje;
    }

    public ArrayList<Uplata> getUplate() {
        return uplate;
    }

    public void setUplate(ArrayList<Uplata> uplate) {
        this.uplate = uplate;
    }

    public double sumaTroskova() {

        double sumaPotrosnje = 0.00;


        for (Trosak stavka : this.troskovi) {
            sumaPotrosnje += stavka.getSuma();
        }

        return sumaPotrosnje;


    }

    public double trenutnoStanje() {
        double sumaUplata = 0.00;
        double sumaPotrosnje = 0.00;
        double razlika = 0.00;

        for (Uplata stavka : this.uplate) {
            sumaUplata += stavka.getIznosUplate();

        }

        for (Trosak stavka : this.troskovi) {
            sumaPotrosnje += stavka.getSuma();
        }
        razlika = sumaUplata - sumaPotrosnje;

        return razlika;


    }
}
