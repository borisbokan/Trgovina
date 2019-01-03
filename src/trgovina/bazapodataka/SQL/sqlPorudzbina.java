/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka.SQL;

import trgovina.model.pcg_korpa.StavkaPorudzbenice;

/**
 *
 * @author borcha
 */
public class sqlPorudzbina {

    private final static String TABELA_tPorudzbenica = "tPorudzbenica";
    private final static String tPorudzbenica_id = "id";
    private final static String tPorudzbenica_tipPorudzbenice = "tip_porudzbenice";
    private final static String tPorudzbenica_sifraPorudzbenice = "sifra_porudzbenice";
    private final static String tPorudzbenica_kupacPravnoFizicko = "kupac_pravno_fizicko";
    private final static String tPorudzbenica_idArtikal = "id_artikal";
    private final static String tPorudzbenica_kolicina = "kolicina";
    private final static String tPorudzbenica_vremePorucivanja="vreme_porucivanja";
    private int id;

    //private StavkaPorudzbenice stavkaPorudzbenice=new StavkaPorudzbenice();
    private StavkaPorudzbenice stavkaPorudzbenice;

    public sqlPorudzbina() {
    }

    public sqlPorudzbina(int _id) {
        this.id = _id;
    }

    public sqlPorudzbina(StavkaPorudzbenice _stavkaPorudzbenice) {
        this.stavkaPorudzbenice = _stavkaPorudzbenice;
        this.id = this.stavkaPorudzbenice.getId();
    }

    public sqlPorudzbina(int id, StavkaPorudzbenice stavkaPorudzbenice) {
        this.id = id;
        this.stavkaPorudzbenice = stavkaPorudzbenice;
    }

    /**
     * Snimi stavku porudzbine
     * @return 
     */
    public String SQLinsert_stavkaPorudzbine() {
        String sql = "INSERT INTO " + TABELA_tPorudzbenica + " ("
                + tPorudzbenica_tipPorudzbenice + ","
                + tPorudzbenica_sifraPorudzbenice + ","
                + tPorudzbenica_kupacPravnoFizicko + ","
                + tPorudzbenica_idArtikal + ","
                + tPorudzbenica_kolicina + "," 
                + tPorudzbenica_vremePorucivanja + ") VALUE ('" 
                    + this.stavkaPorudzbenice.getTipPordzbenice() + "','"
                    + this.stavkaPorudzbenice.getSifra_porudzbenice() + "','"
                    + this.stavkaPorudzbenice.getKupacPravnoIliFizicko() + "',"
                    + this.stavkaPorudzbenice.getId_artikal() + ","
                    + this.stavkaPorudzbenice.getKolicina() + ",'"
                    + this.stavkaPorudzbenice.getVremePorucivanja() + "')";

        return sql;

    }

    /**
     * Ispravak stavke porudzbine
     * @return 
     */
    public String SQLUpdate_stavkaPorudzbenice(){
        
        String sql="UPDATE " + TABELA_tPorudzbenica + " SET " +
                 tPorudzbenica_tipPorudzbenice + " ='" + this.stavkaPorudzbenice.getTipPordzbenice() + "'," +
                 tPorudzbenica_sifraPorudzbenice + " ='" + this.stavkaPorudzbenice.getSifra_porudzbenice() + "'," +
                 tPorudzbenica_kupacPravnoFizicko + " ='" + stavkaPorudzbenice.getKupacPravnoIliFizicko() + "'," +
                 tPorudzbenica_idArtikal + " ='" + this.stavkaPorudzbenice.getId_artikal() + "'," +
                 tPorudzbenica_kolicina + " ='"  + this.stavkaPorudzbenice.getKolicina() + 
                 tPorudzbenica_vremePorucivanja + " = " + this.stavkaPorudzbenice.getVremePorucivanja() +
                     " WHERE " + tPorudzbenica_id + "=" + this.id;
        
        return sql;
        
    }
    
    
    /**
     * Brise stavku porudzbenice
     * @return 
     */
    public String SQLDelete_porudzbenica(){
        String sql="DELETE FROM" + TABELA_tPorudzbenica + " WHERE " + tPorudzbenica_id + "=" + this.id; 
        
        return sql;
    }
    
}
