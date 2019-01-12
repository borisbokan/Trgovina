/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka.interfejsi;

import trgovina.model.pcg_kupac.Trosak;
import trgovina.model.pcg_kupac.Uplata;

/**
 *
 * @author borcha
 */
public interface IRacunKupca {
    
    
    
    //Uplate kupca na konto
    public void SnimiUplatu(Uplata _uplata);
    public void IspraviUplatu(Uplata _uplata);
    public void IspraviUplatu(int id,Uplata _uplata);
    public void ObrisiUplatu(Uplata _uplata);
    public void ObrisiUplatu(int _idUplate);
    
    
    //Troskovi kupca
    public void SnimiTrosak(Trosak _trosak);
    public void IspraviTrosak(Trosak _trosak);
    public void IspraviTrosak(int id,Trosak _trosak);
    public void ObrisiTrosak(Trosak _trosak);
    public void ObrisiTrosak(int _idTrosak);
    
    
    
    
}
