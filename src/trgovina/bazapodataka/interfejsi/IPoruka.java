/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka.interfejsi;

import trgovina.model.pcg_poruke.Poruka;

/**
 *
 * @author borcha
 */
public interface IPoruka {
    
        
        public void SnimiPoruku(Poruka _poruka);
        public void IspraviPoruku(Poruka _poruka);
        public void IspraviPoruku(int _id,Poruka _poruka);
        public void ObrisiPoruku(int _id);
    
    
}
