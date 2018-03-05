package NaestvedUS;

public class Kursist extends Bruger {

    protected String skole;
    private int klasse;
    protected EnumUgedage[] ugedage = new EnumUgedage[7];

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
}
