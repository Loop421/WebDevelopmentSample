package application;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GradeCalculator extends Application {
	
	public static String Number;
	public static String Mode;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		URL url = getClass().getResource("GradeCalculatorService.fxml");
		Parent root = FXMLLoader.load(url);
		
		Scene scene = new Scene(root, 300, 275);
		
		primaryStage.setTitle("GradeCalculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}