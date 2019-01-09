/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka.interfejsi;

import trgovina.model.pcg_logovanje.Logovanje;

/**
 *
 * @author borcha
 */
public interface ILogovanje {
                
        public void SnimiLogovanje(Logovanje _logovanje);
        public void IspraviLOgovanje(Logovanje _logovanje);
        public void IspraviLOgovanje(int id,Logovanje _logovanje);
        public void ObrisiLogovanje(Logovanje _logovanje);
        public void ObrisLogovanje(int id);
        public void ObrisLogovanje(String sessionId);
    
    
    
}
