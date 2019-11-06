package bsu.comp152;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXEventHandler {
    @FXML
    private TextField numbers;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    int firstNumber;
    String operation;
    @FXML
    public  void numberClicked(ActionEvent event){
        var numberPressed =((Button)event.getSource()).getText();
        var currentNum = numbers.getText();
        currentNum = currentNum+numberPressed;
        numbers.setText(currentNum);
    }

    public void operatorClicked(ActionEvent event){
        var numberAsText = numbers.getText();
        firstNumber = Integer.parseInt(numberAsText);
        numbers.clear();
        operation = ((Button)event.getSource()).getText();
    }

    public void calculate(ActionEvent event){
        var currentNumberAsText = numbers.getText();
        var currentNumber = Integer.parseInt(currentNumberAsText);
        switch(operation){
            case "+":
                var result = firstNumber + currentNumber;
                numbers.setText(""+result);
                break;
            case "-":
                result = firstNumber - currentNumber;
                numbers.setText(""+result);
                break;
        }
    }

    @FXML
    public void clear(ActionEvent event){
        firstNumber = 0;
        operation = "";
        numbers.clear();
    }

}
