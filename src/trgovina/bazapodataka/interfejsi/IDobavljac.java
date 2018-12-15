package trgovina.bazapodataka.interfejsi;


import trgovina.model.pcg_dobavljac.Dobavljac;
import trgovina.model.pcg_dobavljac.DobavljacFizickoLice;
import trgovina.model.pcg_dobavljac.DobavljacPravnoLice;

import java.util.ArrayList;


public interface IDobavljac {

    //Pravno lice
    void SnimiDobavljacPL(DobavljacPravnoLice _dobavljacPL);

    void IspraviDobavljacPL(DobavljacPravnoLice _dobavljacPL);

    void ObrisiDobavljacPL(DobavljacPravnoLice _dobavljacPL);

    void ObrisiDobavljacPL(int _idDobavljac);

    DobavljacPravnoLice getDobavljacPL(int idDobavljacPL);

    DobavljacPravnoLice getDobavljacPL_PoPrijemnici(int idPrijemnicaPL);

    public ArrayList<Dobavljac> getSviDobavljaciPL();

    //Pravno lice
    void SnimiDobavljacFL(DobavljacFizickoLice _dobavljacFL);

    void IspraviDobavljacFL(DobavljacFizickoLice _dobavljacFL);

    void ObrisiDobavljacFL(DobavljacFizickoLice _dobavljacFL);

    void ObrisiDobavljacFL(int _idDobavljac);

    DobavljacPravnoLice getDobavljacFL(int idDobavljacFL);

    DobavljacPravnoLice getDobavljacFL_PoPrijemnici(int idPrijemnicaFL);

    public ArrayList<Dobavljac> getSviDobavljaciFL();



}
