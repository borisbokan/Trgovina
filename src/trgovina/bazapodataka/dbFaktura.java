/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka;

import java.sql.SQLException;
import java.sql.Statement;
import trgovina.bazapodataka.SQL.sqlFaktura;
import trgovina.bazapodataka.interfejsi.IFaktura;
import trgovina.bazapodataka.konekcija.TrgovinaDBKonektor;
import trgovina.model.pcg_fakturisanje.Faktura;
import trgovina.model.pcg_fakturisanje.StavkaFakture;

/**
 *
 * @author borcha
 */
public class dbFaktura implements IFaktura{

  

    @Override
    public void SnimiStavkuFakture(StavkaFakture stavka) {
        
         Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlFaktura sqlfak = new sqlFaktura(stavka);
            boolean uspeh = izraz.execute(sqlfak.SQLInsert_faktura());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno snimljena stavka fakture.");
            } else {
                System.out.println("Neuspesno snimljena stavka fakture.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

    @Override
    public void IspraviStavkuFakture(StavkaFakture stavka) {
       
    }

    @Override
    public void ObrisiStavkuFakture(StavkaFakture stavka) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ObrisiStavkuFakture(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void SnimiFakturu(Faktura _faktura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
