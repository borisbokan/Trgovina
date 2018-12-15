package trgovina.bazapodataka;

import trgovina.bazapodataka.SQL.sqlArtikal;
import trgovina.bazapodataka.konekcija.TrgovinaDBKonektor;
import trgovina.bazapodataka.interfejsi.IArtikal;
import trgovina.model.pcg_artikal.Artikal;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class dbArtikal implements IArtikal {


    @Override
    public void UnosArtikla(Artikal artikal) {


        Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlArtikal sqlartikal = new sqlArtikal(artikal);
            boolean uspeh = izraz.execute(sqlartikal.SQLInsert_UnosArtikla());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno snimljen artikal.");
            } else {
                System.out.println("Neuspesno snimljen artikal.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }


    }

    @Override
    public void IspraviPodatkeArtikla(Artikal artikal) {
        Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlArtikal sqlartikal = new sqlArtikal(artikal.getId());
            boolean uspeh = izraz.execute(sqlartikal.SQLUpdate_IspraviArtikal());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno ispravljen artikal.");
            } else {
                System.out.println("Neuspesno ispravljen artikal.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void ObrisiArtikal(Artikal artikal) {
        Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlArtikal sqlartikal = new sqlArtikal(artikal.getId());
            boolean uspeh = izraz.execute(sqlartikal.SQLDelete_ObrisiArtikal());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno obrisan artikal.");
            } else {
                System.out.println("Neuspesno obrisan artikal.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

    @Override
    public void ObrisiArtikal(int idArtikal) {
        Statement izraz = null;

        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlArtikal sqlartikal = new sqlArtikal(idArtikal);
            boolean uspeh = izraz.execute(sqlartikal.SQLDelete_ObrisiArtikal());
            TrgovinaDBKonektor.PrekiniKonekciju();

            if (!uspeh) {
                System.out.println("Uspesno obrisan artikal.");
            } else {
                System.out.println("Neuspesno obrisan artikal.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Artikal> getArtikli() {
        //TODO kod za upit getArtikli
        return null;
    }

    @Override
    public Artikal getArtikal(int id) {
        //TODO kod za getARtikal po int id
        return null;
    }

    @Override
    public Artikal getArtikal(Artikal artikal) {
        //TODO kod za getARtikal po objektu Artikal
        return null;
    }
}
