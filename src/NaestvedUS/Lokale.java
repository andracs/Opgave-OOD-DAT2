package NaestvedUS;

public class Lokale {
    private static Lokale standard;
    private String navn;
    private int nummer;

    public Lokale(String navn, int nummer) {
        this.navn = navn;
        this.nummer = nummer;
    }

    public static Lokale standard() {
        if (standard == null) {
            standard = new Lokale("EASJ", 108);
        }
        return standard;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }
}
