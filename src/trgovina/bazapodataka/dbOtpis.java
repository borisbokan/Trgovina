/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import trgovina.bazapodataka.SQL.sqlArtikal;
import trgovina.bazapodataka.SQL.sqlOtpis;
import trgovina.bazapodataka.interfejsi.IOtpis;
import trgovina.bazapodataka.konekcija.TrgovinaDBKonektor;
import trgovina.model.pcg_otpis.StavkaOtpisa;

/**
 *
 * @author borcha
 */
public class dbOtpis implements IOtpis{

    @Override
    public void SnimiStavkuOtpisa(StavkaOtpisa _stavka) {
         Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlOtpis sqlotpis = new sqlOtpis(_stavka);
            boolean uspeh = izraz.execute(sqlotpis.SQLInsert_otpis());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno snimljena stavka otpisa");
            } else {
                System.out.println("Neuspesno snimljena stavka otpisa");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void SnimiStavkeOtpisa(ArrayList<StavkaOtpisa> _stavke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void IspravkiStavkuOtpisa(int _id, StavkaOtpisa _stavka) {
          Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlOtpis sqlotpis = new sqlOtpis(_id,_stavka);
            boolean uspeh = izraz.execute(sqlotpis.SQLUpdate_otpis());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno ispravljena stavka otpisa");
            } else {
                System.out.println("Neuspesno ispravljena stavka otpisa");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

      @Override
    public void IspraviSTavkuOtpisa(StavkaOtpisa _stavka) {
           Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlOtpis sqlotpis = new sqlOtpis(_stavka);
            boolean uspeh = izraz.execute(sqlotpis.SQLUpdate_otpis());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno ispravljena stavka otpisa");
            } else {
                System.out.println("Neuspesno ispravljena stavka otpisa");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
    
    @Override
    public void ObrisiStavkuOtpisa(int id) {
          Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlOtpis sqlotpis = new sqlOtpis(id);
            boolean uspeh = izraz.execute(sqlotpis.SQLDelete_otpis());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno obrisana stavka otpisa");
            } else {
                System.out.println("Neuspesno obrisana stavka otpisa");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void ObrisiStavkuOtpisa(StavkaOtpisa _stavka) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
    
}
