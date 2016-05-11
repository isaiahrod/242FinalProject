package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentSearchWindow {

	private Scene scene;
	private Stage stage;
	private VBox pane;
	private TextField idField;
	private TextField nameField;
	private Button searchButton;
	private Button continueButton;
	
	public StudentSearchWindow(Stage stage){
		
		this.stage = stage;
		Label idLbl = new Label("Enter ID to search for Student: ");
		idField = new TextField();
		Label nameLbl = new Label("Student found is: ");
		nameField = new TextField();
		this.searchButton = new Button("Search");
		this.continueButton = new Button("Continue");
		
		HBox idBox = new HBox();
		idBox.getChildren().addAll(idLbl, idField, searchButton);
		HBox nameBox = new HBox();
		nameBox.getChildren().addAll(nameLbl, nameField);
		pane = new VBox();
		pane.getChildren().addAll(idBox, nameBox, continueButton);
		stage.setScene(new Scene(pane, 500, 400));
		stage.show();
	}
	
	public int getID(){
		return Integer.parseInt(idField.getText());
	}
	
	public void setNameField(String s){
		this.nameField.setText(s);
	}
	
	public Stage getStage(){
		return this.stage;
	}
	
	public Button getSearchButton(){
		return this.searchButton;
	}
	
	public Button getContinueButton(){
	return this.continueButton;
	}
}
