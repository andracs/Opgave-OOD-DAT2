package GUI;

import NaestvedUS.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class KursusTilmeldningController {

    @FXML
    private TextField kodeordInput;

    @FXML
    private TextField telefonInput;

    @FXML
    private TextArea loginInfoField;

    @FXML
    private void loginButtonAction() {
        String svarTekst = "";

        for (Bruger b : KursistListe.getKursisterArrayList()
                ) {
            if (telefonInput.getText().matches(b.getTelefon()) && kodeordInput.getText().matches(b.getKodeord())) {
                Main.setCurrentAuthenticatedUser(b);
                break;
            }

        }

        if (Main.getCurrentAuthenticatedUser() != null) {
            svarTekst = "Er logget ind som " + Main.getCurrentAuthenticatedUser().getFornavn().toString() + " ";
        } 


        svarTekst += "\n**************";
        svarTekst += "\nKursister i systemet:\n";

        for (Bruger b : KursistListe.getKursisterArrayList()
                ) {

            svarTekst = svarTekst + b.getFornavn() + "\n";

        }

        svarTekst += "\nKurser i systemet:\n";

        for (Kursus k : KursusListe.getKurserArrayList()
                ) {
            svarTekst += k.getNavn() + "\n";

        }
        svarTekst += "**************";
        loginInfoField.appendText(svarTekst + "\n");
    }

    @FXML
    private void udfyldTabelKursister() {

        ObservableList<Bruger> data =
                FXCollections.observableArrayList(
                        new Kursist("Mikkel", "Sørensen", "1", "1"),
                        new Kursist("Mads", "Nielsen", "2", "2"),
                        new Kursist("Thomas", "Christensen", "3", "3"),
                        new Kursist("Mathias", "H", "4", "4"),
                        new Kursist("Sebastian", "N", "5", "5")
                );
    }


}
