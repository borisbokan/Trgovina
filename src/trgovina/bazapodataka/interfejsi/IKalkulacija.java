package trgovina.bazapodataka.interfejsi;

import trgovina.model.pcg_kalkulacije.KalkulacijaNabavneCene;

import java.util.ArrayList;

public interface IKalkulacija {


    void SnimiKalkulaciju(KalkulacijaNabavneCene kalkulacijaNabavneCene);
    void IspraviKalkulaciju(KalkulacijaNabavneCene kalkulacijaNabavneCene);
    void IspraviKalkulaciju(int id,KalkulacijaNabavneCene kalkulacijaNabavneCene);
    void ObrisKalkulaciju(KalkulacijaNabavneCene kalkulacijaNabavneCene);
    void ObrisKalkulaciju(int id);

    ArrayList<KalkulacijaNabavneCene> getListaKalkulacije(int brojKalkulacije);

    ArrayList<KalkulacijaNabavneCene> getListaKalkulacije(KalkulacijaNabavneCene kalkulacijaNabavneCene);


}
