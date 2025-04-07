import java.util.ArrayList;

public class Profesor extends Osoba{

    private String fakultet;
    private String kolegij;

    public Profesor(String OIB, String ime, String prezime, String adresa, ArrayList<Zivotinja> ljubimci, String fakultet, String kolegij) {
        super(OIB, ime, prezime, adresa, ljubimci);
        this.fakultet = fakultet;
        this.kolegij = kolegij;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public String getKolegij() {
        return kolegij;
    }

    public void setKolegij(String kolegij) {
        this.kolegij = kolegij;
    }

    private String predaje(){
        return fakultet+"_"+kolegij;
    }
}
