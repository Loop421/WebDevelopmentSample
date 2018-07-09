package application;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GradeServiceMain extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		
		URL url = getClass().getResource("GradeService.fxml");
		Parent root = FXMLLoader.load(url);
		
		Scene scene = new Scene(root, 400, 275);
		
		primaryStage.setTitle("Grade Service");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
