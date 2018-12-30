package trgovina.bazapodataka.konekcija;

import java.sql.Connection;

public class TrgovinaDBKonektor {

    private static MojaKonekcijaJDBC mojaKonn = null;

    public static Connection Konekcija() {
        mojaKonn = new MojaKonekcijaJDBC("trgovina", "jdbc:mysql://localhost/trgovina", "root", "");

        return mojaKonn.getKonekcija();


    }


    public static void PrekiniKonekciju() {
        mojaKonn.ZatvoriKonekciju();
    }


}
