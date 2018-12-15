package trgovina.bazapodataka.konekcija;


import java.sql.Statement;

public class MojaKonekcija {

    private String Poruka;
    private Statement izraz;

    private String ImeBaze;
    private String PutanjaBaze;// "jdbc:mysql://localhost/feedback?user=sqluser&password=sqluserpw"
    private String KorisnickoAdmin;
    private String SifraAdmin;
    private String ClassDriverIme;//Ako je za JDBC ide : "com.mysql.jdbc.Driver"

    /**
     * @param imeBaze
     * @param putanjaBaze
     * @param korisnickoAdmin
     * @param sifraAdmin
     */
    public MojaKonekcija(String imeBaze, String putanjaBaze, String korisnickoAdmin, String sifraAdmin) {
        ImeBaze = imeBaze;
        PutanjaBaze = putanjaBaze;
        KorisnickoAdmin = korisnickoAdmin;
        SifraAdmin = sifraAdmin;

    }


    public String getPoruka() {
        return Poruka;
    }

    public void setPoruka(String poruka) {
        Poruka = poruka;
    }


    public String getPorukaGreske() {
        return this.Poruka;
    }


    public String getImeBaze() {
        return ImeBaze;
    }

    public void setImeBaze(String imeBaze) {
        ImeBaze = imeBaze;
    }

    public String getPutanjaBaze() {
        return PutanjaBaze;
    }

    public void setPutanjaBaze(String putanjaBaze) {
        PutanjaBaze = putanjaBaze;
    }

    public String getKorisnickoAdmin() {
        return KorisnickoAdmin;
    }

    public void setKorisnickoAdmin(String korisnickoAdmin) {
        KorisnickoAdmin = korisnickoAdmin;
    }

    public String getSifraAdmin() {
        return SifraAdmin;
    }

    public void setSifraAdmin(String sifraAdmin) {
        SifraAdmin = sifraAdmin;
    }

    public String getClassDriverIme() {
        return ClassDriverIme;
    }

    public void setClassDriverIme(String classDriverIme) {
        ClassDriverIme = classDriverIme;
    }


}
