//package demos;
//
//import javafx.application.Application;
//import javafx.stage.Stage;
////gotta fix imports with MVC
//import model.Staff;
//import model.StaffBag;
//import model.BagOfBags;
//import model.Student;
//import model.StudentBag;
//import view.LoginWindow;
//
//
//public class Demo1 extends Application{
//
//	// old demo
//	public static void main(String[] args) {
//
//		launch(args);
//	}
//
//	@Override
//	public void start(Stage stage) throws Exception {
//
//		StudentBag studentBag = new StudentBag(5);
//		StaffBag staffBag = new StaffBag(5);
//
//		BagOfBags bag = new BagOfBags(staffBag, studentBag);
//
//		bag.getStudentBag().add(new Student("John Doe", "pass", 1, "CST", 3.6));
//		bag.getStudentBag().add(new Student("Mary Jane", "password", 2, "BIS", 2.9));
//		bag.getStaffBag().add(new Staff("Teacher Teacher", "pw", 3));
//		bag.getStaffBag().add(new Staff("Teacher Professor", "pw+", 4));
//		
//		
//		//LoginWindow loginWindow = new LoginWindow(stage, bag);
//		//StudentController controller = new StudentController()
//		
//	}
//
//}
