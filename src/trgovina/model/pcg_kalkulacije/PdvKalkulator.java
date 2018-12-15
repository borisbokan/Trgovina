package trgovina.model.pcg_kalkulacije;

import java.util.Date;

public class PdvKalkulator {


    private double Suma;
    private Pdv VisinaPdvObject;//Objektno predstavljeno a moze i sa doble vrednosti u argumentu. Mogu se korsiti obe verzije sa konstruktorom.
    private double VisinaPdv;
    private double Rabat;
    private double SumaSaPdv;
    private double SumaSaPdvRabat;
    private double SumaOdPdv;//Samo suma tj iznos pdv
    private double SumaOdRabat;//Samo suma tj iznos rabati od sume.

    public PdvKalkulator() {
        this.Suma = 0;
        this.VisinaPdvObject = null;
        this.Rabat = 0;
    }

    /**
     * Konstruktor sa argumentom visinaPdv u tipu double ne object
     *
     * @param suma
     * @param visinaPdv
     * @param rabat
     */
    public PdvKalkulator(double suma, double visinaPdv, double rabat) {
        this.Suma = suma;
        this.VisinaPdv = visinaPdv;
        this.Rabat = rabat;
    }

    /**
     * Konstruktor sa argumentom tipa  object = Pdv
     * @param suma
     * @param visinaPdv
     */
    public PdvKalkulator(double suma, Pdv visinaPdv) {
        this.Suma = suma;
        this.VisinaPdvObject = visinaPdv;
    }

    /**
     * @param suma
     * @param visinaPdv
     * @param rabat
     */
    public PdvKalkulator(double suma, Pdv visinaPdv, double rabat) {
        this.Suma = suma;
        this.VisinaPdvObject = visinaPdv;
        this.Rabat = rabat;
    }


    public void Kalkulisi() {
        this.SumaOdPdv = this.Suma * this.VisinaPdv / 100;
        this.SumaSaPdv = this.getSuma() + this.SumaOdPdv;
        this.SumaOdRabat = this.Rabat * this.SumaSaPdv / 100;
        this.SumaSaPdvRabat = this.SumaSaPdv - this.SumaOdRabat;

    }

    public double getSuma() {
        return Suma;
    }

    public void setSuma(double suma) {
        this.Suma = suma;
    }

    public Pdv getVisinaPdv() {
        return this.VisinaPdvObject;
    }

    public void setVisinaPdv(Pdv visinaPdv) {
        this.VisinaPdvObject = visinaPdv;
    }

    public double getRabat() {
        return Rabat;
    }

    public void setRabat(double rabat) {
        this.Rabat = rabat;
    }

    public Pdv getVisinaPdvObject() {
        return VisinaPdvObject;
    }

    public double getSumaSaPdv() {
        return SumaSaPdv;
    }

    public double getSumaSaPdvRabat() {
        return SumaSaPdvRabat;
    }

    public double getSumaOdPdv() {
        return SumaOdPdv;
    }

    public double getSumaOdRabat() {
        return SumaOdRabat;
    }


    public String toString() {

        return "Rezultat: " + " sa Pdv: " + getSumaSaPdv() + " Vre. od Pdv: " + getSumaOdPdv() + "\" + " +
                "sa Rabati: " + getSumaSaPdvRabat() + " Vre.od Rabati: " + getSumaOdRabat();


    }

    public static class Marza {


        private int id;
        private double VrednostMarze;
        private Date VaziOd;
        private Date VaziDo;

        public Marza() {
            this.id = 0;
            this.VrednostMarze = 0;
            this.VaziOd = null;
            this.VaziDo = null;

        }

        /**
         * @param id
         * @param vrednostMarze
         * @param vaziOd
         * @param vaziDo
         */
        public Marza(int id, double vrednostMarze, Date vaziOd, Date vaziDo) {
            this.id = id;
            this.VrednostMarze = vrednostMarze;
            this.VaziOd = vaziOd;
            this.VaziDo = vaziDo;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getVrednostMarze() {
            return VrednostMarze;
        }

        public void setVrednostMarze(double vrednostMarze) {
            VrednostMarze = vrednostMarze;
        }

        public Date getVaziOd() {
            return VaziOd;
        }

        public void setVaziOd(Date vaziOd) {
            VaziOd = vaziOd;
        }

        public Date getVaziDo() {
            return VaziDo;
        }

        public void setVaziDo(Date vaziDo) {
            VaziDo = vaziDo;
        }
    }
}
