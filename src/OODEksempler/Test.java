package OODEksempler;

public class Test {

    public void test() {

        Kat k = new Kat("Fido");
        Hund h = new Hund("Misser");

        Dyr kat = new DyreFactory().lavEtDyr("Kat", "Misser");


    }
}
