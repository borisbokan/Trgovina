/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka.interfejsi;

import java.util.ArrayList;
import trgovina.model.pcg_otpis.StavkaOtpisa;

/**
 *
 * @author borcha
 */
public interface IOtpis {
    
    public void SnimiStavkuOtpisa(StavkaOtpisa _stavka);
    public void SnimiStavkeOtpisa(ArrayList<StavkaOtpisa> _stavke);
    public void IspravkiStavkuOtpisa(int _id,StavkaOtpisa _stavka);
    public void IspraviSTavkuOtpisa(StavkaOtpisa _stavka);
    public void ObrisiStavkuOtpisa(int id);
    public void ObrisiStavkuOtpisa(StavkaOtpisa _stavka);
}
