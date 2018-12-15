package trgovina.model.pcg_fakturisanje;


import trgovina.model.pcg_kupac.KupacFizickoLice;
import trgovina.model.pcg_kupac.KupacPravnoLice;

import java.util.ArrayList;

public class ListaFakturaKupca {

    private KupacPravnoLice kupacPravnoLice;
    private KupacFizickoLice kupacFizickoLice;
    private ArrayList<Faktura> fakture;
    private double vrednostFakture;

    public ListaFakturaKupca() {
        this.kupacPravnoLice = null;
        this.kupacFizickoLice = null;
        this.fakture = null;
        this.vrednostFakture = 0;


    }

    /**
     * Lista faktura kupaca
     *
     * @param kupacPravnoLice
     * @param kupacFizickoLice
     * @param fakture
     * @param vrednostFakture
     */
    public ListaFakturaKupca(KupacPravnoLice kupacPravnoLice, KupacFizickoLice kupacFizickoLice, ArrayList<Faktura> fakture, double vrednostFakture) {
        this.kupacPravnoLice = kupacPravnoLice;
        this.kupacFizickoLice = kupacFizickoLice;
        this.fakture = fakture;
        this.vrednostFakture = vrednostFakture;

    }

    public KupacFizickoLice getKupacFizickoLice() {
        return kupacFizickoLice;
    }

    public void setKupacFizickoLice(KupacFizickoLice kupacFizickoLice) {
        this.kupacFizickoLice = kupacFizickoLice;
    }

    public KupacPravnoLice getKupacPravnoLice() {
        return kupacPravnoLice;
    }

    public void setKupacPravnoLice(KupacPravnoLice kupacPravnoLice) {
        this.kupacPravnoLice = kupacPravnoLice;
    }

    public ArrayList<Faktura> getFakture() {
        return fakture;
    }

    public void setFakture(ArrayList<Faktura> fakture) {
        this.fakture = fakture;
    }

    public double getVrednostFakture() {
        return vrednostFakture;
    }

    public void setVrednostFakture(double vrednostFakture) {
        this.vrednostFakture = vrednostFakture;
    }


    public double getUkupnaVrednostFaktura() {
        double vrednost = 0;
        for (Faktura stavka : getFakture()) {
            vrednost += stavka.getVrednostSaPdv();
        }

        return vrednost;
    }

}
