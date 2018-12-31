/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka.SQL;

import trgovina.model.pcg_kalkulacije.KalkulacijaNabavneCene;

/**
 *
 * @author borcha
 */
public class sqlKalkulacija {
    
    int id;
    
    private final static String TABELA_tKalkulacija="tKalkulacije";
    private final static String tKalkulacije_id="id";
    private final static String tKalkulacije_brojKalkulacije="broj_kalkulacije";
    private final static String tKalkulacije_datumKalkulacije="datum_kalkulacije";
    private final static String tKalkulacije_dodatniTroskovi="dodatni_trskovi";
    private final static String tKalkulacije_Marza="marza";
    private final static String tKalkulacije_Pdv="pdv";
    private final static String tKalkulacije_Rabat="rabat";
    private final static String tKalkulacije_idArtikal="id_artikal";

    private KalkulacijaNabavneCene kalkulacijaNabavneCene=new KalkulacijaNabavneCene();

    public sqlKalkulacija(int id) {
        this.id = id;
    }
        
      
    public sqlKalkulacija(KalkulacijaNabavneCene _kalkulacijaNabavneCene) {
        this.kalkulacijaNabavneCene=_kalkulacijaNabavneCene;
        this.id=this.kalkulacijaNabavneCene.getId();
        
        
    }
    
     public sqlKalkulacija(int _id,KalkulacijaNabavneCene _kalkulacijaNabavneCene) {
        this.kalkulacijaNabavneCene=_kalkulacijaNabavneCene;
        this.id=this.kalkulacijaNabavneCene.getId();
        this.id=_id;
        
    }
       
    /**
     * 
     * @return 
     */
    public String SQlInsert_kalkulaciju(){
        
        String sql="INSERT INTO " + TABELA_tKalkulacija + " (" +
                tKalkulacije_brojKalkulacije + "," +
                tKalkulacije_datumKalkulacije + "," +
                tKalkulacije_dodatniTroskovi+ "," +
                tKalkulacije_Marza+ "," +
                tKalkulacije_Pdv+ "," +
                tKalkulacije_Rabat+ "," +
                tKalkulacije_idArtikal + ") VALUE ('" +
                    this.kalkulacijaNabavneCene.getBrojKalkulacije() + "','" +
                    this.kalkulacijaNabavneCene.getDatumKalkulacije() + "'," +
                    this.kalkulacijaNabavneCene.getDodatniTroskovi() + "," +
                    this.kalkulacijaNabavneCene.getMarzaDouble() + "," +
                    this.kalkulacijaNabavneCene.getPdv() + "," +
                    this.kalkulacijaNabavneCene.getRabat() + "," +
                    this.kalkulacijaNabavneCene.getArtikal().getId()  + ");";
                    
                return sql;
                        
    }

    /**
     * 
     * @return 
     */
    public String SQlUpdate_kalkulaciju() {
        
        String sql="UPDATE " + TABELA_tKalkulacija + " SET " + 
            tKalkulacije_brojKalkulacije + "='" +  this.kalkulacijaNabavneCene.getBrojKalkulacije() + "'," +
            tKalkulacije_datumKalkulacije + "='" + this.kalkulacijaNabavneCene.getDatumKalkulacije() + "'," +
            tKalkulacije_dodatniTroskovi+ "=" + this.kalkulacijaNabavneCene.getDodatniTroskovi() + "," +
            tKalkulacije_Marza+ "=" + this.kalkulacijaNabavneCene.getMarzaDouble() + "," +
            tKalkulacije_Pdv+ "=" + this.kalkulacijaNabavneCene.getPdv() + "," +
            tKalkulacije_Rabat+ "=" + this.kalkulacijaNabavneCene.getRabat() + "," +
            tKalkulacije_idArtikal + "=" + this.kalkulacijaNabavneCene.getArtikal().getId() + 
                    " WHERE " + tKalkulacije_id + "=" + this.id; 
                
        return sql;
        
     }
    
    /**
     * 
     * @return 
     */
    public String SQLDelete_kalkulaciju(){
        String sql="DELETE FROM " + TABELA_tKalkulacija + " WHERE " + tKalkulacije_id + "=" + this.id;
        
        return sql;
    }
    
}
