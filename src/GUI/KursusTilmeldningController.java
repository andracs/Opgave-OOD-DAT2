package GUI;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
        }
        else {
            loginInfoField.appendText("Er ikke logget ind" + telefonInput.getText() + kodeordInput.getText());

        }

    }

}
