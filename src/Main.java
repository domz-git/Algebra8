import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Zivotinja zivotinja1 = new Zivotinja("Ptica",2);
        Zivotinja zivotinja2 = new Zivotinja("Pas", 5);
        Zivotinja zivotinja3 = new Zivotinja("Riba", 1.3);

        Adresa adresa1 = new Adresa("hrvatska","osijek","31000","strossmayerova","53");
        Adresa adresa2 = new Adresa("hrvatska","daruvar","43500","nikole tesle","22");

        Profesor profesor = new Profesor("27854672865","Profo", "Profic", adresa1,new ArrayList<Zivotinja>() {{ add(zivotinja1); add(zivotinja2); add(zivotinja3); }},"FER", "IIK");
        Student student = new Student("70461745261","Studo","Studic", adresa2, new ArrayList<Zivotinja>() {{ add(zivotinja1); add(zivotinja2); add(zivotinja3); }},"78501827641","FFOS",5);


        System.out.println("Student "+ student.spava());
        System.out.println("Profesor "+profesor.jede());
    }
}
