package application;

import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
public class SampleController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchToScene1(ActionEvent event) throws IOException {
		BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Scene1.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		 }
		 
		 public void switchToScene2(ActionEvent event) throws IOException {
		BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Scene2.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		 }
		 public void switchToScene3(ActionEvent event) throws IOException {
				BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Scene3.fxml"));
				  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				  scene = new Scene(root);
				  stage.setScene(scene);
				  stage.show();
				 }
		 public void switchToScene4(ActionEvent event) throws IOException {
				BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Scene4.fxml"));
				  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				  scene = new Scene(root);
				  stage.setScene(scene);
				  stage.show();
				 }
		 public void switchToScene5(ActionEvent event) throws IOException {
				BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Scene5.fxml"));
				  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				  scene = new Scene(root);
				  stage.setScene(scene);
				  stage.show();
				 }
		 public void switchToScene6(ActionEvent event) throws IOException {
				BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Scene6.fxml"));
				  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				  scene = new Scene(root);
				  stage.setScene(scene);
				  stage.show();
				 }

		}