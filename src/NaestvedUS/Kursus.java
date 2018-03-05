package NaestvedUS;

public class Kursus {

    private String navn;
    private EnumUgedage ugedag;
    private EnumKursusType kursusType;
    private int startTime, startMinut;
    private Kursist[] kursistArray;
    private Underviser underviser;
    private Prøve[] prøve;
    private int maxAntalStuderende = 25;
    private int tilmeldte = 0;

    public Kursus(String navn) {

        this.navn = navn;
        this.prøve = new Prøve[3];
        kursistArray = new Kursist[25];
        KursusListe.add(this);

    }

    /* Returnerer TRUE, hvis brugeren er oprettet */
    public String tilmeldStuderende(Kursist kursist) {

        String returBesked = "";

        if ((maxAntalStuderende > tilmeldte)) {
            // Sikre, at der ikke kan tilmeldes til flere aktiviteter på samme ugedag
            // --> Tjek, hvilke kurser (ugedage), den studerende har
            // --> Hvis der er...

            for (Kursus k : KursusListe.kurserArrayList) {
                // System.out.println("DEBUG Kursusnavn: " + k.navn);
                for (int i = 0; i < k.kursistArray.length; i++) {
                    if (k.kursistArray[i] != null) {
                        //    System.out.println("DEBUG Deltagere: " + k.kursistArray[i].getFornavn());
                    }
                }
            }

            if (kursist.getFornavn().matches("Andras")) {
                throw new IllegalArgumentException("Mads må ikke oprettes af en eller anden grund!");
            }

            // Add user to course
            // System.out.println(("#" + ugedag.ordinal()) + kursist.ugedage[ugedag.ordinal()] +"  vs "+ ugedag);
            if (kursist.ugedage[ugedag.ordinal()] == null) {
                kursist.ugedage[ugedag.ordinal()] = ugedag;
                kursistArray[tilmeldte] = kursist;
                tilmeldte++;
                System.out.println(kursist.getFornavn() + " " + kursist.getEfternavn() + " er oprettet på kurset '" + navn + "' som deltager nr " + tilmeldte + ".");
                // returBesked = kursist.getFornavn() + " er nu tilmeldt " + navn;
            } else {
                returBesked = kursist.fornavn + " kunne ikke tilmeldes til " + navn + " kursus om" + ugedag + "en, fordi han/hun allerede har en anden tilmeldning for samme ugedag.";
            }
        } else {
            returBesked = kursist.fornavn + " kunne ikke tilmeldes til " + navn + " kursus om" + ugedag + "en, fordi der er ikke flere pladser på denne kursus.";
        }
        System.out.println(returBesked);
        return returBesked;
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
