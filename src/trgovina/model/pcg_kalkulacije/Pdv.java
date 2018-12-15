package trgovina.model.pcg_kalkulacije;

import java.util.Date;

public class Pdv {

    private int id;
    private double Pdv;
    private Date VaziOd;
    private Date VaiDo;

    public Pdv() {
        Pdv = 0;
        VaziOd = null;
        VaiDo = null;
    }

    /**
     * @param id
     * @param pdv
     * @param vaziOd
     * @param vaiDo
     */
    public Pdv(int id, double pdv, Date vaziOd, Date vaiDo) {
        this.id = id;
        this.Pdv = pdv;
        this.VaziOd = vaziOd;
        this.VaiDo = vaiDo;
    }

    /**
     * @param pdv
     * @param vaziOd
     * @param vaiDo
     */
    public Pdv(double pdv, Date vaziOd, Date vaiDo) {
        this.Pdv = pdv;
        this.VaziOd = vaziOd;
        this.VaiDo = vaiDo;
    }

    public double getPdv() {
        return Pdv;
    }

    public void setPdv(double pdv) {
        this.Pdv = pdv;
    }

    public Date getVaziOd() {
        return VaziOd;
    }

    public void setVaziOd(Date vaziOd) {
        VaziOd = vaziOd;
    }

    public Date getVaiDo() {
        return VaiDo;
    }

    public void setVaiDo(Date vaiDo) {
        VaiDo = vaiDo;
    }
}
