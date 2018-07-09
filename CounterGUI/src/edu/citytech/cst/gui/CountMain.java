package edu.citytech.cst.gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CountMain extends Application {

	
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		
		
		Parent root = FXMLLoader.load(getClass().getResource("Count.fxml"));
		try {
			Scene scene = new Scene(root,700,540);
			primaryStage.setTitle("Marginal Tax Rate Calculator");
			primaryStage.setScene(scene);
			primaryStage.setResizable(true);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

