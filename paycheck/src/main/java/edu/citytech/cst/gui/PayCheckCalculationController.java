package edu.citytech.cst.gui;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import com.google.gson.Gson;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class PayCheckCalculationController {

    @FXML
    private TextField lblHoulyWage;

    @FXML
    private TextField lblHourlyWorked;

    @FXML
    private TextField lblSalary;

    @FXML
    private Button btnProcess;

    @FXML
    private Text lblAuthorName;
    
    @FXML
    private Text lbl_errormessage;

    @FXML
    void OnClickProcessWage(ActionEvent event) {
    	
    	
    	//http://localhost:8080/paycheck/weeklypay?hoursworked=48&hourlywage=17
    	
    	String hourWage = lblHoulyWage.getText();
    	String hourWorked = lblHourlyWorked.getText();
    	
    	if (lblHoulyWage.getText().matches("")) {
    		lbl_errormessage.setText("Please Enter A Houly Wage");
    	}
    	else if (lblHourlyWorked.getText().matches("")) {
    		lbl_errormessage.setText("Please Enter A Hourly Worked");
    	}
    	else {
    		lbl_errormessage.setText("");
    	}
    	
    	
    	try {
    		
			URL url = new URL("http://localhost:8080/paycheck/weeklypay?hoursworked="+ hourWorked +"&hourlywage=" + hourWage);
			InputStreamReader reader = new InputStreamReader(url.openStream());
			@SuppressWarnings("unchecked")
			Map<String, Object> t = (Map<String, Object>) new Gson().fromJson(reader, Object.class);
			lblSalary.setText(t.get("weeklypay") + "");
			
			
			
			
			
    	
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
//    	if (lblHoulyWage.getText().matches("")) {
//    		lbl_errormessage.setText("Please Enter A Number");
//    	}
//    	else if (lblHourlyWorked.getText().matches("")) {
//    		lbl_errormessage.setText("Please Enter A Number");
//    	}

    }

}
