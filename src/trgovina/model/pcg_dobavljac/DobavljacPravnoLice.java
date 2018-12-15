package trgovina.model.pcg_dobavljac;

import trgovina.model.pcg_trgovac.TrgovacPravnoLice;

import java.sql.Timestamp;

public class DobavljacPravnoLice extends TrgovacPravnoLice {
    //Ima iste parametere tj podatke..ne ponavljati tj sve menjati u klasama trgovac


    public DobavljacPravnoLice() {
    }

    /**
     * @param nazivOrganizacije
     * @param tipOrganizacije
     * @param delatnost
     * @param PIB
     * @param PdvBroj
     * @param maticniBroj
     * @param datumOsnivanja
     */
    public DobavljacPravnoLice(String nazivOrganizacije, String tipOrganizacije, String delatnost, String PIB, String PdvBroj, String maticniBroj, Timestamp datumOsnivanja,boolean jelFilijala) {
        super(nazivOrganizacije, tipOrganizacije, delatnost, PIB, PdvBroj, maticniBroj, datumOsnivanja,jelFilijala);
    }

    public DobavljacPravnoLice(int id, String prezimeImeVlasnika,String grad, String ulicaBroj, String mestoOrganizacije, String brojTelefonaFiksni, String brojTelefonaMobilni, String brojFax, String mailAdresa1, String mailAdresa2, String tekuciRacunDinarski1, String tekuciRacunDinarski2, String tekuciRacunDevizni1, String tekuciRacunDevizni, String dodatniOpis, boolean jelAktivan, String geoDuzinaLokacije, String geoSirinaLokacije, String nazivOrganizacije, String tipOrganizacije, String delatnost, String PIB, String pdvBroj, String maticniBroj, Timestamp datumOsnivanja,String webStranica,boolean jelFilijala) {
        super(id, prezimeImeVlasnika,grad, ulicaBroj, mestoOrganizacije, brojTelefonaFiksni, brojTelefonaMobilni, brojFax, mailAdresa1, mailAdresa2, tekuciRacunDinarski1, tekuciRacunDinarski2, tekuciRacunDevizni1, tekuciRacunDevizni, dodatniOpis, jelAktivan, geoDuzinaLokacije, geoSirinaLokacije, nazivOrganizacije, tipOrganizacije, delatnost, PIB, pdvBroj, maticniBroj, datumOsnivanja,webStranica,jelFilijala);
    }

    @Override
    public String getNazivOrganizacije() {
        return super.getNazivOrganizacije();
    }

    @Override
    public void setNazivOrganizacije(String nazivOrganizacije) {
        super.setNazivOrganizacije(nazivOrganizacije);
    }

    @Override
    public String getTipOrganizacije() {
        return super.getTipOrganizacije();
    }

    @Override
    public void setTipOrganizacije(String tipOrganizacije) {
        super.setTipOrganizacije(tipOrganizacije);
    }

    @Override
    public String getDelatnost() {
        return super.getDelatnost();
    }

    @Override
    public void setDelatnost(String delatnost) {
        super.setDelatnost(delatnost);
    }

    @Override
    public String getPIB() {
        return super.getPIB();
    }

    @Override
    public void setPIB(String PIB) {
        super.setPIB(PIB);
    }

    @Override
    public String getPdvBroj() {
        return super.getPdvBroj();
    }

    @Override
    public void setPdvBroj(String pdvBroj) {
        super.setPdvBroj(pdvBroj);
    }

    @Override
    public String getMaticniBroj() {
        return super.getMaticniBroj();
    }

    @Override
    public void setMaticniBroj(String maticniBroj) {
        super.setMaticniBroj(maticniBroj);
    }

    @Override
    public Timestamp getDatumOsnivanja() {
        return super.getDatumOsnivanja();
    }

    @Override
    public void setDatumOsnivanja(Timestamp datumOsnivanja) {
        super.setDatumOsnivanja(datumOsnivanja);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getPrezimeImeVlasnika() {
        return super.getPrezimeImeVlasnika();
    }

    @Override
    public void setPrezimeImeVlasnika(String prezimeImeVlasnika) {
        super.setPrezimeImeVlasnika(prezimeImeVlasnika);
    }

    @Override
    public String getUlicaBroj() {
        return super.getUlicaBroj();
    }

    @Override
    public void setUlicaBroj(String ulicaBroj) {
        super.setUlicaBroj(ulicaBroj);
    }

    @Override
    public String getMestoOrganizacije() {
        return super.getMestoOrganizacije();
    }


}
