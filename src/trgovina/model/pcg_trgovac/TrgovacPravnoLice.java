package trgovina.model.pcg_trgovac;

import java.sql.Timestamp;

public class TrgovacPravnoLice extends Trgovac {

    private String NazivOrganizacije;
    private String TipOrganizacije;//Doo...
    private String Delatnost;
    private String PIB;
    private String PdvBroj;
    private String MaticniBroj;
    private boolean jelFilijala;
    private Timestamp DatumOsnivanja;

    /**
     * 
     * @param nazivOrganizacije
     * @param tipOrganizacije
     * @param delatnost
     * @param PIB
     * @param pdvBroj
     * @param maticniBroj
     * @param datumOsnivanja
     * @param jelFilijala 
     */
    public TrgovacPravnoLice(String nazivOrganizacije, String tipOrganizacije, String delatnost, String PIB, String pdvBroj, String maticniBroj, Timestamp datumOsnivanja,boolean jelFilijala) {
        this.NazivOrganizacije = nazivOrganizacije;
        this.TipOrganizacije = tipOrganizacije;
        this.Delatnost = delatnost;
        this.PIB = PIB;
        this.PdvBroj = pdvBroj;
        this.MaticniBroj = maticniBroj;
        this.DatumOsnivanja = datumOsnivanja;
        this.jelFilijala=jelFilijala;
    }

    /**
     * @param id
     * @param prezimeImeVlasnika
     * @param ulicaBroj
     * @param mestoOrganizacije
     * @param brojTelefonaFiksni
     * @param brojTelefonaMobilni
     * @param brojFax
     * @param mailAdresa1
     * @param mailAdresa2
     * @param tekuciRacunDinarski1
     * @param tekuciRacunDinarski2
     * @param tekuciRacunDevizni1
     * @param tekuciRacunDevizni
     * @param dodatniOpis
     * @param jelAktivan
     * @param geoDuzinaLokacije
     * @param geoSirinaLokacije
     * @param nazivOrganizacije
     * @param tipOrganizacije
     * @param delatnost
     * @param PIB
     * @param pdvBroj
     * @param maticniBroj
     * @param datumOsnivanja
     */
    public TrgovacPravnoLice(int id, String prezimeImeVlasnika,String grad, String ulicaBroj, String mestoOrganizacije, String brojTelefonaFiksni, String brojTelefonaMobilni, String brojFax, String mailAdresa1, String mailAdresa2, String tekuciRacunDinarski1, String tekuciRacunDinarski2, String tekuciRacunDevizni1, String tekuciRacunDevizni, String dodatniOpis, boolean jelAktivan, String geoDuzinaLokacije, String geoSirinaLokacije, String nazivOrganizacije, String tipOrganizacije, String delatnost, String PIB, String pdvBroj, String maticniBroj, Timestamp datumOsnivanja,String webStranica,boolean jelFilijala) {
        super(id, prezimeImeVlasnika,grad, ulicaBroj, mestoOrganizacije, brojTelefonaFiksni, brojTelefonaMobilni, brojFax, mailAdresa1, mailAdresa2, tekuciRacunDinarski1, tekuciRacunDinarski2, tekuciRacunDevizni1, tekuciRacunDevizni, dodatniOpis, jelAktivan, geoDuzinaLokacije, geoSirinaLokacije,webStranica);
        this.NazivOrganizacije = nazivOrganizacije;
        this.TipOrganizacije = tipOrganizacije;
        this.Delatnost = delatnost;
        this.PIB = PIB;
        this.PdvBroj = pdvBroj;
        this.MaticniBroj = maticniBroj;
        this.DatumOsnivanja = datumOsnivanja;
        this.jelFilijala=jelFilijala;
    }

    public TrgovacPravnoLice() {
    }

    public String getNazivOrganizacije() {
        return NazivOrganizacije;
    }

    public void setNazivOrganizacije(String nazivOrganizacije) {
        NazivOrganizacije = nazivOrganizacije;
    }

    public String getTipOrganizacije() {
        return TipOrganizacije;
    }

    public void setTipOrganizacije(String tipOrganizacije) {
        TipOrganizacije = tipOrganizacije;
    }

    public String getDelatnost() {
        return Delatnost;
    }

    public void setDelatnost(String delatnost) {
        Delatnost = delatnost;
    }

    public String getPIB() {
        return PIB;
    }

    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    public String getPdvBroj() {
        return PdvBroj;
    }

    public void setPdvBroj(String pdvBroj) {
        PdvBroj = pdvBroj;
    }

    public String getMaticniBroj() {
        return MaticniBroj;
    }

    public void setMaticniBroj(String maticniBroj) {
        MaticniBroj = maticniBroj;
    }

    public Timestamp getDatumOsnivanja() {
        return DatumOsnivanja;
    }

    public void setDatumOsnivanja(Timestamp datumOsnivanja) {
        DatumOsnivanja = datumOsnivanja;
    }

    public boolean isJelFilijala () {
        return jelFilijala;
    }



    public void setJelFilijala (boolean jelFilijala) {
        this.jelFilijala = jelFilijala;
    }
    
    
}
