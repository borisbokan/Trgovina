/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina;

import java.util.ArrayList;
import jdk.nashorn.internal.objects.NativeArray;
import trgovina.bazapodataka.dbPrijemnica;
import trgovina.bazapodataka.dbFaktura;
import trgovina.bazapodataka.dbPorudzbenica;
import trgovina.model.pcg_fakturisanje.StavkaFakture;
import trgovina.model.pcg_korpa.StavkaPorudzbenice;
import trgovina.pomocneklase.Mojformat;

/**
 *
 * @author borcha
 */
public class Trgovina {
        
        public static void main(String[] args){
                    
            
                      
            StavkaPorudzbenice stavka1=new StavkaPorudzbenice();
            stavka1.setId_artikal(12);
            stavka1.setKolicina(23);
            stavka1.setKupacPravnoIliFizicko("pravno");
            stavka1.setSifra_porudzbenice("190-198881");
            stavka1.setTipPordzbenice("tip1");
            stavka1.setVremePorucivanja(Mojformat.DateTime(2010, 4, 23, 12, 3, 0));
            
            StavkaPorudzbenice stavka2=new StavkaPorudzbenice();
            stavka2.setId_artikal(172);
            stavka2.setKolicina(12);
            stavka2.setKupacPravnoIliFizicko("pravno");
            stavka2.setSifra_porudzbenice("190-198881");
            stavka2.setTipPordzbenice("tip1");
            stavka2.setVremePorucivanja(Mojformat.DateTime(2010, 4, 23, 12, 3, 0));
            
            StavkaPorudzbenice stavka3=new StavkaPorudzbenice();
            stavka3.setId_artikal(278);
            stavka3.setKolicina(45);
            stavka3.setKupacPravnoIliFizicko("pravno");
            stavka3.setSifra_porudzbenice("190-198881");
            stavka3.setTipPordzbenice("tip1");
            stavka3.setVremePorucivanja(Mojformat.DateTime(2010, 4, 23, 12, 3, 0));
            
            
            ArrayList<StavkaPorudzbenice> stavke=new ArrayList<>();
            stavke.add(stavka1);
            stavke.add(stavka2);
            stavke.add(stavka3);
            
            
            
            dbPorudzbenica dbpor=new dbPorudzbenica();
            for(StavkaPorudzbenice stavka : stavke){
                dbpor.SnimiPorudbenicu(stavka);
            }
            
            
            
            
                    
            
            
        }
   
}

                                            
          