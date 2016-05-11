package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CurriculumWindow {

	VBox pane;
	TextField programField;
	TextField termField;
	TextField levelField;
	TextField campusField;
	TextField collegeField;
	TextField degreeField;
	TextField firstMajorField;
	Button reportButton;
	Stage stage;
	// used all of these as fields for easy acess from controller

	public CurriculumWindow(Stage stage) {

		this.stage = stage;
		pane = new VBox();
		HBox programBox = new HBox(10);
		HBox termBox = new HBox(10);
		HBox levelBox = new HBox(10);
		HBox campusBox = new HBox(10);
		HBox collegeBox = new HBox(10);
		HBox degreeBox = new HBox(10);
		HBox firstMajorBox = new HBox(10);
		VBox reportBox = new VBox(30);

		Label programLabel = new Label("Program: ");
		Label termLabel = new Label("Catalog Term: ");
		Label levelLabel = new Label("Level: ");
		Label campusLabel = new Label("Campus: ");
		Label collegeLabel = new Label("College: ");
		Label degreeLabel = new Label("Degree: ");
		Label firstMajorLabel = new Label("First Major: ");

		this.programField = new TextField();
		this.termField = new TextField();
		this.levelField = new TextField();
		this.campusField = new TextField();
		this.collegeField = new TextField();
		this.degreeField = new TextField();
		this.firstMajorField = new TextField();

		this.reportButton = new Button("Generate SAIN Report");

		programBox.getChildren().addAll(programLabel, programField);
		termBox.getChildren().addAll(termLabel, termField);
		levelBox.getChildren().addAll(levelLabel, levelField);
		campusBox.getChildren().addAll(campusLabel, campusField);
		collegeBox.getChildren().addAll(collegeLabel, collegeField);
		degreeBox.getChildren().addAll(degreeLabel, degreeField);
		firstMajorBox.getChildren().addAll(firstMajorLabel, firstMajorField);

		pane.getChildren().addAll(programBox, termBox, levelBox, campusBox, collegeBox, degreeBox, firstMajorBox,
				reportButton);

		this.stage.setScene(new Scene(pane, 500, 500));
		this.stage.show();
	}

	public void setProgramTerm(String term) {
		programField.setText(term);
	}

	public void setCatalogTerm(String term) {
		termField.setText(term);
	}

	public void setLevel(String term) {
		levelField.setText(term);
	}

	public void setCampus(String term) {
		campusField.setText(term);
	}

	public void setCollege(String term) {
		collegeField.setText(term);
	}

	public void setDegree(String term) {
		degreeField.setText(term);
	}

	public void setFirstMajor(String term) {
		firstMajorField.setText(term);
	}

	public Button getReportButton() {
		return this.reportButton;
	}

	public Stage getStage() {
		return this.stage;
	}
}
