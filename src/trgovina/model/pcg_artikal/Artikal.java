package trgovina.model.pcg_artikal;

import trgovina.model.pcg_dobavljac.DobavljacFizickoLice;
import trgovina.model.pcg_dobavljac.DobavljacPravnoLice;

public class Artikal {


    private int id;
    private int idDobavljac;
    private DobavljacPravnoLice DobavljacPraLic;
    private DobavljacFizickoLice DobavljacFizLic;
    private int idGrupa;
    private String Grupa;
    private String Poreklo;
    private String SerijskiBroj;
    private String Oblik;
    private double Sirina;
    private double Visina;
    private double Dubina;
    private double Obim;
    private String SifraArtikla;
    private String DolaznaSifra;
    private String NazivArtikla;
    private String Boja;
    private String DodatniOpis;
    private String Materijal;
    private boolean jelLomljivo;
    private double Tezina;
    private double Cena;
    private double VisinaPdv;
    private double CenaSaPdv;
    private String Napomene;
    private String[] SlikeArtikla;
    private double popust;
    private int kolicina;
    private int kolicina_pakovanja;

    public Artikal() {
        this.id = 0;
        this.idGrupa = 0;
        this.idDobavljac = 0;
        this.DobavljacPraLic = null;
        this.DobavljacFizLic = null;
        this.Grupa = null;
        this.Poreklo = null;
        this.SerijskiBroj = null;
        this.Oblik = null;
        this.Sirina = 0;
        this.Visina = 0;
        this.Dubina = 0;
        this.Obim = 0;
        this.SifraArtikla = null;
        this.DolaznaSifra = null;
        this.NazivArtikla = null;
        this.Boja = null;
        this.DodatniOpis = null;
        this.Materijal = null;
        this.jelLomljivo = false;
        this.Tezina = 0;
        this.Cena = 0;
        this.VisinaPdv = 0;
        this.CenaSaPdv = 0;
        this.Napomene = null;
        this.SlikeArtikla = null;
        this.popust = 0;
        this.kolicina = 0;
        this.kolicina_pakovanja = 0;
    }

    /**
     * Skraceni konstruktor sa int IDDobavljac. Pogodnija za rad sa bazom podataka zato sto nemorate unosti objekte Dobavljac pravno i Dobavljac fizicko Lice
     *
     * @param id
     * @param idDobavljac
     * @param grupa
     * @param poreklo
     * @param serijskiBroj
     * @param oblik
     * @param sirina
     * @param visina
     * @param dubina
     * @param obim
     * @param sifraArtikla
     * @param dolaznaSifra
     * @param nazivArtikla
     * @param boja
     * @param dodatniOpis
     * @param materijal
     * @param jelLomljivo
     * @param tezina
     * @param cena
     * @param visinaPdv
     * @param cenaSaPdv
     * @param napomene
     * @param slikeArtikla
     * @param popust
     */
    public Artikal(int id, int idDobavljac, int idGrupa, String grupa, String poreklo, String serijskiBroj, String oblik, double sirina, double visina, double dubina, double obim, String sifraArtikla, String dolaznaSifra, String nazivArtikla, String boja, String dodatniOpis, String materijal, boolean jelLomljivo, double tezina, double cena, double visinaPdv, double cenaSaPdv, String napomene, String[] slikeArtikla, double popust, int kolicina, int kolicinaPakovanja) {
        this.id = id;
        this.idDobavljac = idDobavljac;
        this.idGrupa = idGrupa;
        this.Grupa = grupa;
        this.Poreklo = poreklo;
        this.SerijskiBroj = serijskiBroj;
        this.Oblik = oblik;
        this.Sirina = sirina;
        this.Visina = visina;
        this.Dubina = dubina;
        this.Obim = obim;
        this.SifraArtikla = sifraArtikla;
        this.DolaznaSifra = dolaznaSifra;
        this.NazivArtikla = nazivArtikla;
        this.Boja = boja;
        this.DodatniOpis = dodatniOpis;
        this.Materijal = materijal;
        this.jelLomljivo = jelLomljivo;
        this.Tezina = tezina;
        this.Cena = cena;
        this.VisinaPdv = visinaPdv;
        this.CenaSaPdv = cenaSaPdv;
        this.Napomene = napomene;
        this.SlikeArtikla = slikeArtikla;
        this.popust = popust;
        this.kolicina = kolicina;
        this.kolicina_pakovanja = kolicinaPakovanja;
    }


