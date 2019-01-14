/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka.SQL;

import trgovina.model.pcg_kupac.Trosak;

/**
 *
 * @author borcha
 */
public class sqlTrosakKupca {
    
    private static final String TABELA_tTrosakKupca="tTrosakKupca";
    private static final String tTrosakKupca_id="id";
    private static final String tTrosakKupca_idKupac="id_kupac";
    private static final String tTrosakKupca_potrosenaSuma="potrosena_suma";
    private static final String tTrosakKupca_opisPotrosnje="opis_potrosnje";
    private static final String tTrosakKupca_vremePotrosnje="vreme_potrosnje";
    
    private int id;
    private Trosak trosak;
 
    public sqlTrosakKupca(int _id) {
        this.id=_id;
    }

    public sqlTrosakKupca(int id, Trosak trosak) {
        this.id = id;
        this.trosak = trosak;
    }
    
    public sqlTrosakKupca(Trosak _trosak) {
        this.id = _trosak.getId();
        this.trosak = _trosak;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Trosak getTrosak() {
        return trosak;
    }

    public void setTrosak(Trosak trosak) {
        this.trosak = trosak;
    }
    
    public String SQLInsert_trosakKupca(){
        
        String sql="INSERT INTO " + TABELA_tTrosakKupca + " (" +
                 tTrosakKupca_idKupac  + "," +
                 tTrosakKupca_potrosenaSuma  + "," +
                 tTrosakKupca_opisPotrosnje  + "," +
                 tTrosakKupca_vremePotrosnje  + ") VALUE (" +
                    this.trosak.getKupac().getId()+ "," +
                    this.trosak.getSuma() + ",'" +
                    this.trosak.getOpisTroska() + "','" +
                    this.trosak.getDatumTroska() + "')";
                        
                    
        return sql;
        
    }
    
    
    public String SQLUpdate_trosakKupca(){
        String sql="UPDATE " + TABELA_tTrosakKupca+ " SET " +
                 tTrosakKupca_idKupac  + "=" + this.trosak.getKupac().getId() + "," +
                 tTrosakKupca_potrosenaSuma  + "=" + this.trosak.getSuma() + "," +
                 tTrosakKupca_opisPotrosnje  + "='" + this.trosak.getOpisTroska() + "'," +
                 tTrosakKupca_vremePotrosnje + "='" + this.trosak.getDatumTroska() + "'";
        return sql;
    }
    
    
    public String SQLDelete_trosakKupca(){
        String sql="DELETE FROM " + TABELA_tTrosakKupca + " WHERE " + tTrosakKupca_id + " = " + this.id;
        return sql;
    }
    
}
