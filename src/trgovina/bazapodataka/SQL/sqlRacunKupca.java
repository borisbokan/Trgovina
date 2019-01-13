/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka.SQL;

import trgovina.model.pcg_kupac.Uplata;

/**
 *
 * @author borcha
 */
public class sqlRacunKupca {
    
    private static final String TABELA_tRacunKupca_ ="tRacunKupca";
    private static final String tRacunKupca_id="id";
    private static final String tRacunKupca_idKupac ="id_kupac";
    private static final String tRacunKupca_uplata ="uplata";
    private static final String tRacunKupca_opisUplate ="opis_uplate";
    private static final String tRacunKupca_datumUplate ="datum_uplate";
    
    private int id;
    private Uplata uplata;

    
    public sqlRacunKupca(int _id){
        this.id=_id;
    }
    
    public sqlRacunKupca(Uplata _uplata) {
        this.id=_uplata.getId();
        this.uplata=_uplata;
        
    }
    
    public sqlRacunKupca(int _id,Uplata _uplata) {
            this.uplata=_uplata;
            this.id=_id;
        
    }
        
    
    /**
     * Sql upit za snimanje uplate na racun kupca
     * @return 
     */
    public String SQLInsert_uplata() {
        String sql="INSERT INTO " + TABELA_tRacunKupca_ + "(" +
                tRacunKupca_idKupac + "," +
                tRacunKupca_uplata + "," +
                tRacunKupca_opisUplate + "," +
                tRacunKupca_datumUplate + ") VALUE (" +
                    this.uplata.getKupac().getId() + "," +
                    this.uplata.getIznosUplate() + ",'" +
                    this.uplata.getOpisUplate() + "','" +
                    this.uplata.getDatumUplate() + "');";
                
        return sql;
    }
    
    /**
     * Sql upit za ispravku uplate na racunu kupca
     * @return 
     */
    public String SQLUpdate_uplata(){
        String sql="UPDATE " + TABELA_tRacunKupca_ + " SET " +
                tRacunKupca_idKupac + "=" + this.uplata.getKupac().getId() + "," +
                tRacunKupca_uplata + "=" + this.uplata.getIznosUplate() + "," +
                tRacunKupca_opisUplate + "='" + this.uplata.getOpisUplate() + "'," +
                tRacunKupca_datumUplate + "='" + this.uplata.getDatumUplate() + "' "  +
                    " WHERE " + tRacunKupca_id + " = " + this.id;
                
        return sql;
    }
    
    
    /**
     * Sql upit za brisanje uplate sa racuna kupca 
     * @return 
     */
    public String SQLDelete_uplata(){
        String sql="DELETE FROM " + TABELA_tRacunKupca_ + " WHERE " + tRacunKupca_id + "=" + this.id;
        return sql;
    }
    
}
