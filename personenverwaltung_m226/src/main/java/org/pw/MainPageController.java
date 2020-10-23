package org.pw;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class MainPageController {

    @FXML
    Button ButtonOneLeft;

    @FXML
    Button ButtonOneRight;

    @FXML
    Button ButtonLast;

    @FXML
    Button ButtonFirst;

    @FXML
    Button ButtonNew;

    @FXML
    Button ButtonDel;

    @FXML
    TextField TextFieldPosition;

    @FXML
    TextField TextFieldPNr;

    @FXML
    TextField TextFieldName;

    @FXML
    TextField TextFieldFirstName;

    @FXML
    Label LabelPNr;

    @FXML
    Label LabelName;

    @FXML
    Label LabelFirstName;

    private List<Person> allPersons = new ArrayList<>();

    private int position = 0;


    public void initialize() {
        for (int i = 0; i < 3; i++)
            allPersons.add(new Person(1));
        fillForm();
    }

    @FXML
    private void onButtonFirstClicked() {
        position = 0;
        fillForm();
    }

    @FXML
    private void onButtonLastClicked() {
        position = allPersons.size() - 1;
        fillForm();
    }

    @FXML
    private void onButtonOneLeftClicked() {
        position--;
        fillForm();
    }

    @FXML
    private void onButtonOneRightClicked() {
        position++;
        fillForm();
    }

    private void fillForm() {
        Person personToShow = this.allPersons.get(position);
        this.TextFieldPosition.setText(position + 1 + "/" + this.allPersons.size());
        this.TextFieldPNr.setText(String.valueOf(personToShow.getPersNr()));
        this.TextFieldName.setText(personToShow.getName());
        this.TextFieldFirstName.setText(personToShow.getVorname());
        Logger.personDisplaying(personToShow);

    }


}
