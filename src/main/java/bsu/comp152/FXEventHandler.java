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
    String instanceVar;
    @FXML
    public  void numberClicked(ActionEvent event){
        var numberPressed =((Button)event.getSource()).getText();
        var currentNum = numbers.getText();
        currentNum = currentNum+numberPressed;
        numbers.setText(currentNum);
    }
}
