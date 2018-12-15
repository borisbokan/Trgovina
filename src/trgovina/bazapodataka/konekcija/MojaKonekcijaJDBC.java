package trgovina.bazapodataka.konekcija;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MojaKonekcijaJDBC extends MojaKonekcija {

    private Connection konekcija;
    private String sqLupit;


    public MojaKonekcijaJDBC(String imeBaze, String putanjaBaze, String korisnickoAdmin, String sifraAdmin) {
        super(imeBaze, putanjaBaze, korisnickoAdmin, sifraAdmin);

        OtvoriKonekciju();


    }

    public void OtvoriKonekciju() {

        this.setClassDriverIme("com.mysql.jdbc.Driver"); //Prepisujemo preko vrednosti u roditeljskoj klasi
        try {
            this.konekcija = DriverManager.getConnection(getPutanjaBaze(), getKorisnickoAdmin(), getSifraAdmin());


        } catch (SQLException e) {
            setPoruka(e.getMessage());
            e.printStackTrace();
        }
    }

    public void ZatvoriKonekciju() {
        try {

            if (!this.konekcija.isClosed()) {
                this.konekcija.close();
                this.konekcija = null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public String getSqLupit() {
        return sqLupit;
    }

    public void setSqLupit(String sqLupit) {
        this.sqLupit = sqLupit;
    }

    public Connection getKonekcija() {
        return this.konekcija;
    }

    public void setKonekcija(Connection kon) {
        this.konekcija = kon;
    }

    @Override
    public String getPoruka() {
        return super.getPoruka();
    }

    @Override
    public void setPoruka(String poruka) {
        super.setPoruka(poruka);
    }


    @Override
    public String getPorukaGreske() {
        return super.getPorukaGreske();
    }

    @Override
    public String getImeBaze() {
        return super.getImeBaze();
    }

    @Override
    public void setImeBaze(String imeBaze) {
        super.setImeBaze(imeBaze);
    }

    @Override
    public String getPutanjaBaze() {
        return super.getPutanjaBaze();
    }

    @Override
    public void setPutanjaBaze(String putanjaBaze) {
        super.setPutanjaBaze(putanjaBaze);
    }

    @Override
    public String getKorisnickoAdmin() {
        return super.getKorisnickoAdmin();
    }

    @Override
    public void setKorisnickoAdmin(String korisnickoAdmin) {
        super.setKorisnickoAdmin(korisnickoAdmin);
    }

    @Override
    public String getSifraAdmin() {
        return super.getSifraAdmin();
    }

    @Override
    public void setSifraAdmin(String sifraAdmin) {
        super.setSifraAdmin(sifraAdmin);
    }

    @Override
    public String getClassDriverIme() {
        return super.getClassDriverIme();
    }

    @Override
    public void setClassDriverIme(String classDriverIme) {
        super.setClassDriverIme(classDriverIme);
    }
}
