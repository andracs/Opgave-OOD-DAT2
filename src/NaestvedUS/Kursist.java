package NaestvedUS;

import java.util.ArrayList;

public class Kursist extends Bruger {

    protected String skole;
    private int klasse;
    protected EnumUgedage[] ugedage = new EnumUgedage[7];
    protected ArrayList<Kursus> tilmeldtTilKurser = new ArrayList<Kursus>();

    public Kursist() {
    }

    public Kursist(String fornavn, String efternavn, String telefon, String kodeord) {
        super(fornavn, efternavn, telefon, kodeord);
        KursistListe.add(this);
    }

    public String getSkole() {
        return skole;
    }

    public void setSkole(String skole) {
        this.skole = skole;
    }

    public int getKlasse() {
        return klasse;
    }

    public void setKlasse(int klasse) {
        this.klasse = klasse;
    }

    public ArrayList<Kursus> getTilmeldtTilKurser() {
        return tilmeldtTilKurser;
    }

    public String getTilmeldninger() {
        String s = "";
        for (Kursus k : tilmeldtTilKurser
             ) {
            s += k.getNavn() + ", ";

        }
        return s;
    }
}
