/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka.interfejsi;

import trgovina.model.pcg_fakturisanje.Faktura;
import trgovina.model.pcg_fakturisanje.StavkaFakture;

/**
 *
 * @author borcha
 */
public interface IFaktura {
    
    public void SnimiStavkuFakture(StavkaFakture stavka);
    public void IspraviStavkuFakture(StavkaFakture stavka);
    public void ObrisiStavkuFakture(StavkaFakture stavka);
    public void ObrisiStavkuFakture(int id);
    
    public void SnimiFakturu(Faktura _faktura);
}
