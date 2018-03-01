public class Kursus {

    private String navn;
    private EnumUgedage ugedag;
    private EnumKursusType kursusType;
    private int startTime, startMinut;
    private Studerende[] studerendeArray;
    private Underviser underviser;
    private Prøve[] prøve;
    private int maxAntalStuderende = 25;
    private int tilmeldte = 0;

    public Kursus(String navn) {

        this.navn = navn;
        this.prøve = new Prøve[3];
        studerendeArray = new Studerende[25];

    }

    public Kursus(String navn, EnumUgedage ugedag, EnumKursusType kursusType, int startTime, int startMinut, Underviser underviser, int maxAntalStuderende) {
        this.navn = navn;
        this.ugedag = ugedag;
        this.kursusType = kursusType;
        this.startTime = startTime;
        this.startMinut = startMinut;
        this.underviser = underviser;
        this.prøve = prøve;
        prøve = new Prøve[3];
        studerendeArray = new Studerende[maxAntalStuderende];
    }

    public void tilmeldStuderende(Studerende studerende) {
        // Add user to course
        studerendeArray[tilmeldte] = studerende;
        tilmeldte++;
        System.out.println(studerende.getFornavn() + " " + studerende.getEfternavn() + " er oprettet på kurset " + navn + " som deltager nr " + tilmeldte + "." );
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
