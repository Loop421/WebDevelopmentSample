package application;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GradeCalculatorController implements Initializable{

    @FXML
    private Label lbl_errormessage;

    @FXML
    private Label lbl_developer;

    @FXML
    private Label lbl_url;

    @FXML
    private Label lbl_score;

    @FXML
    private Button btn_01;

    @FXML
    private Button btn_02;

    @FXML
    private Button btn_03;

    @FXML
    private Button lbl_gpa;

    @FXML
    private Button btn_04;

    @FXML
    private Button btn_05;

    @FXML
    private Button btn_06;

    @FXML
    private Button lbl_af;

    @FXML
    private Button btn_07;

    @FXML
    private Button btn_08;

    @FXML
    private Button btn_09;

    @FXML
    private Button lbl_midterm;

    @FXML
    private Button btn_00;

    @FXML
    private Button btn_period;

    @FXML
    private Button btn_clear;

    @FXML
    private Button btn_calculate;

    @FXML
    private Label lbl_mode;
   
    @FXML
    void OnClickCalculate(ActionEvent event) throws IOException {
    	String score = lbl_score.getText();
    	String mode = lbl_mode.getText();
    	
    	if (mode.equals("")) {
    		lbl_errormessage.setText("Select Mode");
    	}
    	else if (score.equals("")) {
    		lbl_errormessage.setText("Please Enter A Number");
    	}
    	else {
    		lbl_errormessage.setText("");
    	}
    	
    	
    	try {
    		
			URL url = new URL("http://localhost:8080/gradesystem/"+ mode +"?grade=" + score);
			InputStreamReader reader = new InputStreamReader(url.openStream());
			String midterm = new Gson().fromJson(reader, String.class);
			lbl_mode.setText(midterm);
			lbl_url.setText("http://localhost:8080/gradesystem/"+ mode +"?grade=" + score);
			
			
    	} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    @FXML
    void OnClickClear(ActionEvent event) {
    	
    	lbl_score.setText("");
		lbl_errormessage.setText("");
		lbl_mode.setText("");
    }
      
    @FXML
    void numberPressed(ActionEvent event) {
    	
    	Button button = (Button)event.getSource();
    	
    	lbl_score.setText( lbl_score.getText() + button.getText());
    	
    }
    
    @FXML
    void OnClickMode(ActionEvent event) {
    	Button currentButton = (Button) event.getSource();
    	lbl_mode.setText(currentButton.getText());
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		lbl_score.setText("");
		lbl_errormessage.setText("");
		lbl_mode.setText("");
		
	}

}
