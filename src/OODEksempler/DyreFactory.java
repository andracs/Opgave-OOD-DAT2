package OODEksempler;

public class DyreFactory {

    public Dyr lavEtDyr(String type, String navn) {

        if (navn.matches("Fido") || navn.matches("Misser")) throw new IllegalArgumentException("Forkert navn.");


        if (type.matches("Kat")) {
            return new Kat(navn);
        }

        if (type.matches("Hund")) {
            return new Hund(navn);
        }

        return null;
    }
}
