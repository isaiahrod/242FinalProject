package view;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SainReportWindow {

	VBox pane;
	
	public SainReportWindow(Stage stage){
		
	pane = new VBox();
	HBox topBox = new HBox();
	
	HBox stuInfoBox = new HBox();
	VBox stuInfoLblBox = new VBox();
	VBox stuInfoFieldsBox = new VBox();
	
	Label programLbl = new Label("Program: ");
	Label degreeLbl = new Label("Degree: ");
	Label majorLbl = new Label("Major: ");
	Label cumGpaLbl = new Label("Cumulative GPA: ");
	Label progGpaLbl = new Label("Program GPA: ");
	Label majorGpaLbl = new Label("Major GPA: ");
	Label campusLbl = new Label("Campus: ");
	
	stuInfoLblBox.getChildren().addAll(programLbl, degreeLbl,
			majorLbl, cumGpaLbl, progGpaLbl, majorGpaLbl, campusLbl);
	
	TextField programField = new TextField();
	TextField degreeField = new TextField();
	TextField majorField = new TextField();
	TextField cumGpaField = new TextField();
	TextField progGpaField = new TextField();
	TextField majorGpaField = new TextField();
	TextField campusField = new TextField();
	
	stuInfoFieldsBox.getChildren().addAll(programField, 
			degreeField, majorField, cumGpaField, progGpaField, 
			majorGpaField, campusField);
	
	stuInfoBox.getChildren().addAll(stuInfoLblBox, stuInfoFieldsBox);
	
	HBox termStuffBox = new HBox();
	VBox termStuffLblBox = new VBox();
	VBox termStuffFieldsBox = new VBox();
	
	Label enteredLbl = new Label("Entered: ");
	Label metriculatedLbl = new Label("Matriculated: ");
	Label catalogLbl = new Label("Catalog Term: ");
	Label evalTermLbl = new Label("Evaluation Term: ");
	Label priorDegreesLbl = new Label("Prior Degrees: ");
	
	termStuffLblBox.getChildren().addAll(enteredLbl, metriculatedLbl,
			catalogLbl, evalTermLbl, priorDegreesLbl);
	
	TextField enteredField = new TextField();
	TextField metriculatedField = new TextField();
	TextField catalogField = new TextField();
	TextField evalTermField = new TextField();
	TextField priorDegreesField = new TextField();
	
	termStuffFieldsBox.getChildren().addAll(enteredField, 
			metriculatedField, catalogField, evalTermField, 
			priorDegreesField);
	
	termStuffBox.getChildren().addAll(termStuffLblBox, termStuffFieldsBox);
	topBox.getChildren().addAll(stuInfoBox, termStuffBox);
	
	HBox coursesBox = new HBox();
	VBox coursesTakenBox = new VBox();
	VBox otherCoursesTakenBox = new VBox();
	VBox coursesWithdrawnBox = new VBox();
	VBox otherCoursesBox = new VBox();
	
	coursesBox.getChildren().addAll(coursesTakenBox, otherCoursesTakenBox, coursesWithdrawnBox, otherCoursesBox);
	pane.getChildren().addAll(topBox, coursesBox);
	stage.setScene(new Scene(pane, 800, 800));
	stage.show();
	}
}
