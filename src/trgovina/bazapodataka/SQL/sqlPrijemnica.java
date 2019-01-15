/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka.SQL;

import trgovina.model.pcg_prijemnice.Prijemnica;
import trgovina.model.pcg_prijemnice.StavkaPrijemnice;

/**
 *
 * @author root
 */
public class sqlPrijemnica {

    public static final String TABELA_Prijemnica = "tPrijemnica";
    public static final String tPrijemnica_id = "id";
    private static final String tPrijemnica_brojPrijemnice = "broj_prijemnice";
    private static final String tPrijemnica_idDobavljac = "id_prodavaca";
    private static final String tPrijemnica_idProdavac = "id_dobavljac";
    private static final String tPrijemnica_idArtikal = "id_artikal";
    private static final String tPrijemnica_visinaPdv = "visina_pdv";
    private static final String tPrijemnica_visinaRabat = "visina_rabat";
    private static final String tPrijemnica_nabavnaCena = "nabavna_cena";
    private static final String tPrijemnica_kolicina="kolicina";
    private static final String tPrijemnica_datumPrijema = "datum_prijema";

    private int idPrijemnca;
    private int idDobavljac;
    private int idArtikal;

    private Prijemnica prijemnica;
    private StavkaPrijemnice stavkaPrijemnice;
    
    public sqlPrijemnica(int _idPrijemnice) {
        this.idPrijemnca = _idPrijemnice;
    }
    

    public sqlPrijemnica(StavkaPrijemnice _stavkaPrijemnice) {
            
        this.stavkaPrijemnice=_stavkaPrijemnice;
        this.idPrijemnca=_stavkaPrijemnice.getId();
        
        if (_stavkaPrijemnice != null || _stavkaPrijemnice.getIdDobavljac() < 1) {
            this.idDobavljac = _stavkaPrijemnice.getId();
        }

    }

    public String SQLInsert_stavkuPrijemnica() {

        String sql = "INSERT INTO " + TABELA_Prijemnica + " ("
                + tPrijemnica_brojPrijemnice + " , "
                + tPrijemnica_idProdavac + ","
                + tPrijemnica_idDobavljac + " , "
                + tPrijemnica_idArtikal + " , "
                + tPrijemnica_visinaPdv + " , "
                + tPrijemnica_visinaRabat + " , "
                + tPrijemnica_nabavnaCena + " , "
                + tPrijemnica_kolicina + ","
                + tPrijemnica_datumPrijema + ") VALUE ('"
                
                    + this.stavkaPrijemnice.getBrojPrijemnice() + "',"
                    + this.stavkaPrijemnice.getIdProdavac() + ","
                    + this.stavkaPrijemnice.getIdDobavljac() + ","
                    + this.stavkaPrijemnice.getIdArtikal() + ","
                    + this.stavkaPrijemnice.getVisinaPdv() + ","
                    + this.stavkaPrijemnice.getVisinaRabat() + ","
                    + this.stavkaPrijemnice.getNabavnaCena() + ","
                    + this.stavkaPrijemnice.getKolicina() + ",'"   
                    + this.stavkaPrijemnice.getDatumPrijema() + "')";

        return sql;
    }

    public String SQLUpdate_stavkuPrijemnice() {
        
          String sql = "UPDATE " + TABELA_Prijemnica + " SET "
                + tPrijemnica_brojPrijemnice + "='" + this.stavkaPrijemnice.getBrojPrijemnice() + "'," 
                + tPrijemnica_idProdavac + "=" + this.stavkaPrijemnice.getIdProdavac() + ","
                + tPrijemnica_idDobavljac  + "=" + this.stavkaPrijemnice.getIdDobavljac() + "," 
                + tPrijemnica_idArtikal  + "=" + this.stavkaPrijemnice.getIdArtikal() + "," 
                + tPrijemnica_visinaPdv  + "=" + this.stavkaPrijemnice.getVisinaPdv() + "," 
                + tPrijemnica_visinaRabat  + "=" + this.stavkaPrijemnice.getVisinaRabat() + "," 
                + tPrijemnica_nabavnaCena  + "=" + this.stavkaPrijemnice.getNabavnaCena() + "," 
                + tPrijemnica_kolicina  + "=" + this.stavkaPrijemnice.getKolicina() + "," 
                + tPrijemnica_datumPrijema  + "='" + this.stavkaPrijemnice.getDatumPrijema() + "'"  
                + " WHERE " + tPrijemnica_id + "=" + this.idPrijemnca;
                
        return sql;
        
        
    }
    
    /**
     * Brisanje stavke prijemnice
     * @return 
     */
    public String SQLDelete_obrisiPrijemnicu() {
        
        String sql= "DELETE FROM " + TABELA_Prijemnica + " WHERE " + tPrijemnica_id + "=" + this.idPrijemnca;
        return sql;

    }

    public int getIdPrijemnca() {
        return idPrijemnca;
    }

    public void setIdPrijemnca(int idPrijemnca) {
        this.idPrijemnca = idPrijemnca;
    }

    public int getIdDobavljac() {
        return idDobavljac;
    }

    public void setIdDobavljac(int idDobavljac) {
        this.idDobavljac = idDobavljac;
    }

    public int getIdArtikal() {
        return idArtikal;
    }

    public void setIdArtikal(int idArtikal) {
        this.idArtikal = idArtikal;
    }

    public Prijemnica getPrijemnica() {
        return prijemnica;
    }

    public void setPrijemnica(Prijemnica prijemnica) {
        this.prijemnica = prijemnica;
    }

    public StavkaPrijemnice getStavkaPrijemnice() {
        return stavkaPrijemnice;
    }

    public void setStavkaPrijemnice(StavkaPrijemnice stavkaPrijemnice) {
        this.stavkaPrijemnice = stavkaPrijemnice;
    }

}
