package trgovina.model.pcg_fakturisanje;


import trgovina.model.pcg_artikal.Artikal;
import trgovina.model.pcg_kalkulacije.Pdv;
import trgovina.model.pcg_kupac.KupacPravnoLice;
import trgovina.model.pcg_prodavac.ProdavacPravnoLice;

import java.util.ArrayList;
import java.util.Date;

public class Profaktura extends Racun {


    private String BrojProfakture;
    private KupacPravnoLice kupacPravnoLice;
    private ProdavacPravnoLice prodavacPravnoLice;

    public Profaktura() {
        super();
    }

    /**
     * @param brojProfakture
     * @param kupacPravnoLice
     * @param prodavacPravnoLice
     */
    public Profaktura(String brojProfakture, KupacPravnoLice kupacPravnoLice, ProdavacPravnoLice prodavacPravnoLice) {
        this.BrojProfakture = brojProfakture;
        this.kupacPravnoLice = kupacPravnoLice;
        this.prodavacPravnoLice = prodavacPravnoLice;
    }

    /**
     * @param id
     * @param pdv
     * @param datumIzdavanja
     * @param datumIzvrsenja
     * @param valuta
     * @param zateznaKamata
     * @param artikli
     * @param brojProfakture
     * @param kupacPravnoLice
     * @param prodavacPravnoLice
     */
    public Profaktura(int id, Pdv pdv, Date datumIzdavanja, Date datumIzvrsenja, int valuta, double zateznaKamata, ArrayList<Artikal> artikli, String brojProfakture, KupacPravnoLice kupacPravnoLice, ProdavacPravnoLice prodavacPravnoLice) {
        super(id, pdv, datumIzdavanja, datumIzvrsenja, valuta, zateznaKamata, artikli);
        this.BrojProfakture = brojProfakture;
        this.kupacPravnoLice = kupacPravnoLice;
        this.prodavacPravnoLice = prodavacPravnoLice;
    }

    public String getBrojProfakture() {
        return BrojProfakture;
    }

    public void setBrojProfakture(String brojProfakture) {
        BrojProfakture = brojProfakture;
    }

    public KupacPravnoLice getKupacPravnoLice() {
        return kupacPravnoLice;
    }

    public void setKupacPravnoLice(KupacPravnoLice kupacPravnoLice) {
        this.kupacPravnoLice = kupacPravnoLice;
    }

    public ProdavacPravnoLice getProdavacPravnoLice() {
        return prodavacPravnoLice;
    }

    public void setProdavacPravnoLice(ProdavacPravnoLice prodavacPravnoLice) {
        this.prodavacPravnoLice = prodavacPravnoLice;
    }
}
