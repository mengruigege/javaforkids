package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class Controller {
    @FXML private TextField userID;
    @FXML private PasswordField password;

    public void chuang(ActionEvent event){
        System.out.println("User ID: " + userID.getText() + " Password: " + password.getText());
    }
}
