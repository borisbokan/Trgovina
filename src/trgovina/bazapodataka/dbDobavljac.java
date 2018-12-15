package trgovina.bazapodataka;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import trgovina.bazapodataka.SQL.sqlDobavljac;
import trgovina.bazapodataka.interfejsi.IDobavljac;
import trgovina.bazapodataka.konekcija.TrgovinaDBKonektor;
import trgovina.model.pcg_dobavljac.Dobavljac;
import trgovina.model.pcg_dobavljac.DobavljacFizickoLice;
import trgovina.model.pcg_dobavljac.DobavljacPravnoLice;

public class dbDobavljac implements IDobavljac {


    //Pravno lice
    @Override
    public void SnimiDobavljacPL(DobavljacPravnoLice _dobavljacPL) {
        Statement izraz = null;
        sqlDobavljac sqlDobavljac = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlDobavljac = new sqlDobavljac(_dobavljacPL);
            boolean rez = izraz.execute(sqlDobavljac.SQLInsert_SnimiDobavljaca());
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!rez) {
                System.out.println("Uspesno snimljen dobavljac!");
            } else {
                System.out.println("Neuspesno snimljen dobavljac!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void IspraviDobavljacPL(DobavljacPravnoLice _dobavljacPL) {
        Statement izraz = null;
        sqlDobavljac sqlDobavljac = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlDobavljac = new sqlDobavljac(_dobavljacPL);
            boolean rez = izraz.execute(sqlDobavljac.SQLUpdate_IspraviDobavljaca());
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!rez) {
                System.out.println("Uspesno ispravljen dobavljac!");
            } else {
                System.out.println("Neuspesno ispravljen dobavljac!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ObrisiDobavljacPL(DobavljacPravnoLice _dobavljacPL) {
        Statement izraz = null;
        sqlDobavljac sqlDobavljac = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlDobavljac = new sqlDobavljac(_dobavljacPL);
            boolean rez = izraz.execute(sqlDobavljac.SQLDelete_ObrisiDobavljaca());
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!rez) {
                System.out.println("Uspesno obrisan dobavljac!");
            } else {
                System.out.println("Neuspesno obrisan dobavljac!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ObrisiDobavljacPL(int _idDobavljac) {
        Statement izraz = null;
        sqlDobavljac sqlDobavljac = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlDobavljac = new sqlDobavljac(_idDobavljac);
            boolean rez = izraz.execute(sqlDobavljac.SQLDelete_ObrisiDobavljaca());
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!rez) {
                System.out.println("Uspesno obrisan dobavljac!");
            } else {
                System.out.println("Neuspesno obrisan dobavljac!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public DobavljacPravnoLice getDobavljacPL(int idDobavljacPL) {
        return null;
    }

    @Override
    public DobavljacPravnoLice getDobavljacPL_PoPrijemnici(int idPrijemnicaPL) {
        return null;
    }

    @Override
    public ArrayList<Dobavljac> getSviDobavljaciPL() {
        return null;
    }

    //FIZICKO LICE
    @Override
    public void SnimiDobavljacFL(DobavljacFizickoLice _dobavljacFL) {
        Statement izraz = null;
        sqlDobavljac sqlDobavljac = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlDobavljac = new sqlDobavljac(_dobavljacFL);
            boolean rez = izraz.execute(sqlDobavljac.SQLInsert_SnimiDobavljaca());
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!rez) {
                System.out.println("Uspesno snimljen dobavljac!");
            } else {
                System.out.println("Neuspesno snimljen dobavljac!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void IspraviDobavljacFL(DobavljacFizickoLice _dobavljacFL) {
        Statement izraz = null;
        sqlDobavljac sqlDobavljac = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlDobavljac = new sqlDobavljac(_dobavljacFL);
            boolean rez = izraz.execute(sqlDobavljac.SQLUpdate_IspraviDobavljaca());
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!rez) {
                System.out.println("Uspesno ispravljen dobavljac!");
            } else {
                System.out.println("Neuspesno ispravljen dobavljac!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ObrisiDobavljacFL(DobavljacFizickoLice _dobavljacFL) {
        Statement izraz = null;
        sqlDobavljac sqlDobavljac = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlDobavljac = new sqlDobavljac(_dobavljacFL);
            boolean rez = izraz.execute(sqlDobavljac.SQLDelete_ObrisiDobavljaca());
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!rez) {
                System.out.println("Uspesno obrisan dobavljac!");
            } else {
                System.out.println("Neuspesno obrisan dobavljac!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ObrisiDobavljacFL(int _idDobavljac) {
        Statement izraz = null;
        sqlDobavljac sqlDobavljac = null;
        try {
            izraz = TrgovinaDBKonektor.Konekcija().createStatement();
            sqlDobavljac = new sqlDobavljac(_idDobavljac);
            boolean rez = izraz.execute(sqlDobavljac.SQLDelete_ObrisiDobavljaca());
            TrgovinaDBKonektor.PrekiniKonekciju();
            if (!rez) {
                System.out.println("Uspesno obrisan dobavljac!");
            } else {
                System.out.println("Neuspesno obrisan dobavljac!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public DobavljacPravnoLice getDobavljacFL(int idDobavljacFL) {
        return null;
    }

    @Override
    public DobavljacPravnoLice getDobavljacFL_PoPrijemnici(int idPrijemnicaFL) {
        return null;
    }

    @Override
    public ArrayList<Dobavljac> getSviDobavljaciFL() {
        return null;
    }
}
