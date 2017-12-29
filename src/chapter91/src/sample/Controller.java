package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private TextField id;
    @FXML private PasswordField pwd;

    public void signin(ActionEvent event){
        System.out.println("User ID: " + id.getText() + " Password: " + pwd.getText());
    }
}
