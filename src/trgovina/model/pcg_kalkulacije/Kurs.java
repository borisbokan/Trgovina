package trgovina.model.pcg_kalkulacije;

import java.util.ArrayList;

public class Kurs {

    private int id;
    private Valuta valutaOsnovna;//Sa kojom se porede dole , niz valuta. npr dinar
    private ArrayList<Valuta> valute;//Niz valuta (Euro, Dolar, Jen ... )

    /**
     * @param id
     * @param valutaOsnovna
     * @param valute
     */
    public Kurs(int id, Valuta valutaOsnovna, ArrayList<Valuta> valute) {
        this.id = id;
        this.valutaOsnovna = valutaOsnovna;
        this.valute = valute;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Valuta getValutaOsnovna() {
        return valutaOsnovna;
    }

    public void setValutaOsnovna(Valuta valutaOsnovna) {
        this.valutaOsnovna = valutaOsnovna;
    }

    public ArrayList<Valuta> getValute() {
        return valute;
    }

    public void setValute(ArrayList<Valuta> valute) {
        this.valute = valute;
    }
}
