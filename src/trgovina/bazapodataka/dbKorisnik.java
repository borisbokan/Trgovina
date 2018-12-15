package trgovina.bazapodataka;

import trgovina.bazapodataka.SQL.sqlKorisnik;
import trgovina.bazapodataka.konekcija.TrgovinaDBKonektor;
import trgovina.bazapodataka.interfejsi.IKorisnik;
import trgovina.model.pcg_logovanje.Korisnik;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class dbKorisnik implements IKorisnik {

    @Override
    public void SnimiKorisnika(Korisnik korisnik) {

        //Sql izraz
        Statement izraz = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();

            //Slanje novog korisnika ka SQL upitu
            sqlKorisnik sqlkor = new sqlKorisnik(korisnik);
            //Realizacija sql upita i vracanej bulove o uspesnosti (True ako je sve ok)
            boolean uspeh = izraz.execute(sqlkor.SQLINSERT_PodaciKorisnika());
            //Zatvaranje konekcije koja je otvorena u konstruktoru
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!uspeh) {
                System.out.println("");
                System.out.println("Uspesno snimljeno!");
            } else {
                System.out.println("");
                System.out.println("Snimanje podatka neuspesno!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void IspraviKOrisnika(Korisnik korisnik) {
        //Sql izraz
        Statement izraz = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();

            //Slanje novog korisnika ka SQL upitu
            sqlKorisnik sqlkor = new sqlKorisnik(korisnik);//Varinata sa int id -om
            //Realizacija sql upita i vracanej bulove o uspesnosti (True ako je sve ok)
            int uspeh = izraz.executeUpdate(sqlkor.SQLUPDATE_PodaciKorisnika());
            //Zatvaranje konekcije koja je otvorena u konstruktoru
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (uspeh >= 1) {
                System.out.println("----------------------------");
                System.out.println("Uspesno ispravljen korisnik!");
            } else {
                System.out.println("");
                System.out.println("Podatak nije ispravljen. Greska!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ObrisiKorisnika(Korisnik korisnik) {
        //Sql izraz
        Statement izraz = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();

            //Slanje novog korisnika ka SQL upitu
            sqlKorisnik sqlkor = new sqlKorisnik(korisnik);//Varinata sa klasom Korisnik
            //Realizacija sql upita i vracanej bulove o uspesnosti (True ako je sve ok)
            boolean uspeh = izraz.execute(sqlkor.SQLDELETE_PodaciKorisnika());
            //Zatvaranje konekcije koja je otvorena u konstruktoru
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!uspeh) {
                System.out.println("----------------------------");
                System.out.println("Uspesno obrisan korisnik!");
            } else {
                System.out.println("");
                System.out.println("Brisanje podatka neuspesno!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void ObrisiKorisnika(int id) {
        //Sql izraz
        Statement izraz = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();

            //Slanje novog korisnika ka SQL upitu
            sqlKorisnik sqlkor = new sqlKorisnik(id);//Varinata sa int id -om
            //Realizacija sql upita i vracanej bulove o uspesnosti (True ako je sve ok)
            boolean uspeh = izraz.execute(sqlkor.SQLDELETE_PodaciKorisnika());
            //Zatvaranje konekcije koja je otvorena u konstruktoru
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!uspeh) {
                System.out.println("----------------------------");
                System.out.println("Uspesno obrisan korisnik!");
            } else {
                System.out.println("");
                System.out.println("Brisanje podatka neuspesno!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public ArrayList<Korisnik> sviKorisnici() {
        return null;
    }

    @Override
    public Korisnik getKorisnik(int id) {
        return null;
    }
}
