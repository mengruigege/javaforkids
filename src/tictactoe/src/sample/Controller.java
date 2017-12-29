package sample;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

public class Controller {

    @FXML Button b1;
    @FXML Button b2;
    @FXML Button b3;
    @FXML Button b4;
    @FXML Button b5;
    @FXML Button b6;
    @FXML Button b7;
    @FXML Button b8;
    @FXML Button b9;

    @FXML GridPane gameBoard;

    private boolean isFirstPlayer = true;
    private boolean isGameOver = false;

    private void a(){
        System.out.println("abc");
    }
    
    public void buttonClickHandler(ActionEvent event){
        if (isGameOver){
            return;
        }
        
        Button btn = (Button) event.getTarget();
        String btnText = btn.getText();

        if ("".equals(btnText) && isFirstPlayer){
            btn.setText("X");
            isFirstPlayer = false;
        } else if ("".equals(btnText) && !isFirstPlayer){
            btn.setText("O");
            isFirstPlayer = true;
        }
        
        if (find3InARow()){
            isGameOver = true;
        }
    }

    private boolean find3InARow(){
        // Row 1
        if ("" != b1.getText() && b1.getText() == b2.getText() && b2.getText() == b3.getText()){
            highlightWinner(b1, b2, b3);
            return true;
        }

        // Row 2
        if ("" != b4.getText() && b4.getText() == b5.getText() && b5.getText() == b6.getText()){
            highlightWinner(b4, b5, b6);
            return true;
        }

        // Row 3
        if ("" != b7.getText() && b7.getText() == b8.getText() && b8.getText() == b9.getText()){
            highlightWinner(b7, b8, b9);
            return true;
        }

        // Column 1
        if ("" != b1.getText() && b1.getText() == b4.getText() && b4.getText() == b7.getText()){
            highlightWinner(b1, b4, b7);
            return true;
        }

        // Column 2
        if ("" != b2.getText() && b2.getText() == b5.getText() && b5.getText() == b8.getText()){
            highlightWinner(b2, b5, b8);
            return true;
        }

        // Column 3
        if ("" != b3.getText() && b3.getText() == b6.getText() && b6.getText() == b9.getText()){
            highlightWinner(b3, b6, b9);
            return true;
        }

        // Diagonal 1
        if ("" != b1.getText() && b1.getText() == b5.getText() && b5.getText() == b9.getText()){
            highlightWinner(b1, b5, b9);
            return true;
        }

        // Diagonal 2
        if ("" != b3.getText() && b3.getText() == b5.getText() && b5.getText() == b7.getText()){
            highlightWinner(b3, b5, b7);
            return true;
        }

        return false;
    }

    private void highlightWinner(Button a, Button b, Button c){
        a.getStyleClass().add("winning-square");
        b.getStyleClass().add("winning-square");
        c.getStyleClass().add("winning-square");

        applyFadeTransition(a);
        applyFadeTransition(b);
        applyFadeTransition(c);
    }

    private void applyFadeTransition(Button btn){
        FadeTransition ft = new FadeTransition(Duration.millis(1000), btn);

        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(10);
        ft.setAutoReverse(true);
        ft.play();
    }
}
