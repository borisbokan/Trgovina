/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import trgovina.bazapodataka.SQL.sqlKorisnik;
import trgovina.bazapodataka.SQL.sqlPorudzbina;
import trgovina.bazapodataka.interfejsi.IPorudzbenica;
import trgovina.bazapodataka.konekcija.TrgovinaDBKonektor;
import trgovina.model.pcg_artikal.Artikal;
import trgovina.model.pcg_korpa.StavkaPorudzbenice;

/**
 *
 * @author borcha
 */
public class dbPorudzbenica implements IPorudzbenica{

    @Override
    public void SnimiPorudzbenicu(StavkaPorudzbenice stavkaPorudzbenice) {
         //Sql izraz
        Statement izraz = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();

            //Slanje novog korisnika ka SQL upitu
            sqlPorudzbina sqlkor = new sqlPorudzbina(stavkaPorudzbenice);
            //Realizacija sql upita i vracanej bulove o uspesnosti (True ako je sve ok)
            boolean uspeh = izraz.execute(sqlkor.SQLinsert_stavkaPorudzbine());
            //Zatvaranje konekcije koja je otvorena u konstruktoru
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!uspeh) {
                System.out.println("");
                System.out.println("Uspesno snimljena stavka porudzbenice!");
            } else {
                System.out.println("");
                System.out.println("Snimanje snimljena stavka porudzbenice!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    @Override
    public void SnimiStavkePorudbzenice(ArrayList<StavkaPorudzbenice> stavkePorudbenice) {
              
       
        for(StavkaPorudzbenice stavka : stavkePorudbenice){
           this.SnimiPorudzbenicu(stavka);
        }
          
     
    }
    
    @Override
    public void IspraviPorudzbenicu(StavkaPorudzbenice stavkaPorudzbenice) {
           //Sql izraz
        Statement izraz = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();

            //Slanje novog korisnika ka SQL upitu
            sqlPorudzbina sqlkor = new sqlPorudzbina(stavkaPorudzbenice);
            //Realizacija sql upita i vracanej bulove o uspesnosti (True ako je sve ok)
            boolean uspeh = izraz.execute(sqlkor.SQLUpdate_stavkaPorudzbenice());
            //Zatvaranje konekcije koja je otvorena u konstruktoru
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!uspeh) {
                System.out.println("");
                System.out.println("Uspesno ispravljena stavka porudzbenice!");
            } else {
                System.out.println("");
                System.out.println("Snimanje ispravljena stavka porudzbenice!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void IspraviPorudzbenicu(int id, StavkaPorudzbenice stavkaPorudzbenice) {
           //Sql izraz
        Statement izraz = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();

            //Slanje novog korisnika ka SQL upitu
            sqlPorudzbina sqlkor = new sqlPorudzbina(id,stavkaPorudzbenice);
            //Realizacija sql upita i vracanej bulove o uspesnosti (True ako je sve ok)
            boolean uspeh = izraz.execute(sqlkor.SQLUpdate_stavkaPorudzbenice());
            //Zatvaranje konekcije koja je otvorena u konstruktoru
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!uspeh) {
                System.out.println("");
                System.out.println("Uspesno ispravljena stavka porudzbenice!");
            } else {
                System.out.println("");
                System.out.println("Snimanje ispravljena stavka porudzbenice!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ObrisiPorudzbenicu(StavkaPorudzbenice stavkaPorudzbenice) {
            //Sql izraz
        Statement izraz = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();

            //Slanje novog korisnika ka SQL upitu
            sqlPorudzbina sqlkor = new sqlPorudzbina(stavkaPorudzbenice);
            //Realizacija sql upita i vracanej bulove o uspesnosti (True ako je sve ok)
            boolean uspeh = izraz.execute(sqlkor.SQLDelete_porudzbenica());
            //Zatvaranje konekcije koja je otvorena u konstruktoru
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!uspeh) {
                System.out.println("");
                System.out.println("Uspesno obrisana stavka porudzbenice!");
            } else {
                System.out.println("");
                System.out.println("Brisanje stavke porudzbenice!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ObrisiPorudzbenicu(int _id) {
            //Sql izraz
        Statement izraz = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();

            //Slanje novog korisnika ka SQL upitu
            sqlPorudzbina sqlkor = new sqlPorudzbina(_id);
            //Realizacija sql upita i vracanej bulove o uspesnosti (True ako je sve ok)
            boolean uspeh = izraz.execute(sqlkor.SQLDelete_porudzbenica());
            //Zatvaranje konekcije koja je otvorena u konstruktoru
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!uspeh) {
                System.out.println("");
                System.out.println("Uspesno obrisana stavka porudzbenice!");
            } else {
                System.out.println("");
                System.out.println("Brisanje stavke porudzbenice!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Artikal> getSadrzajPorudzbenice(String sifraPorudzbenice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //TODO: Uraditi uzimanje liste porudzbenice
    }

   
    
}
