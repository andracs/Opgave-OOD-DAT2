package NaestvedUS;


import java.util.ArrayList;

public class KursistListe {

    protected static ArrayList<Kursist> kursisterArrayList = new ArrayList<Kursist>();

    public static void add(Kursist k) {
        kursisterArrayList.add(k);
        // System.out.println(kurserArrayList.toString());
    }

    public static ArrayList<Kursist> getKursisterArrayList() {
        return kursisterArrayList;
    }
}
