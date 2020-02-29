import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Igrac igrac1 = new Igrac("Ronaldo", "ACF");
        Igrac igrac2 = new Igrac("Ronaldo", "ACF");
        Igrac igrac3 = new Igrac("Ronaldo", "ACF");
        Igrac igrac4 = new Igrac("Ronaldo", "ACF");
        Igrac igrac5 = new Igrac("Ronaldo", "ACF");
        Igrac igrac6 = new Igrac("Ronaldo", "ACF");
        List<Igrac> igraciReal = new ArrayList<>();
        igraciReal.add(igrac1);
        igraciReal.add(igrac2);
        igraciReal.add(igrac3);
        Tim real = new Tim("Real", igraciReal);
        Tim barca = new Tim("Barca");
        barca.addIgrac(igrac4);
        barca.addIgrac(igrac5);
        barca.addIgrac(igrac6);
        Natprevar elClasico = new Natprevar(real, barca, 2, 3, true);
        Kolo premierLiga = new Kolo("Premier");
        premierLiga.addNatprevar(elClasico);
        premierLiga.print();

    }
}
