package NaestvedUS;

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
        Kursist mikkel = new Kursist("Mikkel", "Sørensen", "1", "1");
        Kursist mads = new Kursist("Mads", "Nielsen", "2", "2");
        Kursist thomas = new Kursist("Thomas", "Christensen", "3", "3");
        Kursist mathias = new Kursist("Mathias", "H", "4", "4");
        Kursist sebastian = new Kursist("Sebastian", "N", "5", "5");
        Kursist andras = new Kursist("András", "Ács", "22957076", "12345");
        mikkel.setSkole("EASJ");
        mikkel.setKlasse(1);
        andras.setSkole("EASJ");
        andras.setKlasse(20);

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
