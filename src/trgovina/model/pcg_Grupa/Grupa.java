package trgovina.model.pcg_Grupa;

public class Grupa {

    private int id;
    private String Putanja;// Koren|Racunari|Desktop|..

    public Grupa () {
        this.id = 0;
        this.Putanja = null;

    }

    
    public Grupa (int id, String putanja) {
        this.id = id;
        this.Putanja = putanja;
    }



    public int getId () {
        return id;
    }



    public void setId (int id) {
        this.id = id;
    }



    public String getPutanja () {
        return Putanja;
    }



    public void setPutanja (String putanja) {
        Putanja = putanja;
    }



}
