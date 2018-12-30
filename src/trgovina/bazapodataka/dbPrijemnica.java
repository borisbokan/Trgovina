package trgovina.bazapodataka;

import java.sql.SQLException;
import java.sql.Statement;
import trgovina.bazapodataka.interfejsi.IPrijemnica;
import trgovina.bazapodataka.SQL.sqlPrijemnica;
import trgovina.bazapodataka.konekcija.TrgovinaDBKonektor;
import trgovina.model.pcg_prijemnice.StavkaPrijemnice;

public class dbPrijemnica implements IPrijemnica {

   
    @Override
    public void SnimiPrijemnicu(StavkaPrijemnice stavkaPrijemnice) {
                
        Statement izraz = null;
        sqlPrijemnica sqlprijemnica=null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            
            sqlprijemnica = new sqlPrijemnica(stavkaPrijemnice);
            boolean uspeh = izraz.execute(sqlprijemnica.SQLInsert_stavkuPrijemnica());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno snimljena stavka prijemnice.");
            } else {
                System.out.println("Neuspesno snimljena stavka prijemnice.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
        
    }
    
     @Override
    public void IspraviPrijemnicu(StavkaPrijemnice stavkaPrijemnice) {
                
         Statement izraz = null;
        sqlPrijemnica sqlprijemnica=null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            
            sqlprijemnica = new sqlPrijemnica(stavkaPrijemnice);
            boolean uspeh = izraz.execute(sqlprijemnica.SQLUpdate_stavkuPrijemnice());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno ispravljena stavka prijemnice.");
            } else {
                System.out.println("Neuspesno ispravljena stavka prijemnice.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
        
        
    }
    
      @Override
    public void IspraviPrijemnicu(int idStavkaPrijemnice) {
                
         Statement izraz = null;
        sqlPrijemnica sqlprijemnica=null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            
            sqlprijemnica = new sqlPrijemnica(idStavkaPrijemnice);
            boolean uspeh = izraz.execute(sqlprijemnica.SQLDelete_obrisiPrijemnicu());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno obrisana stavka prijemnice.");
            } else {
                System.out.println("Neuspesno obrisana stavka prijemnice.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
        
        
    }
    
    @Override
    public void ObrisiPrijemnicu(StavkaPrijemnice stavkaPrijemnice) {
       
         Statement izraz = null;
        sqlPrijemnica sqlprijemnica=null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            
            sqlprijemnica = new sqlPrijemnica(stavkaPrijemnice);
            boolean uspeh = izraz.execute(sqlprijemnica.SQLDelete_obrisiPrijemnicu());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno obrisana stavka prijemnice.");
            } else {
                System.out.println("Neuspesno obrisana stavka prijemnice.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    
}
