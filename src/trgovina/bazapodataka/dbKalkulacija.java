package trgovina.bazapodataka;

import java.sql.SQLException;
import java.sql.Statement;
import trgovina.bazapodataka.interfejsi.IKalkulacija;
import trgovina.model.pcg_kalkulacije.KalkulacijaNabavneCene;

import java.util.ArrayList;
import trgovina.bazapodataka.SQL.sqlArtikal;
import trgovina.bazapodataka.SQL.sqlKalkulacija;
import trgovina.bazapodataka.konekcija.TrgovinaDBKonektor;

public class dbKalkulacija implements IKalkulacija {


    @Override
    public void SnimiKalkulaciju(KalkulacijaNabavneCene kalkulacijaNabavneCene) {
         Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlKalkulacija sqlartikal = new sqlKalkulacija(kalkulacijaNabavneCene);
            boolean uspeh = izraz.execute(sqlartikal.SQlInsert_kalkulaciju());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno snimljena kalkulacija  artikla.");
            } else {
                System.out.println("Neuspesno snimljena kalkulacija  artikla.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void IspraviKalkulaciju(KalkulacijaNabavneCene kalkulacijaNabavneCene) {
          Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlKalkulacija sqlartikal = new sqlKalkulacija(kalkulacijaNabavneCene);
            boolean uspeh = izraz.execute(sqlartikal.SQlUpdate_kalkulaciju());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno ispravljena kalkulacija artikla.");
            } else {
                System.out.println("Neuspesno ispravljena kalkulacija artikla.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }       
    }

      @Override
    public void IspraviKalkulaciju(int id,KalkulacijaNabavneCene kalkulacijaNabavneCene) {
            Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlKalkulacija sqlartikal = new sqlKalkulacija(id);
            boolean uspeh = izraz.execute(sqlartikal.SQLDelete_kalkulaciju());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno ispravljena kalkulacija artikla.");
            } else {
                System.out.println("Neuspesno ispravljena kalkulacija artikla.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }       
    }
    
    @Override
    public void ObrisKalkulaciju(KalkulacijaNabavneCene kalkulacijaNabavneCene) {
                Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlKalkulacija sqlartikal = new sqlKalkulacija(kalkulacijaNabavneCene);
            boolean uspeh = izraz.execute(sqlartikal.SQLDelete_kalkulaciju());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno obrisana kalkulacija artikla.");
            } else {
                System.out.println("Neuspesno obrisana kalkulacija artikla.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }       
    }
    
    
     @Override
    public void ObrisKalkulaciju(int id) {
              Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlKalkulacija sqlartikal = new sqlKalkulacija(id);
            boolean uspeh = izraz.execute(sqlartikal.SQlUpdate_kalkulaciju());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno obrisana kalkulacija artikla.");
            } else {
                System.out.println("Neuspesno obrisana kalkulacija artikla.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }       
    }

    
    @Override
    public ArrayList<KalkulacijaNabavneCene> getListaKalkulacije(int brojKalkulacije) {
        return null;
    }

    @Override
    public ArrayList<KalkulacijaNabavneCene> getListaKalkulacije(KalkulacijaNabavneCene kalkulacijaNabavneCene) {
        return null;
    }

   
  
}
