package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private TextField expression;
    String valueOne;
    String operation = "";

    public void digitClickedHandler(ActionEvent evt){
        if (evt.getTarget() instanceof Button) {
            Button btn = (Button) evt.getTarget();
            String s = expression.getText();
            expression.setText(s + btn.getText());
        }
    }

    public void operationClickedHandler(ActionEvent evt){
        if (evt.getTarget() instanceof Button) {
            Button btn = (Button) evt.getTarget();
            operation = btn.getText();
            valueOne = expression.getText();
            expression.setText("");
        }
    }

    public void calculate(ActionEvent evt){
        String valueTwo = expression.getText();
        double v1 = 0;
        double v2 = 0;
        try {
            v1 =  Double.parseDouble(valueOne);
            v2 =  Double.parseDouble(valueTwo);
        } catch (NumberFormatException ex){
            System.out.println("error: " + ex.getMessage());
            return;
        } finally {
            System.out.println("haha");
        }
        double v = 0;
        if (operation == null || operation.isEmpty()){
            System.out.println("error: no operation");
            return;
        }
        switch (operation.charAt(0)){
            case '+':
                v = v1 + v2;
                break;
            case '-':
                v = v1 - v2;
                break;
            case '*':
                v = v1 * v2;
                break;
            case '/':
                if (v2 == 0){
                    System.out.println("error: can not divide 0");
                    return;
                }
                v = v1 / v2;
                break;
            default:
                System.out.println("error: invalid operation " + operation);
        }
        expression.setText("" + v);
    }
}
