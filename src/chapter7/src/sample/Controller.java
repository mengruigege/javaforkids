package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private TextField id;
    @FXML private PasswordField pwd;
    @FXML private Label errMsg;
    SimpleStringProperty signinError = new SimpleStringProperty();

    @FXML public void initialize(){
        System.out.println("Ready");
        errMsg.textProperty().bind(signinError);
    }

    public void signInClicked(ActionEvent evt){
        String userID = id.getText();
        String password  = pwd.getText();

        Runnable loginTask = () -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException interExp) {
                interExp.printStackTrace();
            }
        };
        Thread workerThread = new Thread(loginTask);
        workerThread.start();

        if ("Rui".equals(userID)){
            id.setStyle("-fx-background-color:lightblue;");
            if ("123".equals(password)){
                signinError.set("Good");
            } else {
                signinError.set("Wrong password");
            }
        } else {
            id.setStyle("-fx-background-color:white;");
            signinError.set("Wrong user id");
        }
        System.out.println("Hello " + userID + ", your password is " + password);
    }
}
