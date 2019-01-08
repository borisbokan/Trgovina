/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka.SQL;

import trgovina.model.pcg_otpis.StavkaOtpisa;

/**
 *
 * @author borcha
 */
public class sqlOtpis {
    
        private static final String TABELA_tOtpis="tOtpis"; 
        private static final String tOtpis_id="id";
        private static final String tOtpis_brojOtpisa="broj_otpisa";
        private static final String tOtpis_idArtikal="id_artikal";
        private static final String tOtpis_kolicina="kolicina";
        private static final String tOtpis_vreme="vreme";

        private StavkaOtpisa stavka;
        private int id;

        public sqlOtpis(int id) {
            this.id = id;
        }

        
        
        
        public sqlOtpis(int id,StavkaOtpisa _stavka) {
            this.id=id;
             this.stavka=_stavka;
        }
        
        
        
        
        public sqlOtpis(StavkaOtpisa _stavka){
            this.id=_stavka.getId();
            this.stavka=_stavka;
                   
        }
        
    
        public String SQLInsert_otpis(){
            
            String sql="INSERT INTO " + TABELA_tOtpis + " (" +
                    tOtpis_brojOtpisa + "," + 
                    tOtpis_idArtikal + "," + 
                    tOtpis_kolicina + "," + 
                    tOtpis_vreme + ") VALUE ('" +
                        this.stavka.getBrojOtpisa() + "'," +
                        this.stavka.getArtikal().getId() + "," +
                        this.stavka.getKolicina() + ",'" +
                        this.stavka.getVreme() + "')";
                                                
                    
            return sql;
            
        }
        
        
        public String SQLUpdate_otpis(){
            String sql="UPDATE " + TABELA_tOtpis + " SET "  +
                    tOtpis_brojOtpisa + "='"  + this.stavka.getBrojOtpisa() + "'," +
                    tOtpis_idArtikal + "=" + this.stavka.getArtikal().getId() + "," +
                    tOtpis_kolicina + "=" + this.stavka.getKolicina() + "," +
                    tOtpis_vreme + "='" + this.stavka.getVreme() + 
                    "' WHERE " + tOtpis_id + "=" + this.id;
                    
            return sql;
        }
        
        
        
        
        public String SQLDelete_otpis(){
            String sql="DELETE FROM " + TABELA_tOtpis + " WHERE " + tOtpis_id + "=" + this.id;
            return sql;
        }
    
    
}
