package demos;

import controller.Controller;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Admin;
import model.BagOfBags;
import model.Course;
import model.CourseBag;
import model.Major;
import model.MajorBag;
import model.Staff;
import model.StaffBag;
import model.Student;
import model.StudentBag;
import view.LoginWindow;

public class Demo2 extends Application {

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

		// kept all this here to remember passwords for login

		bag.getStudentBag().add(new Student("John Doe", "pass", 1, "CST", 3.4));
		bag.getStudentBag().add(new Student("Mary Jane", "password", 2, "BIS", 3.5));
		bag.getStaffBag().add(new Staff("Teacher Teacher", "pw", 3));
		bag.getStaffBag().add(new Staff("Teacher Professor", "pw+", 4));
		bag.getStaffBag().add(new Admin("Johnny Admin", "adminpass", 5));

		Course bis1 = new Course("Business 1", 4, "101", "NoGradeYet");
		Course bis2 = new Course("Business 2", 4, "102", "NoGradeYet");
		Course java1 = new Course("Java 1", 4, "141", "NoGradeYet");
		Course java2 = new Course("Java 2", 4, "142", "NoGradeYet");
		Course psych = new Course("Psychology", 3, "101", "NoGradeYet");

		bag.getCourseBag().addCourse(psych);
		bag.getCourseBag().addCourse(bis1);
		bag.getCourseBag().addCourse(bis2);
		bag.getCourseBag().addCourse(java1);
		bag.getCourseBag().addCourse(java2);

		Course eng = new Course("English", 3, "121", "NoGradeYet");
		Course hist = new Course("US History", 3, "114", "NoGradeYet");
		Course gym = new Course("Physical Education", 2, "102", "NoGradeYet");
		Course span = new Course("Spanish 1", 3, "131", "NoGradeYet");
		Course calc1 = new Course("Calculus 1", 4, "141", "NoGradeYet");

		bag.getCourseBag().addCourse(eng);
		bag.getCourseBag().addCourse(hist);
		bag.getCourseBag().addCourse(gym);
		bag.getCourseBag().addCourse(span);
		bag.getCourseBag().addCourse(calc1);

		bag.getMajorBag().addMajor(new Major("Computer Science", "CST", 120));
		bag.getMajorBag().addMajor(new Major("Business", "BIS", 120));

		Major cstMajor = bag.getMajorBag().findMajorByID("CST");
		Major bisMajor = bag.getMajorBag().findMajorByID("BIS");

		cstMajor.getMajorCoursesReq().add(java1);
		cstMajor.getMajorCoursesReq().add(java2);

		bisMajor.getMajorCoursesReq().add(bis1);
		bisMajor.getMajorCoursesReq().add(bis2);

		cstMajor.getEnglighCourseReq().add(eng);
		cstMajor.getSsCourseReq().add(hist);
		cstMajor.getPedCourseReq().add(gym);
		cstMajor.getHumCourseReq().add(span);
		cstMajor.getMathCourseReq().add(calc1);

		bisMajor.getEnglighCourseReq().add(eng);
		bisMajor.getSsCourseReq().add(hist);
		bisMajor.getPedCourseReq().add(gym);
		bisMajor.getHumCourseReq().add(span);
		bisMajor.getMathCourseReq().add(calc1);

		Student jd = bag.getStudentBag().findByID(1);
		Student mj = bag.getStudentBag().findByID(2);

		// I use copy constructor here to ensure Students don't share course object
		jd.getCoursesTaken().add(new Course(java1));
		jd.getCoursesTaken().add(new Course(eng));
		jd.getCoursesTaken().add(new Course(gym));
		jd.getCoursesFailed().add(new Course(calc1));
		jd.getCoursesNeeded().add(new Course(calc1));
		jd.getCoursesNeeded().add(new Course(span));
		jd.getCoursesNeeded().add(new Course(hist));
		jd.getCoursesNeeded().add(new Course(java2));
		jd.getCoursesTaking().add(new Course(calc1));
		jd.getCoursesTaking().add(new Course(java2));
		jd.getCoursesOther().add(new Course(psych));
		// add grades for taken courses
		jd.setTakenCourseGrade("Java 1", "B");
		jd.setTakenCourseGrade("English", "A");
		jd.setTakenCourseGrade("Physical Education", "B+");
		jd.setOtherCourseTakenGrade("Psychology", "B-");
		
		
		mj.getCoursesTaken().add(new Course(bis1));
		mj.getCoursesTaken().add(new Course(hist));
		mj.getCoursesTaken().add(new Course(gym));
		mj.getCoursesFailed().add(new Course(eng));
		mj.getCoursesNeeded().add(new Course(eng));
		mj.getCoursesNeeded().add(new Course(bis2));
		mj.getCoursesNeeded().add(new Course(calc1));
		mj.getCoursesNeeded().add(new Course(span));
		mj.getCoursesTaking().add(new Course(eng));
		mj.getCoursesTaking().add(new Course(bis2));
		// add grades for taken courses
		mj.setTakenCourseGrade("Business", "A");
		mj.setTakenCourseGrade("US History", "A-");
		mj.setTakenCourseGrade("Physical Education", "B+");
		
		jd.setCampus("Ammerman");
		jd.setEnteredTerm("Fall 2014");
		jd.setMatriculatedTerm("Spring 2015");
		mj.setCampus("Brentwood");
		mj.setEnteredTerm("Spring 2015");
		mj.setMatriculatedTerm("Fall 2015");
		
		bag.saveCourses("courses.dat");
		bag.saveMajors("majors.dat");
		bag.saveStaff("staff.dat");
		bag.saveStudents("students.dat");
		
		// bag.readStaff("staff.dat");
		// bag.readStudents("students.dat");
		// bag.readCourses("courses.dat");
		// bag.readMajors("majors.dat");

		
		
		LoginWindow window = new LoginWindow(stage);
		Controller controller = new Controller(window, bag);

	}

}
