/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trgovina.bazapodataka.SQL;

import trgovina.model.pcg_fakturisanje.Faktura;
import trgovina.model.pcg_fakturisanje.StavkaFakture;

/**
 *
 * @author borcha
 */
public class sqlFaktura {
            
    private static final String TABELA_tFaktura= "tFaktura";
    private static final String tFaktura_id = "id";
    private static final String tFaktura_vrednostPdv= "vrednost_pdv";
    private static final String tFaktura_datumIzdavanja= "datum_izdavanja";
    private static final String tFaktura_datumIzvrsenja= "datum_izvrsenja";
    private static final String tFaktura_valuta= "valuta";
    private static final String tFaktura_zateznaKamata= "zatezna_kamata";
    private static final String tFaktura_idArtikla= "id_artikal";
    private static final String tFaktura_idKupac= "id_kupac";
    private static final String tFaktura_brojFakture= "broj_fakture";
    private static final String tFaktura_jelOsnovProfaktura= "jel_osnova_profaktura";
    
    private int id;
    private StavkaFakture stavka=new StavkaFakture();

   
    
    
    public sqlFaktura(int _id){
        this.id=_id;
    }
    
    public sqlFaktura(StavkaFakture _stavka) {
        this.stavka=_stavka;
        
    }
    
    public sqlFaktura(int _id,StavkaFakture _stavka) {
        this.id=_id;
        this.stavka=_stavka;
        
    }
    
    
    public String SQLInsert_faktura(){
        String sql="INSERT INTO " + TABELA_tFaktura + "(" +
        tFaktura_vrednostPdv + "," +
         tFaktura_datumIzdavanja  + "," +
         tFaktura_datumIzvrsenja  + "," +
         tFaktura_valuta  + "," +
         tFaktura_zateznaKamata  + "," +
         tFaktura_idArtikla + "," +
         tFaktura_idKupac + "," +
         tFaktura_brojFakture + "," +
         tFaktura_jelOsnovProfaktura +") VALUE (" +

             this.stavka.getPdv() + ",'" +
             this.stavka.getDatumIzdavanja().toString() + "','" +
             this.stavka.getDatumIzvrsenja().toString() + "'," +
             this.stavka.getValuta() + "," +
             this.stavka.getZateznaKamata() + "," +
             this.stavka.getIdArtikal() + "," +
             this.stavka.getIdKupac() + ",'" +
             this.stavka.getBrojFakture() + "'," +
             this.stavka.isJelNaOsnovuProfakture() +")";
                
                
        return sql;
    }
    
    
    public String SQLUpdate_faktura(){
        String sql="";
        return sql;
    }
    
    
    public String SQLDelete_faktura(){
        String sql="";
        return sql;
    }   

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StavkaFakture getStavka() {
        return stavka;
    }

    public void setStavka(StavkaFakture stavka) {
        this.stavka = stavka;
    }
    
    
    
}



