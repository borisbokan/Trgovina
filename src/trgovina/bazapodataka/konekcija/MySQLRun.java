/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka.konekcija;

import java.sql.SQLException;
import java.sql.Statement;
import trgovina.bazapodataka.SQL.sqlLogovanje;

/**
 *
 * @author borcha
 */
public class MySQLRun {
    
    private Object sqlClass;
    private Object sqlClassArgu;
    private String sql;
    private String PorukaUspeh;
    private String PorukaNeUspeh;

    public MySQLRun(Object _sqlclass,Object _sqlClassArgu,String sql, String PorukaUspeh, String PorukaNeUspeh) {
        this.sql = sql;
        this.PorukaUspeh = PorukaUspeh;
        this.PorukaNeUspeh = PorukaNeUspeh;
        this.sqlClass=_sqlclass;
        this.sqlClassArgu=_sqlClassArgu;
        
        MyRun();
        
    }
    
    
    private void MyRun(){
//          Statement izraz = null;
//        
//        try {
//            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
//            sqlLogovanje sqllogovanje= new sqlLogovanje(this.sqlClassArgu);
//            boolean rez = izraz.execute(sqllogovanje.SQLUpdate_logovanje());
//            TrgovinaDBKonektor.PrekiniKonekciju();
//            if (!rez) {
//                System.out.println("Uspesno ispravljeno logovanje!");
//            } else {
//                System.out.println("Neuspesno ispravljeno logovanje!");
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
    
    
    
    
}
