package trgovina.model.pcg_fakturisanje;

import trgovina.model.pcg_kupac.KupacFizickoLice;
import trgovina.model.pcg_kupac.KupacPravnoLice;

import java.util.ArrayList;

public class ListaProfakturaKupca {
    private KupacPravnoLice kupacPravnoLice;
    private KupacFizickoLice kupacFizickoLice;
    private ArrayList<Profaktura> profakture;
    private double vrednostFakture;
    private double vrednostSaPdv;

    public ListaProfakturaKupca() {
        this.kupacPravnoLice = null;
        this.kupacFizickoLice = null;
        this.profakture = null;
        this.vrednostFakture = 0;
        this.vrednostSaPdv = 0;
    }

    /**
     * Lista profaktura kupca
     *
     * @param kupacPravnoLice
     * @param kupacFizickoLice
     * @param profakture
     * @param vrednostFakture
     * @param vrednostSaPdv
     */
    public ListaProfakturaKupca(KupacPravnoLice kupacPravnoLice, KupacFizickoLice kupacFizickoLice, ArrayList<Profaktura> profakture, double vrednostFakture, double vrednostSaPdv) {
        this.kupacPravnoLice = kupacPravnoLice;
        this.kupacFizickoLice = kupacFizickoLice;
        this.profakture = profakture;
        this.vrednostFakture = vrednostFakture;
        this.vrednostSaPdv = vrednostSaPdv;
    }

    public KupacPravnoLice getKupacPravnoLice() {
        return kupacPravnoLice;
    }

    public void setKupacPravnoLice(KupacPravnoLice kupacPravnoLice) {
        this.kupacPravnoLice = kupacPravnoLice;
    }

    public KupacFizickoLice getKupacFizickoLice() {
        return kupacFizickoLice;
    }

    public void setKupacFizickoLice(KupacFizickoLice kupacFizickoLice) {
        this.kupacFizickoLice = kupacFizickoLice;
    }

    public ArrayList<Profaktura> getProfakture() {
        return profakture;
    }

    public void setProfakture(ArrayList<Profaktura> profakture) {
        this.profakture = profakture;
    }

    public double getVrednostFakture() {
        return vrednostFakture;
    }

    public void setVrednostFakture(double vrednostFakture) {
        this.vrednostFakture = vrednostFakture;
    }

    public double getVrednostSaPdv() {
        return vrednostSaPdv;
    }

    public void setVrednostSaPdv(double vrednostSaPdv) {
        this.vrednostSaPdv = vrednostSaPdv;
    }
}
