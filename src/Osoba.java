import java.util.ArrayList;

public abstract class Osoba implements Zivi, Jede, Spava{

    private String OIB;
    private String ime;
    private String prezime;
    private Adresa adresa;
    private ArrayList<Zivotinja> ljubimci = new ArrayList<Zivotinja>();

    public Osoba(String OIB, String ime, String prezime, Adresa adresa, ArrayList<Zivotinja> ljubimci) {
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

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public ArrayList<Zivotinja> getLjubimci() {
        return ljubimci;
    }

    public void setLjubimci(ArrayList<Zivotinja> ljubimci) {
        this.ljubimci = ljubimci;
    }


    @Override
    public String jede() {
        return "";
    }

    @Override
    public String Spava() {
        return "";
    }

    @Override
    public String zivi() {
        return "";
    }

    public abstract String spava();
}
