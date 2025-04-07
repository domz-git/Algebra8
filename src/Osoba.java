import java.util.ArrayList;

public class Osoba {

    private String OIB;
    private String ime;
    private String prezime;
    private String adresa;
    private ArrayList<Zivotinja> ljubimci = new ArrayList<Zivotinja>();

    public Osoba(String OIB, String ime, String prezime, String adresa, ArrayList<Zivotinja> ljubimci) {
        this.OIB = OIB;
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
        this.ljubimci = ljubimci;
    }

    public String getOIB() {
        return OIB;
    }

    public void setOIB(String OIB) {
        this.OIB = OIB;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public ArrayList<Zivotinja> getLjubimci() {
        return ljubimci;
    }

    public void setLjubimci(ArrayList<Zivotinja> ljubimci) {
        this.ljubimci = ljubimci;
    }

    private String zivi(){
        return "zivi";
    }

    private String jede(){
        return "jede";
    }

    private String spava(){
        return "spava";
    }

}
