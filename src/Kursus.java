import ENUM.EnumKursusType;
import ENUM.EnumUgedage;
import com.sun.javaws.exceptions.InvalidArgumentException;

public class Kursus {

    private String navn;
    private EnumUgedage ugedag;
    private EnumKursusType kursusType;
    private int startTime, startMinut;
    private Unge[] ungeArray;
    private Underviser underviser;
    private Prøve[] prøve;
    private int maxAntalStuderende = 25;
    private int tilmeldte = 0;

    public Kursus(String navn) {

        this.navn = navn;
        this.prøve = new Prøve[3];
        ungeArray = new Unge[25];
        KursusListe.add(this);

    }

    /* Returnerer TRUE, hvis brugeren er oprettet */
    public String tilmeldStuderende(Unge unge) {
        // Sikre, at der ikke kan tilmeldes til flere aktiviteter på samme ugedag
        // --> Tjek, hvilke kurser (ugedage), den studerende har
        // --> Hvis der

        if (unge.getFornavn().matches("Andras")) {
            throw new IllegalArgumentException("Mads må ikke oprettes af en eller anden grund!");
        }

        // Add user to course
        ungeArray[tilmeldte] = unge;
        tilmeldte++;
        System.out.println(unge.getFornavn() + " " + unge.getEfternavn() + " er oprettet på kurset '" + navn + "' som deltager nr " + tilmeldte + "." );
        return "";
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public EnumUgedage getUgedag() {
        return ugedag;
    }

    public void setUgedag(EnumUgedage ugedag) {
        this.ugedag = ugedag;
    }

    public EnumKursusType getKursusType() {
        return kursusType;
    }

    public void setKursusType(EnumKursusType kursusType) {
        this.kursusType = kursusType;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getStartMinut() {
        return startMinut;
    }

    public void setStartMinut(int startMinut) {
        this.startMinut = startMinut;
    }

    public Underviser getUnderviser() {
        return underviser;
    }

    public void setUnderviser(Underviser underviser) {
        this.underviser = underviser;
    }

    public int getMaxAntalStuderende() {
        return maxAntalStuderende;
    }

    public void setMaxAntalStuderende(int maxAntalStuderende) {
        this.maxAntalStuderende = maxAntalStuderende;
    }
}
