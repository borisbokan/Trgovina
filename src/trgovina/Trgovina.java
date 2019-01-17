
package trgovina;

import trgovina.bazapodataka.dbPoruka;
import trgovina.model.pcg_kupac.Kupac;
import trgovina.model.pcg_poruke.Poruka;
import trgovina.model.pcg_prodavac.Prodavac;
import trgovina.pomocneklase.Mojformat;

/**
 *
 * @author borcha
 */
public class Trgovina {
        
        public static void main(String[] args){
            
                    
            dbPoruka dbporuka=new dbPoruka();
            dbporuka.ObrisiPoruku(3);//Brisanje poruka
            
            
                   
        }
   
}

                                            
          