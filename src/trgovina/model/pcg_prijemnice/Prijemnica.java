package trgovina.model.pcg_prijemnice;

import java.sql.Timestamp;
import trgovina.model.pcg_artikal.Artikal;
import trgovina.model.pcg_dobavljac.DobavljacFizickoLice;
import trgovina.model.pcg_dobavljac.DobavljacPravnoLice;
import trgovina.model.pcg_fakturisanje.Faktura;
import trgovina.model.pcg_fakturisanje.Racun;
import trgovina.model.pcg_kalkulacije.Pdv;
import trgovina.model.pcg_prodavac.ProdavacPravnoLice;

import java.util.ArrayList;
import java.util.Date;

public class Prijemnica extends Racun {

    private DobavljacPravnoLice dobavljacPravnoLice;
    private DobavljacFizickoLice dobavljacFizikoLice;
    private ProdavacPravnoLice prodavacPravnoLice;
    private Faktura faktura;
    
    public Prijemnica(){}
    
    /**
     * @param dobavljacPravnoLice
     * @param dobavljacFizikoLice
     * @param prodavacPravnoLice
     * @param faktura
     */
    public Prijemnica(DobavljacPravnoLice dobavljacPravnoLice, DobavljacFizickoLice dobavljacFizikoLice, ProdavacPravnoLice prodavacPravnoLice, Faktura faktura) {
        this.dobavljacPravnoLice = dobavljacPravnoLice;
        this.dobavljacFizikoLice = dobavljacFizikoLice;
        this.prodavacPravnoLice = prodavacPravnoLice;
        this.faktura = faktura;
    }

    /**
     * @param id
     * @param pdv
     * @param datumIzdavanja
     * @param datumIzvrsenja
     * @param valuta
     * @param zateznaKamata
     * @param artikli
     * @param dobavljacPravnoLice
     * @param dobavljacFizikoLice
     * @param prodavacPravnoLice
     * @param faktura
     */
    public Prijemnica(int id, Pdv pdv, Timestamp datumIzdavanja, Timestamp datumIzvrsenja, int valuta, double zateznaKamata, ArrayList<Artikal> artikli, DobavljacPravnoLice dobavljacPravnoLice, DobavljacFizickoLice dobavljacFizikoLice, ProdavacPravnoLice prodavacPravnoLice, Faktura faktura) {
        super(id, pdv, datumIzdavanja, datumIzvrsenja, valuta, zateznaKamata, artikli);
        this.dobavljacPravnoLice = dobavljacPravnoLice;
        this.dobavljacFizikoLice = dobavljacFizikoLice;
        this.prodavacPravnoLice = prodavacPravnoLice;
        this.faktura = faktura;
    }

    public DobavljacPravnoLice getDobavljacPravnoLice() {
        return dobavljacPravnoLice;
    }

    public void setDobavljacPravnoLice(DobavljacPravnoLice dobavljacPravnoLice) {
        this.dobavljacPravnoLice = dobavljacPravnoLice;
    }

    public ProdavacPravnoLice getProdavacPravnoLice() {
        return this.prodavacPravnoLice;
    }

    public void setProdavacPravnoLice(ProdavacPravnoLice prodavacPravnoLice) {
        this.prodavacPravnoLice = prodavacPravnoLice;
    }

    public DobavljacFizickoLice getDobavljacFizikoLice() {
        return dobavljacFizikoLice;
    }

    public void setDobavljacFizikoLice(DobavljacFizickoLice dobavljacFizikoLice) {
        this.dobavljacFizikoLice = dobavljacFizikoLice;
    }

    public Faktura getFaktura() {
        return faktura;
    }

    public void setFaktura(Faktura faktura) {
        this.faktura = faktura;
    }
}
