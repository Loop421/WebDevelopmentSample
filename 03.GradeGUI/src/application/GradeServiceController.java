package application;

import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class GradeServiceController {

    @FXML
    private TextField txtEnter;

    @FXML
    private TextField txtCalculate;

    @FXML
    private Button btnCalcuate;

    @FXML
    private Text txtMessage;

    @FXML
    void calcuateGarde(ActionEvent event) {
    	
    	String x = txtEnter.getText();
    	
    	txtCalculate.setText("Passing " + new Date());
    	
    	txtMessage.setText(x.toUpperCase() + " message " + new Date());
    }

}
