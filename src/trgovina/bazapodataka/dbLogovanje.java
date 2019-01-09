/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka;

import java.sql.SQLException;
import java.sql.Statement;
import trgovina.bazapodataka.SQL.sqlDobavljac;
import trgovina.bazapodataka.SQL.sqlLogovanje;
import trgovina.bazapodataka.interfejsi.ILogovanje;
import trgovina.bazapodataka.konekcija.TrgovinaDBKonektor;
import trgovina.model.pcg_logovanje.Logovanje;

/**
 *
 * @author borcha
 */
public class dbLogovanje implements ILogovanje{

    @Override
    public void SnimiLogovanje(Logovanje _logovanje) {
        
         Statement izraz = null;
        
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlLogovanje sqllogovanje= new sqlLogovanje(_logovanje);
            boolean rez = izraz.execute(sqllogovanje.SQLInsert_logovanje());
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!rez) {
                System.out.println("Uspesno snimljeno logovanje!");
            } else {
                System.out.println("Neuspesno snimljeno logovanje!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
   @Override
    public void IspraviLOgovanje(Logovanje _logovanje) {
         Statement izraz = null;
        
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlLogovanje sqllogovanje= new sqlLogovanje(_logovanje);
            boolean rez = izraz.execute(sqllogovanje.SQLUpdate_logovanje());
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!rez) {
                System.out.println("Uspesno ispravljeno logovanje!");
            } else {
                System.out.println("Neuspesno ispravljeno logovanje!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
   @Override
    public void IspraviLOgovanje(int id, Logovanje _logovanje) {
        Statement izraz = null;
        
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlLogovanje sqllogovanje= new sqlLogovanje(id,_logovanje);
            boolean rez = izraz.execute(sqllogovanje.SQLUpdate_logovanje());
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!rez) {
                System.out.println("Uspesno ispravljeno logovanje!");
            } else {
                System.out.println("Neuspesno ispravljeno logovanje!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
            
    
    
    @Override
    public void ObrisiLogovanje(Logovanje _logovanje) {
        Statement izraz = null;
        
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlLogovanje sqllogovanje= new sqlLogovanje(_logovanje);
            boolean rez = izraz.execute(sqllogovanje.SQLDelete_logovanje());
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!rez) {
                System.out.println("Uspesno obrisano logovanje!");
            } else {
                System.out.println("Neuspesno obrisano logovanje!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ObrisLogovanje(int id) {
        Statement izraz = null;
        
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlLogovanje sqllogovanje= new sqlLogovanje(id);
            boolean rez = izraz.execute(sqllogovanje.SQLDelete_logovanje());
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!rez) {
                System.out.println("Uspesno obrisano logovanje!");
            } else {
                System.out.println("Neuspesno obrisano logovanje!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ObrisLogovanje(String _sessionId) {
         Statement izraz = null;
        
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlLogovanje sqllogovanje= new sqlLogovanje(_sessionId);
            boolean rez = izraz.execute(sqllogovanje.SQLDelete_logovanjeSession());
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!rez) {
                System.out.println("Uspesno obrisano logovanje!");
            } else {
                System.out.println("Neuspesno obrisano logovanje!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   


        
    
    
}
