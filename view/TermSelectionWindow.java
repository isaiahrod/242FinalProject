package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// I ditched this class because term selection doesn't matter
// completely unused 

public class TermSelectionWindow {

	VBox pane;

	public TermSelectionWindow(Stage stage) {

		pane = new VBox();
		HBox labelBox = new HBox();
		HBox selectionBox = new HBox();

		Label selectionLabel = new Label("Select Current Term");
		labelBox.getChildren().addAll(selectionLabel);

		ObservableList<String> years = FXCollections.observableArrayList("Fall 2015", "Spring 2016", "Summer 2016",
				"Fall 2016");
		ComboBox yearSelector = new ComboBox(years);
		Button okButton = new Button("OK");
		selectionBox.getChildren().addAll(yearSelector, okButton);

		okButton.setOnAction(action -> {
			if (yearSelector.getValue().toString().equals("Fall 2015")) {
				CurriculumWindow cWindow = new CurriculumWindow(stage);
			} else if (yearSelector.getValue().toString().equals("Spring 2016")) {
				CurriculumWindow cWindow = new CurriculumWindow(stage);
			} else if (yearSelector.getValue().toString().equals("Summer 2016")) {
				CurriculumWindow cWindow = new CurriculumWindow(stage);
			} else if (yearSelector.getValue().toString().equals("Fall 2016")) {
				CurriculumWindow cWindow = new CurriculumWindow(stage);
			}

			// need to change what happens based off term selection
		});

		pane.getChildren().addAll(labelBox, selectionBox);
		stage.setScene(new Scene(pane, 250, 250));
		stage.show();
	}

}
