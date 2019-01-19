/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka;

import java.sql.SQLException;
import java.sql.Statement;
import trgovina.bazapodataka.SQL.sqlPoruke;
import trgovina.bazapodataka.interfejsi.IPoruka;
import trgovina.bazapodataka.konekcija.TrgovinaDBKonektor;
import trgovina.model.pcg_poruke.Poruka;

/**
 *
 * @author borcha
 */
public class dbPoruka implements IPoruka{

    @Override
    public void SnimiPoruku(Poruka _poruka) {
        
        Statement izraz = null;
        sqlPoruke sqlporuke = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlporuke= new sqlPoruke(_poruka);
            boolean rez = izraz.execute(sqlporuke.SQLInsert_poruka());
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!rez) {
                System.out.println("Uspesno snimljena poruka!");
            } else {
                System.out.println("Neuspesno snimljena poruka!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
       
    }

    @Override
    public void IspraviPoruku(Poruka _poruka) {
        
        Statement izraz = null;
        sqlPoruke sqlporuke = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlporuke= new sqlPoruke(_poruka);
            boolean rez = izraz.execute(sqlporuke.SQLUpdate_poruka());
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!rez) {
                System.out.println("Uspesno ispravljena poruka!");
            } else {
                System.out.println("Neuspesno ispravljena poruka!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void IspraviPoruku(int _id, Poruka _poruka) {
        Statement izraz = null;
        sqlPoruke sqlporuke = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlporuke= new sqlPoruke(_id,_poruka);
            boolean rez = izraz.execute(sqlporuke.SQLUpdate_poruka());
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!rez) {
                System.out.println("Uspesno ispravljena poruka!");
            } else {
                System.out.println("Neuspesno ispravljena poruka!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ObrisiPoruku(int _id) {
         Statement izraz = null;
        sqlPoruke sqlporuke = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlporuke= new sqlPoruke(_id);
            boolean rez = izraz.execute(sqlporuke.SQLDelete_poruka());
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!rez) {
                System.out.println("Uspesno obrisana poruka!");
            } else {
                System.out.println("Neuspesno obrisana poruka!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  
    
}
