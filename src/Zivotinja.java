public class Zivotinja {

    private String ime;
    private double tezina;

    public Zivotinja(String ime, double tezina) {
        this.ime = ime;
        this.tezina = tezina;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    private String zivi(){
        return "Zivi";
    }

    private String spava(){
        return "spava";
    }

    private String jede(){
        return "jede";
    }

    private String kreceSe(){
        return "kreceSe";
    }

}
