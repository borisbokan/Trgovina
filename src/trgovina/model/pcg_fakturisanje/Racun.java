package trgovina.model.pcg_fakturisanje;

import trgovina.model.pcg_artikal.Artikal;
import trgovina.model.pcg_kalkulacije.Pdv;

import java.util.ArrayList;
import java.util.Date;

public class Racun {

    private int id;
    private Pdv pdv;
    private Date DatumIzdavanja;
    private Date DatumIzvrsenja;//Datum prometa tj prijema
    private int Valuta; //Broj dana do placanja fakture ili profakture
    private double zateznaKamata;//Ukoliko se kasni sa placanjem fakture(ne vazi i za profakturu)a na osnovu valute.
    private int BrojStavki;
    private double Vrednost;
    private double VrednostSaPdv;
    private double rabat;
    private ArrayList<Artikal> artikli;

    public Racun() {
        this.id = 0;
        this.pdv = null;

        this.DatumIzdavanja = null;
        this.DatumIzvrsenja = null;
        this.Valuta = 0;
        this.zateznaKamata = 0;
        this.artikli = null;
    }

    /**
     * @param id
     * @param pdv
     * @param datumIzdavanja
     * @param datumIzvrsenja
     * @param valuta
     * @param zateznaKamata
     * @param artikli
     */
    public Racun(int id, Pdv pdv, Date datumIzdavanja, Date datumIzvrsenja, int valuta, double zateznaKamata, ArrayList<Artikal> artikli) {
        this.id = id;
        this.pdv = pdv;
        this.DatumIzdavanja = datumIzdavanja;
        this.DatumIzvrsenja = datumIzvrsenja;
        this.Valuta = valuta;
        this.zateznaKamata = zateznaKamata;
        this.artikli = artikli;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pdv getPdv() {
        return pdv;
    }

    public void setPdv(Pdv pdv) {
        this.pdv = pdv;
    }


    public Date getDatumIzdavanja() {
        return DatumIzdavanja;
    }

    public void setDatumIzdavanja(Date datumIzdavanja) {
        DatumIzdavanja = datumIzdavanja;
    }

    public Date getDatumIzvrsenja() {
        return DatumIzvrsenja;
    }

    public void setDatumIzvrsenja(Date datumIzvrsenja) {
        DatumIzvrsenja = datumIzvrsenja;
    }

    public int getValuta() {
        return Valuta;
    }

    public void setValuta(int valuta) {
        Valuta = valuta;
    }

    public double getZateznaKamata() {
        return zateznaKamata;
    }

    public void setZateznaKamata(double zateznaKamata) {
        this.zateznaKamata = zateznaKamata;
    }

    public int getBrojStavki() {
        return BrojStavki;
    }

    public void setBrojStavki(int brojStavki) {
        BrojStavki = brojStavki;
    }

    public double getVrednost() {
        return Vrednost;
    }

    public void setVrednost(double vrednost) {
        Vrednost = vrednost;
    }

    public double getVrednostSaPdv() {
        return VrednostSaPdv;
    }

    public void setVrednostSaPdv(double vrednostSaPdv) {
        VrednostSaPdv = vrednostSaPdv;
    }

    public double getRabat() {
        return rabat;
    }

    public void setRabat(double rabat) {
        this.rabat = rabat;
    }

    public ArrayList<Artikal> getArtikli() {
        return artikli;
    }

    public void setArtikli(ArrayList<Artikal> artikli) {
        this.artikli = artikli;
    }

    public void dodajArtikal(Artikal artikal) {
        this.artikli.add(artikal);
    }

    public void dodajArtikal(int pozicija, Artikal artikal) {
        this.artikli.add(pozicija, artikal);
    }

    public void ukloniArtikal(int pozicija) {
        this.artikli.remove(pozicija);
    }

}
