import java.util.ArrayList;

public class Student extends Osoba{

    private String JMBAG;
    private String fakultet;
    private int godinaStudiranja;

    public Student(String OIB, String ime, String prezime, Adresa adresa, ArrayList<Zivotinja> ljubimci, String JMBAG, String fakultet, int godinaStudiranja) {
        super(OIB, ime, prezime, adresa, ljubimci);
        this.JMBAG = JMBAG;
        this.fakultet = fakultet;
        this.godinaStudiranja = godinaStudiranja;
    }

    public String getJMBAG() {
        return JMBAG;
    }

    public void setJMBAG(String JMBAG) {
        this.JMBAG = JMBAG;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public int getGodinaStudiranja() {
        return godinaStudiranja;
    }

    public void setGodinaStudiranja(int godinaStudiranja) {
        this.godinaStudiranja = godinaStudiranja;
    }

    @Override
    public String zivi(){
        return "zivi nekad";
    }

    @Override
    public String jede(){
        return "jede meso";
    }

    @Override
    public String spava(){
        return "spava 10 sati";
    }
}
