import ENUM.EnumKursusType;
import ENUM.EnumUgedage;

import java.util.ArrayList;

public class TestSystem {


    public void init() {

        // Opretter undervisere
        Underviser karsten = new Underviser("Karsten", "Vandrup", "12345", "1");

        // Opretter kurser
        Kursus parkourKursus = new Kursus("Parkour");
        Kursus keramikKursus = new Kursus("Keramik");
        Kursus selvforsvarKursus = new Kursus("Selvforsvar");
        Kursus metalKursus = new Kursus("Metalsløjd");
        Kursus franskKursus = new Kursus("Fransk");
        Kursus kinesiskKursus = new Kursus("Kinesisk");

        parkourKursus.setNavn("Parkour for begyndere");
        parkourKursus.setKursusType(EnumKursusType.FYSISK_AKTIVITET);
        parkourKursus.setUgedag(EnumUgedage.MANDAG);
        parkourKursus.setUnderviser(karsten);
        parkourKursus.setStartTime(18);
        parkourKursus.setStartMinut(0);

        keramikKursus.setUgedag(EnumUgedage.TIRSDAG);
        keramikKursus.setKursusType(EnumKursusType.VÆRKSTEDSFAG);

        selvforsvarKursus.setUgedag(EnumUgedage.MANDAG);
        selvforsvarKursus.setKursusType(EnumKursusType.FYSISK_AKTIVITET);

        metalKursus.setUgedag(EnumUgedage.FREDAG);
        metalKursus.setKursusType(EnumKursusType.VÆRKSTEDSFAG);

        // Statusbesked
        System.out.println("Der er " + KursusListe.kurserArrayList.size() + " kurser i systemet. ");

        // Opretter brugere
        Unge mikkel = new Unge("Mikkel", "Sørensen", "1", "1");
        Unge mads = new Unge("Mads", "Nielsen", "2", "2");
        Unge thomas = new Unge("Thomas", "Christensen", "3", "3");
        Unge mathias = new Unge("Mathias", "H", "4", "4");
        Unge sebastian = new Unge("Sebastian", "N", "5", "5");


        try {
            // Tilmelder kurser
            parkourKursus.tilmeldStuderende(mikkel);
            parkourKursus.tilmeldStuderende(mads);
            parkourKursus.tilmeldStuderende(thomas);
            keramikKursus.tilmeldStuderende(mikkel);
            keramikKursus.tilmeldStuderende(mads);
            metalKursus.tilmeldStuderende(mikkel);
            selvforsvarKursus.tilmeldStuderende(mikkel);
        } catch (IllegalArgumentException e) {
            //
            System.out.println("Hov der var en fejl, ikke alle stud blev oprettet: " + e.getLocalizedMessage());
        }

        // Yderligere tests
        System.out.println("Færdig. ");

    }






}
