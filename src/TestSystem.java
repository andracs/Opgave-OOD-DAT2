import java.util.ArrayList;

public class TestSystem {

    protected ArrayList<Kursus> kurserArrayList = new ArrayList<Kursus>();

    public void init() {

        // Opretter undervisere
        Underviser karsten = new Underviser("Karsten", "Vandrup", "12345", "1");

        // Opretter kurser
        Kursus parkourKursus = new Kursus("Parkour");
        Kursus selvforsvarKursus = new Kursus("Selvforsvar");
        Kursus keramikKursus = new Kursus("Keramik");
        Kursus metalKursus = new Kursus("Metalsløjd");
        Kursus franskKursus = new Kursus("Fransk");
        Kursus kinesiskKursus = new Kursus("Kinesisk");

        parkourKursus.setNavn("Parkour for begyndere");
        parkourKursus.setKursusType(EnumKursusType.FYSISK_AKTIVITET);
        parkourKursus.setUgedag(EnumUgedage.MANDAG);
        parkourKursus.setUnderviser(karsten);
        parkourKursus.setStartTime(18);
        parkourKursus.setStartMinut(0);

        // Opretter brugere
        Studerende andras = new Studerende("Andras", "Acs", "12345", "22957076");


        // Tilmelde kurser
        parkourKursus.tilmeldStuderende(andras);

    }






}
