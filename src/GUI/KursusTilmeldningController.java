package GUI;

import NaestvedUS.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class KursusTilmeldningController implements Initializable {

    @FXML
    private TextField kodeordInput;

    @FXML
    private TextField telefonInput;

    @FXML
    private TextArea loginInfoField;

    @FXML
    private AnchorPane kurserAnchorPane;
    @FXML
    private TableView<Kursus> kursusTableView;
    @FXML
    private TableColumn<Kursus, String> kursusNavnCol;
    @FXML
    private TableColumn<Kursus, String> underviserNavnCol;
    @FXML
    private TableColumn<Kursus, String> lokaleNavnCol;
    @FXML
    private TableColumn<Kursus, String> ugedagCol;

    @FXML
    private TableView<Kursist> kursistTableView;
    @FXML
    private TableColumn<Kursist, String> kursistFornavnCol;
    @FXML
    private TableColumn<Kursist, String> kursistEfternavnCol;
    @FXML
    private TableColumn<Kursist, String> kursistTilmeldningerCol;


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
            svarTekst = "Er logget ind som " + Main.getCurrentAuthenticatedUser().getFornavn() + " " + Main.getCurrentAuthenticatedUser().getEfternavn() + " fra skole ";
            Kursist k = (Kursist) Main.getCurrentAuthenticatedUser();
            svarTekst += k.getSkole() + "\n";
            svarTekst += "Klasse:  " + k.getKlasse() + "\n";
            svarTekst += "Telefon:  " + k.getTelefon() + "\n";
            svarTekst += "Timeldt til kurser: ";
            for (Kursus kursus : k.getTilmeldtTilKurser()
                    ) {
                svarTekst += kursus.getNavn() + ", ";
            }
            svarTekst += "\n";
        }


        svarTekst += "\n**************";
        svarTekst += "\nKursister i systemet:\n";

        for (Bruger b : KursistListe.getKursisterArrayList()
                ) {

            svarTekst = svarTekst + b.getFornavn() + "\n";

        }
        svarTekst += "\n--------------";

        svarTekst += "\nKurser i systemet:\n";

        for (Kursus k : KursusListe.getKurserArrayList()
                ) {
            svarTekst += k.getNavn() + "\n";

        }
        svarTekst += "**************";
        loginInfoField.appendText(svarTekst + "\n");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        kursusNavnCol.setCellValueFactory(new PropertyValueFactory<Kursus, String>("Navn"));
        underviserNavnCol.setCellValueFactory(new PropertyValueFactory<Kursus, String>("UnderviserNavn"));
        lokaleNavnCol.setCellValueFactory(new PropertyValueFactory<Kursus, String>("LokaleNavn"));
        ugedagCol.setCellValueFactory(new PropertyValueFactory<Kursus, String>("Ugedag"));
        kursusTableView.getItems().setAll(parseKursusList());

        kursistFornavnCol.setCellValueFactory(new PropertyValueFactory<Kursist, String>("Fornavn"));
        kursistEfternavnCol.setCellValueFactory(new PropertyValueFactory<Kursist, String>("Efternavn"));
        kursistTilmeldningerCol.setCellValueFactory(new PropertyValueFactory<Kursist, String>("Tilmeldninger"));

        kursistTableView.getItems().setAll(parseKursistList());

    }

    private List<Kursus> parseKursusList() {
        List<Kursus> l = KursusListe.getKurserArrayList();
        return l;
    }

    private List<Kursist> parseKursistList() {
        List<Kursist> l = KursistListe.getKursisterArrayList();
        return l;
    }


}
