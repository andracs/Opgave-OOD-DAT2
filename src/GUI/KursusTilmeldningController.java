package GUI;

import NaestvedUS.Bruger;
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
        if (telefonInput.getText().matches("22957076") && kodeordInput.getText().matches("12345")) {
            loginInfoField.appendText("Er logget ind");
        } else {
            loginInfoField.appendText("Er ikke logget ind" + telefonInput.getText() + kodeordInput.getText());

        }

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
