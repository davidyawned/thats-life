package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

/* CSE 360(phase 4)
 * Name: Junehyuk Ye(1219339069) 
 *Prototype: User Interface
 *Description of upside risk: By disposing function intuitively, User of the New Effort Logger can 
 *							  maximize their work efficiency.
 * */



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Scene1.fxml"));
			Scene scene = new Scene(root,1000,800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
