package trgovina.bazapodataka.SQL;

import trgovina.model.pcg_artikal.Artikal;

public class sqlArtikal {

    private int idArtikal = 0;
    private Artikal artikal = new Artikal();

    //public final static String tArtikal_= "";_
    public final static String TABELA_Artikal = "tArtikal";
    public final static String tArtikal_id = "id"; // index: 1
    public final static String tArtikal_id_dobavljac = "id_dobavljac";// index: 2
    public final static String tArtikal_id_grupa = "id_grupa";// index: 3
    public final static String tArtikal_poreklo = "poreklo";// index: 4
    public final static String tArtikal_serijski_broj = "serijski_broj";// index: 5
    public final static String tArtikal_oblik = "oblik";// index: 6
    public final static String tArtikal_sirina = "sirina";// index: 7
    public final static String tArtikal_visina = "visina";// index: 8
    public final static String tArtikal_dubina = "dubina";// index: 9
    public final static String tArtikal_obim = "obim";// index: 10
    public final static String tArtikal_sifra_artikla = "sifra_artikla"; // index: 11
    public final static String tArtikal_dolazna_sifra = "dolazna_sifra"; // index: 12
    public final static String tArtikal_naziv_artikla = "naziv_artikla"; // index: 13
    public final static String tArtikal_boja = "boja";// index: 14
    public final static String tArtikal_dodatni_opis = "dodatni_opis"; // index: 14
    public final static String tArtikal_materijal = "materijal";// index: 15
    public final static String tArtikal_jel_lomjivo = "jel_lomjivo";// index: 16
    public final static String tArtikal_tezina = "tezina";// index: 17
    public final static String tArtikal_cena = "cena";// index: 18
    public final static String tArtikal_visina_pdv = "visina_pdv";// index: 19
    public final static String tArtikal_cena_sa_pdv = "cena_sa_pdv";// index: 20
    public final static String tArtikal_napomene = "napomene";// index: 21
    public final static String tArtikal_slike_artikla = "slike_artikla";// index: 22
    public final static String tArtikal_popust = "popust";// index: 23
    public final static String tArtikal_kolicina_lager = "kolicina_lager";// index: 24
    public final static String tArtikal_kolicina_pakovanja = "kolicina_pakovanja";// index: 25


    public sqlArtikal(Artikal _artikal) {
        this.idArtikal = _artikal.getId();
        this.artikal = _artikal;
    }

    public sqlArtikal(int _id) {
        this.idArtikal = _id;
    }

    /**
     * Sql upit za sve artikle
     *
     * @return
     */
    public String SQLSELECT_sviArtikli() {
        String upit = "SELECT * FROM " + TABELA_Artikal;

        return upit;
    }

    /**
     * Sql upit za samo jedan artikal po id-u. U konstriktoru u obe verzije dobija se id (pogledaj konstruktor)
     *
     * @return
     */
    public String SQLSELECT_ArtikalPoId() {
        String upit = "SELECT * FROM " + TABELA_Artikal + " WHERE " + tArtikal_id + "=" + this.idArtikal;

        return upit;
    }


