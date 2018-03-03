public class Unge extends Bruger {

    protected String skole;
    private int klasse;
    protected ENUM.EnumUgedage[] ugedage = new ENUM.EnumUgedage[7];

    public Unge() {
    }

    public Unge(String fornavn, String efternavn, String telefon, String kodeord) {
        super(fornavn, efternavn, telefon, kodeord);
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
