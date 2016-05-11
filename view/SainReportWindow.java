package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SainReportWindow {

	Stage stage;
	// create attribute for stage so it can be easily passed on in controller
	VBox pane;
	TextField programField;
	TextField degreeField;
	TextField majorField;
	TextField cumGpaField;
	TextField progGpaField;
	TextField majorGpaField;
	TextField campusField;

	TextField enteredField;
	TextField metriculatedField;
	TextField catalogField;
	TextField evalTermField;
	TextField priorDegreesField;

	TextArea coursesTakenArea;
	TextArea otherCoursesTakenArea;
	TextArea coursesWithdrawnArea;
	TextArea currentCoursesArea;
	TextArea coursesNeededArea;

	Button closeButton;

	public SainReportWindow(Stage stage) {

		this.stage = stage;
		pane = new VBox();
		HBox topBox = new HBox();

		VBox stuInfoBox = new VBox();

		Label programLbl = new Label("Program: ");
		Label degreeLbl = new Label("Degree: ");
		Label majorLbl = new Label("Major: ");
		Label cumGpaLbl = new Label("Cumulative GPA: ");
		Label progGpaLbl = new Label("Program GPA: ");
		Label majorGpaLbl = new Label("Major GPA: ");
		Label campusLbl = new Label("Campus: ");

		this.programField = new TextField();
		this.degreeField = new TextField();
		this.majorField = new TextField();
		this.cumGpaField = new TextField();
		this.progGpaField = new TextField();
		this.majorGpaField = new TextField();
		this.campusField = new TextField();

		HBox programBox = new HBox();
		programBox.getChildren().addAll(programLbl, programField);
		HBox degreeBox = new HBox();
		degreeBox.getChildren().addAll(degreeLbl, degreeField);
		HBox majorBox = new HBox();
		majorBox.getChildren().addAll(majorLbl, majorField);
		HBox cumGpaBox = new HBox();
		cumGpaBox.getChildren().addAll(cumGpaLbl, cumGpaField);
		HBox progGpaBox = new HBox();
		progGpaBox.getChildren().addAll(progGpaLbl, progGpaField);
		HBox majorGpaBox = new HBox();
		majorGpaBox.getChildren().addAll(majorGpaLbl, majorGpaField);
		HBox campusBox = new HBox();
		campusBox.getChildren().addAll(campusLbl, campusField);

		stuInfoBox.getChildren().addAll(programBox, degreeBox, majorBox, cumGpaBox, progGpaBox, majorGpaBox, campusBox);

		VBox termStuffBox = new VBox();

		Label enteredLbl = new Label("Entered: ");
		Label metriculatedLbl = new Label("Matriculated: ");
		Label catalogLbl = new Label("Catalog Term: ");
		Label evalTermLbl = new Label("Evaluation Term: ");
		Label priorDegreesLbl = new Label("Prior Degrees: ");

		this.enteredField = new TextField();
		this.metriculatedField = new TextField();
		this.catalogField = new TextField();
		this.evalTermField = new TextField();
		this.priorDegreesField = new TextField();

		HBox enteredBox = new HBox();
		enteredBox.getChildren().addAll(enteredLbl, enteredField);
		HBox metriculatedBox = new HBox();
		metriculatedBox.getChildren().addAll(metriculatedLbl, metriculatedField);
		HBox catalogBox = new HBox();
		catalogBox.getChildren().addAll(catalogLbl, catalogField);
		HBox evalTermBox = new HBox();
		evalTermBox.getChildren().addAll(evalTermLbl, evalTermField);
		HBox priorDegreesBox = new HBox();
		priorDegreesBox.getChildren().addAll(priorDegreesLbl, priorDegreesField);

		termStuffBox.getChildren().addAll(enteredBox, metriculatedBox, catalogBox, evalTermBox, priorDegreesBox);

		topBox.getChildren().addAll(stuInfoBox, termStuffBox);

		VBox coursesBox = new VBox();

		VBox coursesTakenBox = new VBox();
		Label coursesTakenLbl = new Label("Courses Taken: ");
		this.coursesTakenArea = new TextArea();
		coursesTakenBox.getChildren().addAll(coursesTakenLbl, coursesTakenArea);

		VBox otherCoursesTakenBox = new VBox();
		Label otherCoursesTakenLbl = new Label("Other Courses Taken: ");
		this.otherCoursesTakenArea = new TextArea();
		otherCoursesTakenBox.getChildren().addAll(otherCoursesTakenLbl, otherCoursesTakenArea);

		VBox coursesWithdrawnBox = new VBox();
		Label coursesWithdrawnLbl = new Label("Courses Withdrawn From");
		this.coursesWithdrawnArea = new TextArea();
		coursesWithdrawnBox.getChildren().addAll(coursesWithdrawnLbl, coursesWithdrawnArea);

		VBox currentCoursesBox = new VBox();
		Label currentCoursesLbl = new Label("Other Courses Taken: ");
		this.currentCoursesArea = new TextArea();
		currentCoursesBox.getChildren().addAll(currentCoursesLbl, currentCoursesArea);

		VBox coursesNeededBox = new VBox();
		Label coursesNeededLbl = new Label("Courses Needed: ");
		this.coursesNeededArea = new TextArea();
		coursesNeededBox.getChildren().addAll(coursesNeededLbl, coursesNeededArea);

		coursesBox.getChildren().addAll(coursesTakenBox, otherCoursesTakenBox, coursesWithdrawnBox, currentCoursesBox,
				coursesNeededBox);

		this.closeButton = new Button("Close and save");

		pane.getChildren().addAll(topBox, coursesBox, closeButton);
		stage.setScene(new Scene(pane, 800, 800));
		stage.show();
	}

	public Stage getStage() {
		return stage;
	}

	public VBox getPane() {
		return pane;
	}

	public TextField getProgramField() {
		return programField;
	}

	public TextField getDegreeField() {
		return degreeField;
	}

	public TextField getMajorField() {
		return majorField;
	}

	public TextField getCumGpaField() {
		return cumGpaField;
	}

	public TextField getProgGpaField() {
		return progGpaField;
	}

	public TextField getMajorGpaField() {
		return majorGpaField;
	}

	public TextField getCampusField() {
		return campusField;
	}

	public TextField getEnteredField() {
		return enteredField;
	}

	public TextField getMetriculatedField() {
		return metriculatedField;
	}

	public TextField getCatalogField() {
		return catalogField;
	}

	public TextField getEvalTermField() {
		return evalTermField;
	}

	public TextField getPriorDegreesField() {
		return priorDegreesField;
	}

	public TextArea getCoursesTakenArea() {
		return coursesTakenArea;
	}

	public TextArea getOtherCoursesTakenArea() {
		return otherCoursesTakenArea;
	}

	public TextArea getCoursesWithdrawnArea() {
		return coursesWithdrawnArea;
	}

	public TextArea getCurrentCoursesArea() {
		return currentCoursesArea;
	}

	public TextArea getCoursesNeededArea() {
		return coursesNeededArea;
	}

	public Button getCloseButton() {
		return this.closeButton;
	}
}
