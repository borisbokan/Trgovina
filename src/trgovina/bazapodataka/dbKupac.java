package trgovina.bazapodataka;

import java.sql.SQLException;
import java.sql.Statement;
import trgovina.bazapodataka.SQL.sqlKupac;
import trgovina.bazapodataka.interfejsi.IKupacFizickoLice;
import trgovina.bazapodataka.interfejsi.IKupacPravnoLice;
import trgovina.bazapodataka.konekcija.TrgovinaDBKonektor;
import trgovina.model.pcg_kupac.KupacFizickoLice;
import trgovina.model.pcg_kupac.KupacPravnoLice;

public class dbKupac implements IKupacPravnoLice,IKupacFizickoLice {
    
    
    //PRAVNO LICE
    @Override
    public void SnimiKupcaPL(KupacPravnoLice _kupac) {
               
        Statement izraz = null;
        sqlKupac sqlkupac = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija ().createStatement ();
            sqlkupac = new sqlKupac (_kupac);
            boolean rez = izraz.execute (sqlkupac.SQLInsert_SnimiKupca ());
            TrgovinaDBKonektor.PrekiniKonekciju ();
            if (!rez) {
                System.out.println ("Uspesno snimljen kupac!");
            } else {
                System.out.println ("Neuspesno snimljen kupac!");
            }

        } catch (SQLException e) {
            e.printStackTrace ();
        }

    }

    @Override
    public void IspraviKupcaPL(KupacPravnoLice _kupac) {
        Statement izraz = null;
        sqlKupac sqlkupac = null;
        
        try {
            izraz = TrgovinaDBKonektor.Konekcija ().createStatement ();
            sqlkupac = new sqlKupac (_kupac);
            boolean rez = izraz.execute (sqlkupac.SQLUpdate_IspraviKupca ());
            TrgovinaDBKonektor.PrekiniKonekciju ();
            if (!rez) {
                System.out.println ("Uspesno ispravljen kupac!");
            } else {
                System.out.println ("Neuspesno ispravljen kupac!");
            }

        } catch (SQLException e) {
            e.printStackTrace ();
        }
        
    }

    @Override
    public void ObrisiKupcaPL(KupacPravnoLice _kupac) {
        Statement izraz = null;
        sqlKupac sqlkupac = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija ().createStatement ();
            sqlkupac = new sqlKupac (_kupac.getId ());
            boolean rez = izraz.execute (sqlkupac.SQLDelete_ObrisiKupca ());
            TrgovinaDBKonektor.PrekiniKonekciju ();
            if (!rez) {
                System.out.println ("Uspesno obrisan kupac!");
            } else {
                System.out.println ("Neuspesno obrisan kupac!");
            }

        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    @Override
    public void ObrisiKupcaPL (int idKupac) {
        
        Statement izraz = null;
        sqlKupac sqlkupac = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija ().createStatement ();
            sqlkupac = new sqlKupac (idKupac);
            boolean rez = izraz.execute (sqlkupac.SQLDelete_ObrisiKupca ());
            TrgovinaDBKonektor.PrekiniKonekciju ();
            if (!rez) {
                System.out.println ("Uspesno obrisan kupac!");
            } else {
                System.out.println ("Neuspesno obrisan kupac!");
            }

        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }
    
    

    @Override
    public KupacPravnoLice getKupacPravnoLice(KupacPravnoLice _kupac) {
        return null;
        //TODO: Uraditi upit za vracanje objekta kupca pravno lice.
    }
    
    //FIZICKO LICE

    @Override
    public void SnimiKupcaFL (KupacFizickoLice _kupac) {
        throw new UnsupportedOperationException ("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    @Override
    public void IspraviKupcaFL (KupacFizickoLice _kupac) {
        throw new UnsupportedOperationException ("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    @Override
    public void ObrisiKupcaFL (KupacFizickoLice _kupac) {
        throw new UnsupportedOperationException ("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    @Override
    public KupacFizickoLice getKupacFizickoLice (KupacFizickoLice _kupac) {
        throw new UnsupportedOperationException ("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
