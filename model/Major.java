package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Major implements Serializable {

	String title;
	String id;
	int totalCredits;
	String degreeType;
	ArrayList<Course> majorCoursesReq = new ArrayList<Course>();
	ArrayList<Course> englighCourseReq = new ArrayList<Course>();
	ArrayList<Course> ssCourseReq = new ArrayList<Course>();
	ArrayList<Course> pedCourseReq = new ArrayList<Course>();
	ArrayList<Course> humCourseReq = new ArrayList<Course>();
	ArrayList<Course> mathCourseReq = new ArrayList<Course>();

	public Major(String title, String id, int totalCredits) {
		super();
		this.title = title;
		this.id = id;
		this.totalCredits = totalCredits;
		// I did this here to keep constructor small
		if (this.id.equals("CST")) {
			this.degreeType = "Associate in Science";
			majorCoursesReq = new ArrayList<Course>();
		} else if (this.id.equals("BIS")) {
			this.degreeType = "Associate in Science";
			majorCoursesReq = new ArrayList<Course>();
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTotalCredits() {
		return totalCredits;
	}

	public void setTotalCredits(int totalCredits) {
		this.totalCredits = totalCredits;
	}

	public ArrayList<Course> getMajorCoursesReq() {
		return majorCoursesReq;
	}

	public void setMajorCoursesReq(ArrayList<Course> coursesReq) {
		this.majorCoursesReq = coursesReq;
	}

	public ArrayList<Course> getEnglighCourseReq() {
		return englighCourseReq;
	}

	public void setEnglighCourseReq(ArrayList<Course> englighCourseReq) {
		this.englighCourseReq = englighCourseReq;
	}

	public ArrayList<Course> getSsCourseReq() {
		return ssCourseReq;
	}

	public void setSsCourseReq(ArrayList<Course> ssCourseReq) {
		this.ssCourseReq = ssCourseReq;
	}

	public ArrayList<Course> getPedCourseReq() {
		return pedCourseReq;
	}

	public void setPedCourseReq(ArrayList<Course> pedCourseReq) {
		this.pedCourseReq = pedCourseReq;
	}

	public ArrayList<Course> getHumCourseReq() {
		return humCourseReq;
	}

	public void setHumCourseReq(ArrayList<Course> humCourseReq) {
		this.humCourseReq = humCourseReq;
	}

	public ArrayList<Course> getMathCourseReq() {
		return mathCourseReq;
	}

	public void setMathCourseReq(ArrayList<Course> mathCourseReq) {
		this.mathCourseReq = mathCourseReq;
	}

}
