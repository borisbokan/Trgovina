/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka;

import java.sql.SQLException;
import java.sql.Statement;
import trgovina.bazapodataka.SQL.sqlRacunKupca;
import trgovina.bazapodataka.SQL.sqlTrosakKupca;
import trgovina.bazapodataka.interfejsi.IRacunKupca;
import trgovina.bazapodataka.konekcija.TrgovinaDBKonektor;
import trgovina.model.pcg_kupac.Trosak;
import trgovina.model.pcg_kupac.Uplata;

/**
 *
 * @author borcha
 */
public class dbRacunKupca implements IRacunKupca{

    @Override
    public void SnimiUplatu(Uplata _uplata) {
         Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlRacunKupca sqlracun = new sqlRacunKupca(_uplata);
            boolean uspeh = izraz.execute(sqlracun.SQLInsert_uplata());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno snimljena uplata.");
            } else {
                System.out.println("Neuspesno snimljena uplata.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void IspraviUplatu(Uplata _uplata) {
          Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlRacunKupca sqlracun = new sqlRacunKupca(_uplata);
            boolean uspeh = izraz.execute(sqlracun.SQLUpdate_uplata());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno ispravljena uplata.");
            } else {
                System.out.println("Neuspesno ispravljena uplata.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void IspraviUplatu(int id, Uplata _uplata) {
          Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlRacunKupca sqlracun = new sqlRacunKupca(_uplata);
            boolean uspeh = izraz.execute(sqlracun.SQLUpdate_uplata());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno ispravljena uplata.");
            } else {
                System.out.println("Neuspesno ispravljena uplata.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void ObrisiUplatu(Uplata _uplata) {
          Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlRacunKupca sqlracun = new sqlRacunKupca(_uplata);
            boolean uspeh = izraz.execute(sqlracun.SQLDelete_uplata());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno obrisana uplata.");
            } else {
                System.out.println("Neuspesno obrisana uplata.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void ObrisiUplatu(int _idUplate) {
           Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlRacunKupca sqlracun = new sqlRacunKupca(_idUplate);
            boolean uspeh = izraz.execute(sqlracun.SQLDelete_uplata());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno obrisana uplata.");
            } else {
                System.out.println("Neuspesno obrisana uplata.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void SnimiTrosak(Trosak _trosak) {
        Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlTrosakKupca sqlracun = new sqlTrosakKupca(_trosak);
            boolean uspeh = izraz.execute(sqlracun.SQLInsert_trosakKupca());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno snimljen trosak.");
            } else {
                System.out.println("Neuspesno snimljen trosak.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void IspraviTrosak(Trosak _trosak) {
        Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlTrosakKupca sqlracun = new sqlTrosakKupca(_trosak);
            boolean uspeh = izraz.execute(sqlracun.SQLUpdate_trosakKupca());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno ispravljen trosak.");
            } else {
                System.out.println("Neuspesno ispravljen trosak.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void IspraviTrosak(int id, Trosak _trosak) {
         Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlTrosakKupca sqlracun = new sqlTrosakKupca(id,_trosak);
            boolean uspeh = izraz.execute(sqlracun.SQLUpdate_trosakKupca());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno ispravljen trosak.");
            } else {
                System.out.println("Neuspesno ispravljen trosak.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    
    }

    @Override
    public void ObrisiTrosak(Trosak _trosak) {
         Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlTrosakKupca sqlracun = new sqlTrosakKupca(_trosak);
            boolean uspeh = izraz.execute(sqlracun.SQLDelete_trosakKupca());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno obrisan trosak.");
            } else {
                System.out.println("Neuspesno obrisan trosak.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

    @Override
    public void ObrisiTrosak(int _idTrosak) {
        
         Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlTrosakKupca sqlracun = new sqlTrosakKupca(_idTrosak);
            boolean uspeh = izraz.execute(sqlracun.SQLDelete_trosakKupca());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno obrisan trosak.");
            } else {
                System.out.println("Neuspesno obrisan trosak.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
   
    
    
}
