/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka.SQL;

import trgovina.model.pcg_logovanje.Logovanje;

/**
 *
 * @author borcha
 */
public class sqlLogovanje {
    
    
    private static final String TABELA_tLogovanje="tUlogovan";
    private static final String tLogovanje_id="id";
    private static final String tLogovanje_idKorisnik="id_korisnik";
    private static final String tLogovanje_vremeUlaska="vreme_ulaska";
    private static final String tLogovanje_vremeIzlaska="vreme_izlaska";
    private static final String tLogovanje_sessionId="session_id";

    private int id;
    private Logovanje logovanje;
    private String SessionId;
    
     public sqlLogovanje(String _sessionId) {
        this.SessionId=_sessionId;
    }
    
    public sqlLogovanje(int _id) {
        this.id=_id;
    }
    
    public sqlLogovanje(Logovanje _logovanje) {
        this.id = _logovanje.getId();
        this.logovanje=_logovanje;
        
    }
    
    public sqlLogovanje(int id, Logovanje logovanje) {
        this.id = id;
        this.logovanje = logovanje;
    }
    
    
    
    public String SQLInsert_logovanje(){
        String sql="INSERT INTO " + TABELA_tLogovanje + " (" + 
                tLogovanje_idKorisnik + "," + 
                tLogovanje_vremeUlaska + "," + 
                tLogovanje_vremeIzlaska + "," + 
                tLogovanje_sessionId + ") VALUE (" +
                    this.logovanje.getId_korisnik() + ",'" +
                    this.logovanje.getVremeUlaska() + "','" +
                    this.logovanje.getVremeIzlaska() + "','" +
                    this.logovanje.getSession_id() + "')";
        return sql;
    }
    
    
    public String SQLUpdate_logovanje(){
         String sql="UPDATE " + TABELA_tLogovanje + " SET " +
                 tLogovanje_idKorisnik + "=" + this.logovanje.getId_korisnik() + "," +
                tLogovanje_vremeUlaska + "='" + this.logovanje.getVremeUlaska() + "'," +
                tLogovanje_vremeIzlaska + "='" +  this.logovanje.getVremeIzlaska() + "'," +
                tLogovanje_sessionId + "='" + this.logovanje.getSession_id() + "'" + 
                    "  WHERE " + tLogovanje_id + "=" + this.id;
        return sql;
    }
    
    
    /**
     * Brise logovanje korisnika po id u
     * @return 
     */
    public String SQLDelete_logovanje(){
        String sql="DELETE FROM " + TABELA_tLogovanje + " WHERE " + tLogovanje_id + "=" + this.id;
        return sql; 
    }
    
    
    public String SQLDelete_logovanjeSession(){
        String sql="DELETE FROM " + TABELA_tLogovanje + " WHERE " + tLogovanje_id + "=" + this.SessionId;
        return sql; 
    }
    
    
   
    
}
