import java.util.ArrayList;

public class Mitglied {
    // Eigenschaften
    public int mitgliednummer;
    public String name;

    public String geburtsdatum; // String oder int??

    public String geschlecht;

    private ArrayList<Kurs> kurse;

    //Konstruktor
    public Mitglied(int mitgliednummer, String name, String geburtsdatum, String geschlecht) {
        this.mitgliednummer = mitgliednummer;
        this.name = name;
        this.geburtsdatum = geburtsdatum;
        this.geschlecht = geschlecht;
        kurse = new ArrayList<Kurs>();

    }

    public void anmeldenfuerKurs(Kurs kurs) {
        kurse.add(kurs);
    }

    public void abmeldenfuerKurs(Kurs kurs) {
        kurse.remove(kurs);
    }

    public ArrayList<Kurs> getKurs() {
        return kurse;
    }

    // Methoden
    public void mitgliedAendern() {
    }// Was kommt in die Klammer ?

}