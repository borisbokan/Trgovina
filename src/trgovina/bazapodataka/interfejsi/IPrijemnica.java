package trgovina.bazapodataka.interfejsi;


import trgovina.model.pcg_prijemnice.StavkaPrijemnice;

public interface IPrijemnica {

    void SnimiPrijemnicu(StavkaPrijemnice stavkaPrijemnice);

    void IspraviPrijemnicu(StavkaPrijemnice stavkaPrijemnice);
    void IspraviPrijemnicu(int idStavkaPrijemnice);

    void ObrisiPrijemnicu(StavkaPrijemnice stavkaPrijemnice);

  

}
