/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka.SQL;
               
import trgovina.model.pcg_prijemnice.Prijemnica;

                    
/**
 *
 * @author root
 */
public class sqlPrijemnica {
            
                public  static final String  TABELA_Prijemnica="tPrijemnica";
                public  static final String   tPrijemnica_id="tPrijemnica_id";
                private static final String  tPrijemnica_brojPrijemnice =" broj_prijemnice"; 
                private static final String  tPrijemnica_idDobavljac ="id_dobavljac";
                private static final String  tPrijemnica_idArtikal="id_artikal";
                private static final String  tPrijemnica_visinaPdv="visina_pdv";
                private static final String  tPrijemnica_visinaRabat="visina_rabat";
                private static final String  tPrijemnica_nabavnaCena ="nabavna_cena";
                private static final String  tPrijemnica_datumPrijema ="datum_prijema";

                
                public sqlPrijemnica(int idprijemnice){
                    
                }
                
                
                public sqlPrijemnica(Prijemnica _prijemnica){
                            
                }
                
                    
                                public String SQLInsert_stavkuPrijemnica(){
                    return null;
                }
                
                
                                 public String SQLUpdate_stavkuPrijemnice(){
                    return null;
                }
                
                 
                                  public String SQLDelete_obrisiPrijemnicu(){
                    return null;
                }
                
}