    /**
     * @param id
     * @param dobavljacPraLic
     * @param dobavljacFizLic
     * @param grupa
     * @param poreklo
     * @param serijskiBroj
     * @param oblik
     * @param sirina
     * @param visina
     * @param dubina
     * @param obim
     * @param sifraArtikla
     * @param dolaznaSifra
     * @param nazivArtikla
     * @param boja
     * @param dodatniOpis
     * @param materijal
     * @param jelLomljivo
     * @param tezina
     * @param cena
     * @param visinaPdv
     * @param cenaSaPdv
     * @param napomene
     * @param slikeArtikla
     * @param popust
     */
    public Artikal(int id, DobavljacPravnoLice dobavljacPraLic, DobavljacFizickoLice dobavljacFizLic, String grupa, int idGrupa, String poreklo, String serijskiBroj, String oblik, double sirina, double visina, double dubina, double obim, String sifraArtikla, String dolaznaSifra, String nazivArtikla, String boja, String dodatniOpis, String materijal, boolean jelLomljivo, double tezina, double cena, double visinaPdv, double cenaSaPdv, String napomene, String[] slikeArtikla, double popust) {
        this.id = id;
        this.DobavljacPraLic = dobavljacPraLic;
        this.DobavljacFizLic = dobavljacFizLic;
        this.idGrupa = idGrupa;
        this.Grupa = grupa;
        this.Poreklo = poreklo;
        this.SerijskiBroj = serijskiBroj;
        this.Oblik = oblik;
        this.Sirina = sirina;
        this.Visina = visina;
        this.Dubina = dubina;
        this.Obim = obim;
        this.SifraArtikla = sifraArtikla;
        this.DolaznaSifra = dolaznaSifra;
        this.NazivArtikla = nazivArtikla;
        this.Boja = boja;
        this.DodatniOpis = dodatniOpis;
        this.Materijal = materijal;
        this.jelLomljivo = jelLomljivo;
        this.Tezina = tezina;
        this.Cena = cena;
        this.VisinaPdv = visinaPdv;
        this.CenaSaPdv = cenaSaPdv;
        this.Napomene = napomene;
        this.SlikeArtikla = slikeArtikla;
        this.popust = popust;
    }

