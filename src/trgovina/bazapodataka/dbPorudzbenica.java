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
    public void SnimiPorudbenicu(StavkaPorudzbenice stavkaPorudzbenice) {
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
    public void IspraviPorudbenicu(StavkaPorudzbenice stavkaPorudzbenice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void IspraviPorudbenicu(int id, StavkaPorudzbenice stavkaPorudzbenice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ObrisiPorudbenicu(StavkaPorudzbenice stavkaPorudzbenice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ObrisiPorudbenicu(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Artikal> getSadrzajPorudbenice(String sifraPorudzbenice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
