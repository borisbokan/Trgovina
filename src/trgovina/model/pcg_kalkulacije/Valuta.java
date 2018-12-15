package trgovina.model.pcg_kalkulacije;

import java.util.Date;

public class Valuta {

    private int id;
    private String NazivValute;
    private String Skracenica;
    private String VrednostValute;
    private Date VaziOd;
    private Date VaziDo;
    private boolean jelOsnovnaValuta;

    public Valuta() {
        this.id = 0;
        NazivValute = null;
        Skracenica = null;
        VrednostValute = null;
        VaziOd = null;
        VaziDo = null;
        this.jelOsnovnaValuta = false;
    }

    /**
     * @param id
     * @param nazivValute
     * @param skracenica
     * @param vrednostValute
     * @param vaziOd
     * @param vaziDo
     */
    public Valuta(int id, String nazivValute, String skracenica, String vrednostValute, Date vaziOd, Date vaziDo) {
        this.id = id;
        this.NazivValute = nazivValute;
        this.Skracenica = skracenica;
        this.VrednostValute = vrednostValute;
        this.VaziOd = vaziOd;
        this.VaziDo = vaziDo;
    }

    /**
     * @param id
     * @param nazivValute
     * @param skracenica
     * @param vrednostValute
     * @param vaziOd
     * @param vaziDo
     * @param jelOsnovnaValuta
     */
    public Valuta(int id, String nazivValute, String skracenica, String vrednostValute, Date vaziOd, Date vaziDo, boolean jelOsnovnaValuta) {
        this.id = id;
        NazivValute = nazivValute;
        Skracenica = skracenica;
        VrednostValute = vrednostValute;
        VaziOd = vaziOd;
        VaziDo = vaziDo;
        this.jelOsnovnaValuta = jelOsnovnaValuta;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazivValute() {
        return NazivValute;
    }

    public void setNazivValute(String nazivValute) {
        NazivValute = nazivValute;
    }

    public String getSkracenica() {
        return Skracenica;
    }

    public void setSkracenica(String skracenica) {
        Skracenica = skracenica;
    }

    public String getVrednostValute() {
        return VrednostValute;
    }

    public void setVrednostValute(String vrednostValute) {
        VrednostValute = vrednostValute;
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

    public boolean isJelOsnovnaValuta() {
        return jelOsnovnaValuta;
    }

    public void setJelOsnovnaValuta(boolean jelOsnovnaValuta) {
        this.jelOsnovnaValuta = jelOsnovnaValuta;
    }
}
