/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka.SQL;

import java.sql.Timestamp;
import org.omg.CORBA._PolicyStub;
import trgovina.model.pcg_kupac.Kupac;
import trgovina.model.pcg_poruke.Poruka;
import trgovina.model.pcg_prodavac.Prodavac;

/**
 *
 * @author borcha
 */
public class sqlPoruke {
    
    private static final String TABELA_tPoruke="tPoruke";
    private static final String tPoruke_id="id";
    private static final String tPoruke_idKupac="id_kupac";
    private static final String tPoruke_idProdavac="id_prodavac";
    private static final String tPoruke_idDijalog="id_dijalog";
    private static final String tPoruke_poruka="poruka";
    private static final String tPoruka_procitano="procitano";
    private static final String tPoruke_vremePoruke="vreme_poruke";
    
    private int id;
    private Poruka poruka;

    public sqlPoruke(int _id) {
        this.id=_id;
    }
    
    public sqlPoruke(Poruka _poruka){
        this.poruka=_poruka;
    }

    public sqlPoruke(int id, Poruka poruka) {
        this.id = id;
        this.poruka = poruka;
    }
    
    
     public String SQLInsert_poruka(){
        String sql="INSERT INTO " + TABELA_tPoruke + " (" +
                tPoruke_idKupac  + "," +
                tPoruke_idProdavac  + "," +
                tPoruke_idDijalog + "," +
                tPoruke_poruka  + "," +
                tPoruka_procitano + "," +
                tPoruke_vremePoruke + ") VALUE (" + 
                 this.poruka.getKupac().getId() + "," +
                 this.poruka.getProdavac().getId() + ",'" +
                 this.poruka.getIdDijalog() + "','" +
                 this.poruka.getPoruka() + "'," +
                 this.poruka.isProcitano() + ",'" +
                 this.poruka.getVremePoruke() + "')";
        
        return sql;
    }
    
    /**
     * Ispravak poruke ili dijaloga.
     * @return 
     */
    public String SQLUpdate_poruka(){
        String sql="UPDATE " + TABELA_tPoruke + " SET " +
                  tPoruke_idKupac  + "=" +  this.poruka.getKupac().getId() + ","+ 
                  tPoruke_idProdavac  + "=" + this.poruka.getProdavac().getId() + "," +
                  tPoruke_idDijalog + "='" + this.poruka.getIdDijalog() + "'," +
                  tPoruke_poruka  + "='" + this.poruka.getPoruka() + "'," +
                  tPoruka_procitano  + "=" + this.poruka.isProcitano() + "," +
                  tPoruke_vremePoruke + "='" + this.poruka.getVremePoruke() + "'" + 
                    " WHERE " + tPoruke_id + "=" + this.id;
        return sql;
    }
    
    /**
     * Brisanje poruke.
     * @return 
     */
    public String SQLDelete_poruka(){
        String sql="DELETE FROM " + TABELA_tPoruke + " WHERE " + tPoruke_id + "=" + this.id;
        return sql;
    }
        
    
}
