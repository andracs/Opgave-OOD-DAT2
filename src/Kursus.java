public class Kursus {

    private String navn;
    private Ugedage ugedag;
    private KursusType kursusType;
    private int startTime, startMinut;
    private Studerende[] brugereArray;
    private Underviser underviser;

    public Kursus(String navn) {
        this.navn = navn;
    }

    public Kursus(String navn, Ugedage ugedag, KursusType kursusType, int startTime, int startMinut, Studerende[] brugereArray, Underviser underviser) {
        this.navn = navn;
        this.ugedag = ugedag;
        this.kursusType = kursusType;
        this.startTime = startTime;
        this.startMinut = startMinut;
        this.brugereArray = brugereArray;
        this.underviser = underviser;
    }

    public void opretStuderende(Studerende studerende) {
        // Add user to course
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public KursusType getKursusType() {
        return kursusType;
    }

    public void setKursusType(KursusType kursusType) {
        this.kursusType = kursusType;
    }

    public Ugedage getUgedag() {
        return ugedag;
    }

    public void setUgedag(Ugedage ugedag) {
        this.ugedag = ugedag;
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


}
