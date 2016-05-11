package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {

	int id;
	String name;
	String username;
	private String password;
	double gpa;
	ArrayList<Course> coursesTaken;
	ArrayList<Course> coursesOther;
	ArrayList<Course> coursesFailed;
	ArrayList<Course> coursesTaking;
	ArrayList<Course> coursesNeeded;
	String majorId;

	String campus;
	String enteredTerm;
	String matriculatedTerm;
	ArrayList<String> priorDegrees;

	public Student(String name, String pass, int id, String majorID, double gpa) {
		this.name = name;
		this.id = id;
		this.password = pass;
		String[] firstLast = name.split(" ");
		this.username = firstLast[1] + Integer.toString(this.id);
		// username is automatically generated based off of name/id number
		this.majorId = majorID;
		this.gpa = gpa;
		// these are to be set later
		this.coursesTaken = new ArrayList<Course>();
		this.coursesOther = new ArrayList<Course>();
		this.coursesFailed = new ArrayList<Course>();
		this.coursesTaking = new ArrayList<Course>();
		this.coursesNeeded = new ArrayList<Course>();
		this.campus = "";
		this.enteredTerm = "";
		this.matriculatedTerm = "";
		this.priorDegrees = new ArrayList<String>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return this.password;
	}

	public String getUsername() {
		return this.username;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public ArrayList<Course> getCoursesTaken() {
		return coursesTaken;
	}

	public void setCoursesTaken(ArrayList<Course> coursesTaken) {
		this.coursesTaken = coursesTaken;
	}

	public ArrayList<Course> getCoursesOther() {
		return coursesOther;
	}

	public void setCoursesOther(ArrayList<Course> coursesOther) {
		this.coursesOther = coursesOther;
	}

	public ArrayList<Course> getCoursesFailed() {
		return coursesFailed;
	}

	public void setCoursesFailed(ArrayList<Course> coursesFailed) {
		this.coursesFailed = coursesFailed;
	}

	public ArrayList<Course> getCoursesTaking() {
		return coursesTaking;
	}

	public void setCoursesTaking(ArrayList<Course> coursesTaking) {
		this.coursesTaking = coursesTaking;
	}

	public ArrayList<Course> getCoursesNeeded() {
		return coursesNeeded;
	}

	public void setCoursesNeeded(ArrayList<Course> coursesNeeded) {
		this.coursesNeeded = coursesNeeded;
	}

	public String getMajorId() {
		return majorId;
	}

	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}

	public void setUsername(String user) {
		this.username = user;
	}

	public void setPass(String pass) {
		this.password = pass;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public String getEnteredTerm() {
		return enteredTerm;
	}

	public void setEnteredTerm(String enteredTerm) {
		this.enteredTerm = enteredTerm;
	}

	public String getMatriculatedTerm() {
		return matriculatedTerm;
	}

	public void setMatriculatedTerm(String matriculatedTerm) {
		this.matriculatedTerm = matriculatedTerm;
	}

	public ArrayList<String> getPriorDegrees() {
		return priorDegrees;
	}

	public void setTakenCourseGrade(String cTitle, String newGrade) {
		// need to be able to set the grade for courses taken
		for (int i = 0; i < this.getCoursesTaken().size(); i++) {
			if (this.getCoursesTaken().get(i).getTitle().equals(cTitle)) {
				this.getCoursesTaken().get(i).setGrade(newGrade);
			}
		}
	}

	public void setOtherCourseTakenGrade(String cTitle, String newGrade) {
		// need to be able to set the grade for courses taken
		for (int i = 0; i < this.getCoursesOther().size(); i++) {
			if (this.getCoursesOther().get(i).getTitle().equals(cTitle)) {
				this.getCoursesOther().get(i).setGrade(newGrade);
			}
		}
	}

}