    /**
     * @param id
     * @param dobavljacPraLic
     * @param dobavljacFizLic
     * @param grupa
     * @param poreklo
     * @param serijskiBroj
     * @param oblik
     * @param sirina
     * @param visina
     * @param dubina
     * @param obim
     * @param sifraArtikla
     * @param dolaznaSifra
     * @param nazivArtikla
     * @param boja
     * @param dodatniOpis
     * @param materijal
     * @param jelLomljivo
     * @param tezina
     * @param cena
     * @param visinaPdv
     * @param cenaSaPdv
     * @param napomene
     * @param slikeArtikla
     * @param popust
     * @param kolicina
     */
    public Artikal(int id, DobavljacPravnoLice dobavljacPraLic, DobavljacFizickoLice dobavljacFizLic, String grupa, int idGrupa, String poreklo, String serijskiBroj, String oblik, double sirina, double visina, double dubina, double obim, String sifraArtikla, String dolaznaSifra, String nazivArtikla, String boja, String dodatniOpis, String materijal, boolean jelLomljivo, double tezina, double cena, double visinaPdv, double cenaSaPdv, String napomene, String[] slikeArtikla, double popust, int kolicina, int kolicinaPakovanja) {
        this.id = id;
        this.DobavljacPraLic = dobavljacPraLic;
        this.DobavljacFizLic = dobavljacFizLic;
        this.Grupa = grupa;
        this.idGrupa = idGrupa;
        this.Poreklo = poreklo;
        this.SerijskiBroj = serijskiBroj;
        this.Oblik = oblik;
        this.Sirina = sirina;
        this.Visina = visina;
        this.Dubina = dubina;
        this.Obim = obim;
        this.SifraArtikla = sifraArtikla;
        this.DolaznaSifra = dolaznaSifra;
        this.NazivArtikla = nazivArtikla;
        this.Boja = boja;
        this.DodatniOpis = dodatniOpis;
        this.Materijal = materijal;
        this.jelLomljivo = jelLomljivo;
        this.Tezina = tezina;
        this.Cena = cena;
        this.VisinaPdv = visinaPdv;
        this.CenaSaPdv = cenaSaPdv;
        this.Napomene = napomene;
        this.SlikeArtikla = slikeArtikla;
        this.popust = popust;
        this.kolicina = kolicina;
        this.kolicina_pakovanja = kolicinaPakovanja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DobavljacPravnoLice getDobavljacPraLic() {
        return DobavljacPraLic;
    }

    public void setDobavljacPraLic(DobavljacPravnoLice dobavljacPraLic) {
        DobavljacPraLic = dobavljacPraLic;
    }

    public DobavljacFizickoLice getDobavljacFizLic() {
        return DobavljacFizLic;
    }

    public void setDobavljacFizLic(DobavljacFizickoLice dobavljacFizLic) {
        DobavljacFizLic = dobavljacFizLic;
    }

    public String getGrupa() {
        return Grupa;
    }

    public int getIdGrupa() {
        return idGrupa;
    }

    public void setIdGrupa(int idGrupa) {
        this.idGrupa = idGrupa;
    }

    public void setGrupa(String grupa) {
        Grupa = grupa;
    }

    public String getPoreklo() {
        return Poreklo;
    }

    public void setPoreklo(String poreklo) {
        Poreklo = poreklo;
    }

    public String getSerijskiBroj() {
        return SerijskiBroj;
    }

    public void setSerijskiBroj(String serijskiBroj) {
        SerijskiBroj = serijskiBroj;
    }

    public String getOblik() {
        return Oblik;
    }

    public void setOblik(String oblik) {
        Oblik = oblik;
    }

    public double getSirina() {
        return Sirina;
    }

    public void setSirina(double sirina) {
        Sirina = sirina;
    }

    public double getVisina() {
        return Visina;
    }

    public void setVisina(double visina) {
        Visina = visina;
    }

    public double getDubina() {
        return Dubina;
    }

    public void setDubina(double dubina) {
        Dubina = dubina;
    }

    public double getObim() {
        return Obim;
    }

    public void setObim(double obim) {
        Obim = obim;
    }

    public String getSifraArtikla() {
        return SifraArtikla;
    }

    public void setSifraArtikla(String sifraArtikla) {
        SifraArtikla = sifraArtikla;
    }

    public String getDolaznaSifra() {
        return DolaznaSifra;
    }

    public void setDolaznaSifra(String dolaznaSifra) {
        DolaznaSifra = dolaznaSifra;
    }

    public String getNazivArtikla() {
        return NazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        NazivArtikla = nazivArtikla;
    }

    public String getBoja() {
        return Boja;
    }

    public void setBoja(String boja) {
        Boja = boja;
    }

    public String getDodatniOpis() {
        return DodatniOpis;
    }

    public void setDodatniOpis(String dodatniOpis) {
        DodatniOpis = dodatniOpis;
    }

    public String getMaterijal() {
        return Materijal;
    }

    public void setMaterijal(String materijal) {
        Materijal = materijal;
    }

    public boolean isJelLomljivo() {
        return jelLomljivo;
    }

    public void setJelLomljivo(boolean jelLomljivo) {
        this.jelLomljivo = jelLomljivo;
    }

    public double getTezina() {
        return Tezina;
    }

    public void setTezina(double tezina) {
        Tezina = tezina;
    }

    public double getCena() {
        return Cena;
    }

    public void setCena(double cena) {
        Cena = cena;
    }

    public double getVisinaPdv() {
        return VisinaPdv;
    }

    public void setVisinaPdv(double visinaPdv) {
        VisinaPdv = visinaPdv;
    }

    public double getCenaSaPdv() {
        return CenaSaPdv;
    }

    public void setCenaSaPdv(double cenaSaPdv) {
        CenaSaPdv = cenaSaPdv;
    }

    public String getNapomene() {
        return Napomene;
    }

    public void setNapomene(String napomene) {
        Napomene = napomene;
    }

    public String[] getSlikeArtikla() {
        return SlikeArtikla;
    }

    public void setSlikeArtikla(String[] slikeArtikla) {
        SlikeArtikla = slikeArtikla;
    }

    public void dodajSlikuArtikla(int pozicija, String _slika) {
        this.SlikeArtikla[pozicija] = _slika;
    }

    public void dodajSlikuArtikla(String _slika) {
        if (this.SlikeArtikla.length > 0 || this.SlikeArtikla != null) {
            int zadpoz = this.SlikeArtikla.length + 1;
            this.SlikeArtikla[zadpoz] = _slika;
        }

    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public int getKolicina_pakovanja() {
        return kolicina_pakovanja;
    }

    public void setKolicina_pakovanja(int kolicina_pakovanja) {
        this.kolicina_pakovanja = kolicina_pakovanja;
    }

    public int getIdDobavljac() {
        return idDobavljac;
    }

    public void setIdDobavljac(int idDobavljac) {
        this.idDobavljac = idDobavljac;
    }
}
