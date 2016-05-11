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
//really shouldn't import like this
import model.BagOfBags;

public class LoginWindow {

	private Scene scene;
	private VBox pane;
	private VBox usernameBox;
	private VBox pwBox;
	private TermSelectionWindow termSelectorWindow;
	private CurriculumWindow curriculumWindow;
	private LoginListener loginListener;
	private TextField usernameField;
	private TextField pwField;
	private Stage stage;
	private ComboBox typeSelector;

	public LoginWindow(Stage stage) {

		this.stage = stage;
		usernameField = new TextField();
		Label usernameLbl = new Label("User Name");
		pwField = new TextField();
		Label pwLbl = new Label("Password");
		Button okButton = new Button("OK");

		ObservableList<String> types = FXCollections.observableArrayList("Student", "Staff");
		this.typeSelector = new ComboBox(types);
		Label typeLbl = new Label("Select User Type");

		okButton.setOnAction(action -> {
			OKButtonEventObject ev = new OKButtonEventObject(this, usernameField.getText(), pwField.getText());
			// ev will carry student info on button click
			if (loginListener != null) {
				loginListener.okButtonClick(ev);
			}
		});

		VBox usernameBox = new VBox(20);
		VBox pwBox = new VBox(20);
		VBox buttonBox = new VBox(20);

		usernameBox.getChildren().addAll(usernameLbl, usernameField);
		pwBox.getChildren().addAll(pwLbl, pwField);
		// add typeLbl/selector here if needed
		buttonBox.getChildren().addAll(okButton, typeLbl, typeSelector);
		pane = new VBox();
		pane.getChildren().addAll(usernameBox, pwBox, buttonBox);
		stage.setScene(new Scene(pane, 500, 300));
		stage.show();
	}

	public void setLoginListener(LoginListener loginListener) {
		this.loginListener = loginListener;
	}

	public String getUsername() {
		return this.usernameField.getText();
	}

	public String getPw() {
		return this.pwField.getText();
	}

	public Stage getStage() {
		return this.stage;
	}

	public void setUsernameField(String str) {
		this.usernameField.setText(str);
	}

	public void setPwField(String str) {
		this.pwField.setText(str);
	}

	public ComboBox getTypeSelector() {
		return this.typeSelector;
	}
}
