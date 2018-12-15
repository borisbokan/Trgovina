package trgovina.model.pcg_kalkulacije;

import trgovina.model.pcg_artikal.Artikal;

import java.util.Date;

public class KalkulacijaNabavneCene {

    private int id;
    private Date datumKalkulacije;
    private double dodatniTroskovi;
    private PdvKalkulator.Marza marzaObj;
    private double marza;
    private Pdv pdvObj;
    private double pdv;
    private double rabat;
    private Artikal artikal;

    private double SumaSaMarzom;
    private double SumaOdMarze;
    private double SumaSaPdv;
    private double SumaOdPdv;//Samo suma tj iznos pdv
    private double SumaSaRabati;
    private double SumaOdRabat;//Samo suma tj iznos rabati od sume.

    public KalkulacijaNabavneCene() {
        this.id = 0;
        this.datumKalkulacije = null;
        this.dodatniTroskovi = 0;
        this.marzaObj = null;
        this.pdvObj = null;
        this.rabat = 0;
        this.pdv = 0;
        this.artikal = null;
    }

    /**
     * @param id
     * @param artikal
     * @param datumKalkulacije
     * @param dodatniTroskovi
     * @param marza
     * @param pdv
     * @param rabat            - Dobijen rabat od dobavljaca
     */
    public KalkulacijaNabavneCene(int id, Artikal artikal, Date datumKalkulacije, double dodatniTroskovi, PdvKalkulator.Marza marza, Pdv pdv, double rabat) {
        this.id = id;
        this.datumKalkulacije = datumKalkulacije;
        this.dodatniTroskovi = dodatniTroskovi;
        this.marzaObj = marza;
        this.pdvObj = pdv;
        this.rabat = rabat;
        this.artikal = artikal;
    }

    /**
     * Argumenti marza i pdv su u obliku double a ne potpisani sa object ili Pad i Marza. To je razlika...drugi potpis konstruktora
     *
     * @param id
     * @param artikal
     * @param datumKalkulacije
     * @param dodatniTroskovi
     * @param marza
     * @param pdv
     * @param rabat
     */
    public KalkulacijaNabavneCene(int id, Artikal artikal, Date datumKalkulacije, double dodatniTroskovi, double marza, double pdv, double rabat) {
        this.id = id;
        this.datumKalkulacije = datumKalkulacije;
        this.dodatniTroskovi = dodatniTroskovi;
        this.marza = marza;
        this.pdv = pdv;
        this.rabat = rabat;
        this.artikal = artikal;
    }

    public void Kalkulisi() {

        if (this.marzaObj != null) {
            this.marza = this.marzaObj.getVrednostMarze();
        } else if (this.pdvObj != null) {
            this.pdv = this.pdvObj.getPdv();
        }


        /*(набавна цена артикла - rabat)  + трошкови набавке артикла + трговачка маржа + ПДВ = продајна цена артикла */
        //Prvo spustamo nabavnu cenu za dobijen rabat
        this.SumaOdRabat = this.getArtikal().getCena() * this.rabat / 100;
        this.SumaSaRabati = this.getArtikal().getCena() - this.SumaOdRabat;

        this.SumaOdMarze = this.SumaSaRabati * this.marza / 100;
        this.SumaSaMarzom = this.dodatniTroskovi + this.SumaOdMarze + this.SumaSaRabati;

        this.SumaOdPdv = this.SumaSaMarzom * this.pdv / 100;
        this.SumaSaPdv = this.SumaSaMarzom + this.SumaOdPdv;


    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatumKalkulacije() {
        return datumKalkulacije;
    }

    public void setDatumKalkulacije(Date datumKalkulacije) {
        this.datumKalkulacije = datumKalkulacije;
    }


    public double getDodatniTroskovi() {
        return dodatniTroskovi;
    }

    public void setDodatniTroskovi(double dodatniTroskovi) {
        this.dodatniTroskovi = dodatniTroskovi;
    }

    public PdvKalkulator.Marza getMarza() {
        return marzaObj;
    }

    public void setMarza(double marza) {
        this.marza = marza;
    }

    public void setMarza(PdvKalkulator.Marza marza) {
        this.marzaObj = marza;
    }

    public double getRabat() {
        return rabat;
    }

    public void setRabat(double rabat) {
        rabat = rabat;
    }

    public Artikal getArtikal() {
        return artikal;
    }

    public void setArtikal(Artikal artikal) {
        this.artikal = artikal;
    }

    public double getSumaSaMarzom() {
        return SumaSaMarzom;
    }

    public double getSumaOdMarze() {
        return SumaOdMarze;
    }

    public double getSumaSaPdv() {
        return SumaSaPdv;
    }

    public double getSumaOdPdv() {
        return SumaOdPdv;
    }

    public double getSumaOdRabat() {
        return SumaOdRabat;
    }

    public void setSumaOdRabat(double sumaOdRabat) {
        SumaOdRabat = sumaOdRabat;
    }

    public double getSumaSaRabati() {
        return SumaSaRabati;
    }

    public void setSumaSaRabati(double sumaSaRabati) {
        SumaSaRabati = sumaSaRabati;
    }

    public PdvKalkulator.Marza getMarzaObj() {
        return marzaObj;
    }

    public void setMarzaObj(PdvKalkulator.Marza marzaObj) {
        this.marzaObj = marzaObj;
    }

    public Pdv getPdvObj() {
        return pdvObj;
    }

    public void setPdvObj(Pdv pdvObj) {
        this.pdvObj = pdvObj;
    }

    public double getPdv() {
        return pdv;
    }

    public void setPdv(double pdv) {
        this.pdv = pdv;
    }


}
