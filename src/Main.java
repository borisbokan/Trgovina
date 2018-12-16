
import trgovina.bazapodataka.dbPrijemnica;
import trgovina.model.pcg_prijemnice.StavkaPrijemnice;
import trgovina.pomocneklase.Mojformat;




public class Main {

    public static void main (String[] arg) {
           
        
        StavkaPrijemnice stavkaPrijemnice=new StavkaPrijemnice();
        stavkaPrijemnice.setId(3);
       
        
        dbPrijemnica dbStvakaPrijmenice=new dbPrijemnica();
        dbStvakaPrijmenice.ObrisiPrijemnicu(stavkaPrijemnice);
        
        
       
    }

}
