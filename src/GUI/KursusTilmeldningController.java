package GUI;

import NaestvedUS.Bruger;
import NaestvedUS.Main;
import NaestvedUS.Unge;
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
        if (telefonInput.getText().matches("22957076") && kodeordInput.getText().matches("12345")) {
            Main.setCurrentAuthenticatedUser(new Unge("András", "Ács", "22957076", "12345"));
            Bruger b = Main.getCurrentAuthenticatedUser();
            svarTekst = "Er logget ind som "+ b.getFornavn().toString()  +  " " ;
        } else {
            svarTekst = "Er ikke logget ind med " + telefonInput.getText() + " kode " +  kodeordInput.getText();
        }
        loginInfoField.appendText(svarTekst + "\n");
    }

    @FXML
    private void udfyldTabelStuderende() {

        ObservableList<Bruger> data =
                FXCollections.observableArrayList(
                        new Unge("Mikkel", "Sørensen", "1", "1"),
                        new Unge("Mads", "Nielsen", "2", "2"),
                        new Unge("Thomas", "Christensen", "3", "3"),
                        new Unge("Mathias", "H", "4", "4"),
                        new Unge("Sebastian", "N", "5", "5")
                        );
    }


}
