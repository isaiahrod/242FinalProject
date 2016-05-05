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

	VBox pane;
	
	public SainShortWindow(Stage stage){
		
		
		pane = new VBox();
		HBox programBox = new HBox();
		HBox degreeBox = new HBox();
		HBox majorBox = new HBox();
		
		Label programLbl = new Label("Program: ");
		Label degreeLbl = new Label("Degree: ");
		Label majorLbl = new Label("Major: ");
		
		TextField programField = new TextField();
		TextField degreeField = new TextField();
		TextField majorField = new TextField();
		
		programBox.getChildren().addAll(programLbl, programField);
		degreeBox.getChildren().addAll(degreeLbl, degreeField);
		majorBox.getChildren().addAll(majorLbl, majorField);
		
		ObservableList<String> years = 
				FXCollections.observableArrayList(
				        "Fall 2015",
				        "Spring 2016",
				        "Summer 2016",
				        "Fall 2016"
				    );
		ComboBox termSelector = new ComboBox(years);
		
		HBox termSelectorBox = new HBox();
		Label selectorLbl = new Label("Select Current Term: ");
		termSelectorBox.getChildren().addAll(selectorLbl, termSelector);
		
		Button generatorButton = new Button("Generate Request");
		
		generatorButton.setOnAction( action -> {
			if (termSelector.getValue().toString().equals("Fall 2015")){
				SainReportWindow srWindow = new SainReportWindow(stage);
			} else if (termSelector.getValue().toString().equals("Spring 2016")){
				SainReportWindow srWindow = new SainReportWindow(stage);
			}else if (termSelector.getValue().toString().equals("Summer 2016")){
				SainReportWindow srWindow = new SainReportWindow(stage);
			} else if (termSelector.getValue().toString().equals("Fall 2016")){
				SainReportWindow srWindow = new SainReportWindow(stage);
			}
			
			//need to change what happens based off term selection
		});
		
		pane.getChildren().addAll(programBox, degreeBox, majorBox, 
				termSelectorBox, generatorButton);
		stage.setScene(new Scene(pane, 500, 500));
		stage.show();
	}
}
