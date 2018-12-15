package trgovina.model.pcg_fakturisanje;

import trgovina.model.pcg_artikal.Artikal;
import trgovina.model.pcg_kalkulacije.Pdv;
import trgovina.model.pcg_kalkulacije.PdvKalkulator;
import trgovina.model.pcg_kupac.KupacPravnoLice;
import trgovina.model.pcg_prodavac.ProdavacPravnoLice;

import java.util.ArrayList;
import java.util.Date;

public class Faktura extends Racun {

    private KupacPravnoLice kupacPravnoLice;
    private ProdavacPravnoLice prodavacPravnoLice;
    private String BrojFakture;
    private boolean jelNaOsnovuProfakture;
    private Profaktura profaktura;
    private ArrayList<Artikal> artikli;

    public Faktura() {

    }

    /**
     * @param id
     * @param pdv
     * @param datumIzdavanja
     * @param datumIzvrsenja
     * @param valuta
     * @param zateznaKamata
     * @param artikli
     * @param kupacPravnoLice
     * @param prodavacPravnoLice
     * @param brojFakture
     * @param jelNaOsnovuProfakture
     * @param profaktura
     */
    public Faktura(int id, Pdv pdv, Date datumIzdavanja, Date datumIzvrsenja, int valuta, double zateznaKamata, ArrayList<Artikal> artikli, KupacPravnoLice kupacPravnoLice, ProdavacPravnoLice prodavacPravnoLice, String brojFakture, boolean jelNaOsnovuProfakture, Profaktura profaktura) {
        super(id, pdv, datumIzdavanja, datumIzvrsenja, valuta, zateznaKamata, artikli);
        this.kupacPravnoLice = kupacPravnoLice;
        this.prodavacPravnoLice = prodavacPravnoLice;
        this.BrojFakture = brojFakture;
        this.jelNaOsnovuProfakture = jelNaOsnovuProfakture;
        this.profaktura = profaktura;
        this.artikli = artikli;
    }

    public String getBrojFakture() {
        return BrojFakture;
    }

    public void setBrojFakture(String brojFakture) {
        BrojFakture = brojFakture;
    }

    public boolean jelNaOsnovuProfakture() {
        return this.jelNaOsnovuProfakture;
    }

    public boolean isJelNaOsnovuProfakture() {
        return jelNaOsnovuProfakture;
    }

    public void setJelNaOsnovuProfakture(boolean jelNaOsnovuProfakture) {
        this.jelNaOsnovuProfakture = jelNaOsnovuProfakture;
    }

    public Profaktura getProfakture() {
        return profaktura;
    }

    public void setBrojProfakture(Profaktura _profaktura) {
        this.profaktura = _profaktura;
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

    public Profaktura getProfaktura() {
        return profaktura;
    }

    public void setProfaktura(Profaktura profaktura) {
        this.profaktura = profaktura;
    }

    @Override
    public ArrayList<Artikal> getArtikli() {
        return artikli;
    }

    @Override
    public void setArtikli(ArrayList<Artikal> artikli) {
        this.artikli = artikli;
    }

    @Override
    public void dodajArtikal(Artikal artikal) {
        super.dodajArtikal(artikal);
    }

    @Override
    public void dodajArtikal(int pozicija, Artikal artikal) {
        super.dodajArtikal(pozicija, artikal);
    }

    @Override
    public void ukloniArtikal(int pozicija) {
        super.ukloniArtikal(pozicija);
    }

    public double getVrednostFakture() {
        double vrednost = 0;
        PdvKalkulator kalku = null;
        for (Artikal stavka : this.getArtikli()) {
            kalku = new PdvKalkulator(stavka.getCena() * stavka.getKolicina(), stavka.getVisinaPdv(), stavka.getPopust());
            kalku.Kalkulisi();
            vrednost += kalku.getSumaSaPdvRabat();

        }

        return vrednost;
    }
}
