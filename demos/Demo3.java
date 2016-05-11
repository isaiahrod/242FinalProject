package demos;

import controller.Controller;
import javafx.application.Application;
import javafx.stage.Stage;
import model.BagOfBags;
import model.CourseBag;
import model.MajorBag;
import model.StaffBag;
import model.StudentBag;
import view.LoginWindow;

public class Demo3 extends Application {

	StudentBag studentBag = new StudentBag(5);
	StaffBag staffBag = new StaffBag(5);
	CourseBag courseBag = new CourseBag(5);
	MajorBag majorBag = new MajorBag(5);

	BagOfBags bag = new BagOfBags(staffBag, studentBag, majorBag, courseBag);

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		bag.readStaff("staff.dat");
		bag.readStudents("students.dat");
		bag.readCourses("courses.dat");
		bag.readMajors("majors.dat");

		LoginWindow window = new LoginWindow(stage);
		Controller controller = new Controller(window, bag);
	}

}
