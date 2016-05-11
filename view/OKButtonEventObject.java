package view;

import java.util.ArrayList;
import java.util.EventObject;

import model.Course;
import model.Staff;
import model.Student;

public class OKButtonEventObject extends EventObject {

	Student currentStudent;
	Staff currentStaff;
	String username;
	String password;

	public OKButtonEventObject(Object source, Student s) {
		super(source);
		this.currentStudent = s;
	}

	public OKButtonEventObject(Object source, Student stu, Staff staff) {
		super(source);
		this.currentStudent = stu;
		this.currentStaff = staff;
	}

	public OKButtonEventObject(Object source, String user, String pass) {
		super(source);
		this.username = user;
		this.password = pass;
	}

	public int getStudentId() {
		return currentStudent.getId();
	}

	public String getStudentName() {
		return currentStudent.getName();
	}

	public String getStudentPass() {
		return currentStudent.getPass();
	}

	public String getStudentUsername() {
		return currentStudent.getUsername();
	}

	public double getStudentGpa() {
		return currentStudent.getGpa();
	}

	public ArrayList<Course> getCoursesTaken() {
		return currentStudent.getCoursesTaken();
	}

	public ArrayList<Course> getCoursesOther() {
		return currentStudent.getCoursesOther();
	}

	public ArrayList<Course> getCoursesFailed() {
		return currentStudent.getCoursesFailed();
	}

	public ArrayList<Course> getCoursesTaking() {
		return currentStudent.getCoursesTaking();
	}

	public String getMajorId() {
		return currentStudent.getMajorId();
	}

	public int getStaffId() {
		return currentStaff.getId();
	}

	public String getStaffName() {
		return currentStaff.getName();
	}

	public String getStaffPass() {
		return currentStaff.getPass();
	}

	public String getStaffUser() {
		return currentStaff.getUsername();
	}

	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}
}
