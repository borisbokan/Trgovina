package trgovina.model.pcg_korpa;

import java.util.ArrayList;
import trgovina.model.pcg_artikal.Artikal;
import trgovina.model.pcg_trgovac.TrgovacFizickoLice;
import trgovina.model.pcg_trgovac.TrgovacPravnoLice;

/**
 * Korpa u sustini predstavlja porudzbenicu. Moze se prosiriti i napraviti po svojoj volji
 */
public class Korpa {
    private int id;
    private String TipPorudzbenice;//Predracun, Racun
    private String SifraPorudzbenice;
    private TrgovacPravnoLice kupacPravnoLice;
    private TrgovacFizickoLice kupacFizickoLice;
    private ArrayList<Artikal> poruceniArtikli;
    private int UkupnoArtikala;

    public Korpa() {
        this.id = 0;
        this.TipPorudzbenice = null;
        this.SifraPorudzbenice = null;
        this.kupacPravnoLice = null;
        this.kupacFizickoLice = null;
        this.poruceniArtikli = null;
        this.UkupnoArtikala = 0;
    }

    /**
     * @param id
     * @param tipPorudzbenice // Predracun ili racun
     * @param sifraPorudzbenice
     * @param kupacPravnoLice
     * @param kupacFizickoLice
     */
    public Korpa(int id, String tipPorudzbenice, String sifraPorudzbenice, TrgovacPravnoLice kupacPravnoLice, TrgovacFizickoLice kupacFizickoLice) {
        this.id = id;
        this.TipPorudzbenice = tipPorudzbenice;
        this.SifraPorudzbenice = sifraPorudzbenice;
        this.kupacPravnoLice = kupacPravnoLice;
        this.kupacFizickoLice = kupacFizickoLice;

    }

    /**
     * @param id
     * @param tipPorudzbenice
     * @param sifraPorudzbenice
     * @param kupacPravnoLice
     * @param kupacFizickoLice
     * @param poruceniArtikli
     */
    public Korpa(int id, String tipPorudzbenice, String sifraPorudzbenice, TrgovacPravnoLice kupacPravnoLice, TrgovacFizickoLice kupacFizickoLice, ArrayList<Artikal> poruceniArtikli) {
        this.id = id;
        this.TipPorudzbenice = tipPorudzbenice;
        this.SifraPorudzbenice = sifraPorudzbenice;
        this.kupacPravnoLice = kupacPravnoLice;
        this.kupacFizickoLice = kupacFizickoLice;
        this.poruceniArtikli = poruceniArtikli;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipPorudzbenice() {
        return TipPorudzbenice;
    }

    public void setTipPorudzbenice(String tipPorudzbenice) {
        TipPorudzbenice = tipPorudzbenice;
    }

    public String getSifraPorudzbenice() {
        return SifraPorudzbenice;
    }

    public void setSifraPorudzbenice(String sifraPorudzbenice) {
        SifraPorudzbenice = sifraPorudzbenice;
    }

    public TrgovacPravnoLice getKupacPravnoLice() {
        return kupacPravnoLice;
    }

    public void setKupacPravnoLice(TrgovacPravnoLice kupacPravnoLice) {
        this.kupacPravnoLice = kupacPravnoLice;
    }

    public TrgovacFizickoLice getKupacFizickoLice() {
        return kupacFizickoLice;
    }

    public void setKupacFizickoLice(TrgovacFizickoLice kupacFizickoLice) {
        this.kupacFizickoLice = kupacFizickoLice;
    }

    /**
     * Lista porucenih artikala
     * @return
     */
    public ArrayList<Artikal> getPoruceniArtikli() {
        return poruceniArtikli;
    }

    public void setPoruceniArtikli(ArrayList<Artikal> poruceniArtikli) {
        this.poruceniArtikli = poruceniArtikli;
    }

    public void dodajArtikal(Artikal _artikal) {
        this.poruceniArtikli.add(_artikal);
    }

    public int getUkupnoArtikala() {
        return UkupnoArtikala;
    }

    public void setUkupnoArtikala(int ukupnoArtikala) {
        UkupnoArtikala = ukupnoArtikala;
    }
}
