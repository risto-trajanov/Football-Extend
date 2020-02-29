public class Natprevar {
    private Tim doma;
    private Tim gosti;
    private int domaGolovi;
    private int gostiGolovi;
    private boolean isZavrshen;

    public Natprevar(Tim doma, Tim gosti, int domaGolovi, int gostiGolovi, boolean isZavrshen) {
        this.doma = doma;
        this.gosti = gosti;
        this.domaGolovi = domaGolovi;
        this.gostiGolovi = gostiGolovi;
        this.isZavrshen = isZavrshen;
    }

    public Natprevar(Tim doma, Tim gosti) {
        this.doma = doma;
        this.gosti = gosti;
    }

    public void print() {
        if(isZavrshen){
            if(domaGolovi > gostiGolovi){
                System.out.println(doma.getIme().toUpperCase() + " " + domaGolovi + ":" + gostiGolovi + " " + gosti.getIme().toLowerCase() + " - finished");
            } else if (gostiGolovi > domaGolovi){
                System.out.println(doma.getIme().toLowerCase() + " " + domaGolovi + ":" + gostiGolovi + " " + gosti.getIme().toUpperCase() + " - finished");
            } else {
                System.out.println(doma.getIme().toLowerCase() + " " + domaGolovi + ":" + gostiGolovi + " " + gosti.getIme().toLowerCase() + " - finished");
            }
        } else {
                System.out.println(doma.getIme().toLowerCase() + " " + domaGolovi + ":" + gostiGolovi + " " + gosti.getIme().toLowerCase() + " - ongoing");
        }
    }
}
