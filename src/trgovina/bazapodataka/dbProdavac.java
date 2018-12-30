package trgovina.bazapodataka;

import java.sql.SQLException;
import java.sql.Statement;
import trgovina.bazapodataka.interfejsi.IProdavacPravnoLice;
import trgovina.model.pcg_prodavac.ProdavacPravnoLice;

import java.util.ArrayList;
import trgovina.bazapodataka.SQL.sqlDobavljac;
import trgovina.bazapodataka.SQL.sqlProdavac;
import trgovina.bazapodataka.interfejsi.IProdavacFizickoLice;
import trgovina.bazapodataka.konekcija.TrgovinaDBKonektor;
import trgovina.model.pcg_prodavac.ProdavacFizickoLice;

public class dbProdavac implements IProdavacPravnoLice,IProdavacFizickoLice {

    @Override
    public void SnimiProdavacPL(ProdavacPravnoLice _prodavac) {
         Statement izraz = null;
        sqlProdavac sqlprodavac=null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            
            sqlprodavac = new sqlProdavac(_prodavac);
            boolean uspeh = izraz.execute(sqlprodavac.SQLInsert_prodavaca());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno snimljen prodavac.");
            } else {
                System.out.println("Neuspesno snimljen prodavac.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
            
    }

    @Override
    public void IspraviProdavacPL(ProdavacPravnoLice _prodavac) {
        Statement izraz = null;
        sqlProdavac sqlprodavac=null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            
            sqlprodavac = new sqlProdavac(_prodavac);
            boolean uspeh = izraz.execute(sqlprodavac.SQLUpdate_prodavac());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno ispravljen prodavac.");
            } else {
                System.out.println("Neuspesno ispravljen prodavac.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }     
    }

    
    @Override
    public void ObrisiProdavacPL(ProdavacPravnoLice _prodavac) {
        Statement izraz = null;
        sqlProdavac sqlprodavac=null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            
            sqlprodavac = new sqlProdavac(_prodavac);
            boolean uspeh = izraz.execute(sqlprodavac.SQLDelete_prodavac());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno obrisan prodavac.");
            } else {
                System.out.println("Neuspesno obrisan prodavac.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }                
    }

    @Override
    public void ObrisiProdavacPL(int id) {
         Statement izraz = null;
        sqlProdavac sqlprodavac=null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            
            sqlprodavac = new sqlProdavac(id);
            boolean uspeh = izraz.execute(sqlprodavac.SQLDelete_prodavac());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno obrisan prodavac.");
            } else {
                System.out.println("Neuspesno obrisan prodavac.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }                
    }
    
    
    @Override
    public ProdavacPravnoLice getProdavacaPravnooLice(ProdavacPravnoLice _prodavac) {
        return null;
    }

    @Override
    public ArrayList<ProdavacPravnoLice> getProdavciPL() {
        return null;
    }

    @Override
    public void SnimiProdavacFL(ProdavacFizickoLice _prodavac) {
            Statement izraz = null;
        sqlProdavac sqlprodavac=null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            
            sqlprodavac = new sqlProdavac(_prodavac);
            boolean uspeh = izraz.execute(sqlprodavac.SQLInsert_prodavaca());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno snimljen prodavac.");
            } else {
                System.out.println("Neuspesno snimljen prodavac.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void IspraviProdavacFL(ProdavacFizickoLice _prodavac) {
        
          Statement izraz = null;
        sqlProdavac sqlprodavac=null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            
            sqlprodavac = new sqlProdavac(_prodavac);
            boolean uspeh = izraz.execute(sqlprodavac.SQLUpdate_prodavac());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno ispravljen prodavac.");
            } else {
                System.out.println("Neuspesno ispravljen prodavac.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }     
    }

    @Override
    public void ObrisiProdavacFL(ProdavacFizickoLice _prodavac) {
        
         Statement izraz = null;
        sqlProdavac sqlprodavac=null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            
            sqlprodavac = new sqlProdavac(_prodavac);
            boolean uspeh = izraz.execute(sqlprodavac.SQLDelete_prodavac());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno obrisan prodavac.");
            } else {
                System.out.println("Neuspesno obrisan prodavac.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }                
    }
    
    
     @Override
    public void ObrisiProdavacFL(int id) {
        
          Statement izraz = null;
        sqlProdavac sqlprodavac=null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            
            sqlprodavac = new sqlProdavac(id);
            boolean uspeh = izraz.execute(sqlprodavac.SQLDelete_prodavac());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno obrisan prodavac.");
            } else {
                System.out.println("Neuspesno obrisan prodavac.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }            
    }
    
    @Override
    public ProdavacFizickoLice getProdavacFizickoLice(ProdavacFizickoLice _prodavac) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ProdavacFizickoLice> getProdavciFL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
}