    public String SQLInsert_UnosArtikla() {

        String upit = "INSERT INTO " + TABELA_Artikal + " (" +
                tArtikal_id_dobavljac + "," +
                tArtikal_id_grupa + "," +
                tArtikal_poreklo + "," +
                tArtikal_serijski_broj + "," +
                tArtikal_oblik + "," +
                tArtikal_sirina + "," +
                tArtikal_visina + "," +
                tArtikal_dubina + "," +
                tArtikal_obim + "," +
                tArtikal_sifra_artikla + "," +
                tArtikal_dolazna_sifra + "," +
                tArtikal_naziv_artikla + "," +
                tArtikal_boja + "," +
                tArtikal_dodatni_opis + "," +
                tArtikal_materijal + "," +
                tArtikal_jel_lomjivo + "," +
                tArtikal_tezina + "," +
                tArtikal_cena + "," +
                tArtikal_visina_pdv + "," +
                tArtikal_cena_sa_pdv + "," +
                tArtikal_napomene + "," +
                tArtikal_slike_artikla + "," +
                tArtikal_popust + "," +
                tArtikal_kolicina_lager + "," +
                tArtikal_kolicina_pakovanja + ") VALUE (" +

                this.artikal.getIdDobavljac() + "," +
                this.artikal.getIdGrupa() + ",'" +
                this.artikal.getPoreklo() + "','" +
                this.artikal.getSerijskiBroj() + "','" +
                this.artikal.getOblik() + "'," +
                this.artikal.getSirina() + "," +
                this.artikal.getVisina() + "," +
                this.artikal.getDubina() + "," +
                this.artikal.getObim() + ",'" +
                this.artikal.getSifraArtikla() + "','" +
                this.artikal.getDolaznaSifra() + "','" +
                this.artikal.getNazivArtikla() + "','" +
                this.artikal.getBoja() + "','" +
                this.artikal.getDodatniOpis() + "','" +
                this.artikal.getMaterijal() + "'," +
                this.artikal.isJelLomljivo() + "," +
                this.artikal.getTezina() + "," +
                this.artikal.getCena() + "," +
                this.artikal.getVisinaPdv() + "," +
                this.artikal.getCenaSaPdv() + ",'" +
                this.artikal.getNapomene() + "','" +
                this.artikal.getSlikeArtikla() + "'," +
                this.artikal.getPopust() + "," +
                this.artikal.getKolicina() + "," +
                this.artikal.getKolicina_pakovanja() + ")";

        return upit;

    }

    public String SQLDelete_ObrisiArtikal() {
        String upit = "DELETE FROM " + TABELA_Artikal + " WHERE " + tArtikal_id + "=" + idArtikal;
        return upit;
    }

    public String SQLUpdate_IspraviArtikal() {

        String upit = "UPDATE " + TABELA_Artikal + " SET " +
                tArtikal_id_dobavljac + "=" + this.artikal.getIdDobavljac() + "," +
                tArtikal_id_grupa + "=" + this.artikal.getIdGrupa() + "," +
                tArtikal_poreklo + "='" + this.artikal.getPoreklo() + "'," +
                tArtikal_serijski_broj + "='" + this.artikal.getSerijskiBroj() + "'," +
                tArtikal_oblik + "='" + this.artikal.getOblik() + "'," +
                tArtikal_sirina + "=" + this.artikal.getSirina() + "," +
                tArtikal_visina + "=" + this.artikal.getVisinaPdv() + "," +
                tArtikal_dubina + "=" + this.artikal.getDubina() + "," +
                tArtikal_obim + "=" + this.artikal.getObim() + "," +
                tArtikal_sifra_artikla + "='" + this.artikal.getSifraArtikla() + "'," +
                tArtikal_dolazna_sifra + "='" + this.artikal.getDolaznaSifra() + "'," +
                tArtikal_naziv_artikla + "='" + this.artikal.getNazivArtikla() + "'," +
                tArtikal_boja + "='" + this.artikal.getBoja() + "'," +
                tArtikal_dodatni_opis + "='" + this.artikal.getDodatniOpis() + "'," +
                tArtikal_materijal + "='" + this.artikal.getMaterijal() + "'," +
                tArtikal_jel_lomjivo + "=" + this.artikal.isJelLomljivo() + "," +
                tArtikal_tezina + "=" + +this.artikal.getTezina() + "," +
                tArtikal_cena + "=" + +this.artikal.getCena() + "," +
                tArtikal_visina_pdv + "=" + this.artikal.getVisinaPdv() + "," +
                tArtikal_cena_sa_pdv + "=" + this.artikal.getCenaSaPdv() + "," +
                tArtikal_napomene + "='" + this.artikal.getNapomene() + "'," +
                tArtikal_slike_artikla + "='" + this.artikal.getSlikeArtikla() + "'," +
                tArtikal_popust + "=" + this.artikal.getPopust() + "," +
                tArtikal_kolicina_lager + "=" + this.artikal.getKolicina() + "," +
                tArtikal_kolicina_pakovanja + "=" + this.artikal.getKolicina_pakovanja() +
                " WHERE " + tArtikal_id + "=" + this.idArtikal;

        return upit;

    }
}
