package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SainShortWindow {

	Stage stage;
	// attribute for stage so it can be easily passed on by controller
	VBox pane;
	TextField programField;
	TextField degreeField;
	TextField majorField;
	Button generatorButton;
	ComboBox termSelector;

	public SainShortWindow(Stage stage) {

		this.stage = stage;
		pane = new VBox();
		HBox programBox = new HBox();
		HBox degreeBox = new HBox();
		HBox majorBox = new HBox();

		Label programLbl = new Label("Program: ");
		Label degreeLbl = new Label("Degree: ");
		Label majorLbl = new Label("Major: ");

		this.programField = new TextField();
		this.degreeField = new TextField();
		this.majorField = new TextField();

		programBox.getChildren().addAll(programLbl, programField);
		degreeBox.getChildren().addAll(degreeLbl, degreeField);
		majorBox.getChildren().addAll(majorLbl, majorField);

		ObservableList<String> years = FXCollections.observableArrayList("Fall 2015", "Spring 2016", "Summer 2016",
				"Fall 2016");
		this.termSelector = new ComboBox<String>(years);

		HBox termSelectorBox = new HBox();
		Label selectorLbl = new Label("Select Current Term: ");
		termSelectorBox.getChildren().addAll(selectorLbl, termSelector);

		this.generatorButton = new Button("Generate Request");

		pane.getChildren().addAll(programBox, degreeBox, majorBox, termSelectorBox, generatorButton);
		stage.setScene(new Scene(pane, 500, 500));

	}

	public void setProgramField(String str) {
		this.programField.setText(str);
	}

	public void setMajorField(String str) {
		this.majorField.setText(str);
	}

	public void setDegreeField(String str) {
		this.degreeField.setText(str);
	}

	public Stage getStage() {
		return this.stage;
	}

	public Button getGeneratorButton() {
		return this.generatorButton;
	}

	public ComboBox<String> getSelector() {
		return this.termSelector;
	}
}
