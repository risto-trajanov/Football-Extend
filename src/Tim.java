import java.util.ArrayList;
import java.util.List;

public class Tim {
    String ime;
    List<Igrac> igraci;

    public Tim(String ime, List<Igrac> igraci) {
        this.ime = ime;
        this.igraci = igraci;
    }

    public Tim(String ime) {
        this.ime = ime;
        this.igraci = new ArrayList<>();
    }
    public void addIgrac(Igrac igrac){
        igraci.add(igrac);
    }
    public String getIme() {
        return ime;
    }

    public List<Igrac> getIgraci() {
        return igraci;
    }
}
