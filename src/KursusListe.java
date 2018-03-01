
import java.util.ArrayList;

public class KursusListe {

    protected static ArrayList<Kursus> kurserArrayList = new ArrayList<Kursus>();

    public static void add(Kursus k) {
        kurserArrayList.add(k);
        // System.out.println(kurserArrayList.toString());
    }

}
