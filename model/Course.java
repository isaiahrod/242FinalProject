package model;

import java.io.Serializable;

public class Course implements Serializable {

	String title;
	int creditsWorth;
	String courseNum;
	String grade;

	public Course(String title, int creditsWorth, String courseNum, String grade) {
		super();
		this.title = title;
		this.creditsWorth = creditsWorth;
		this.courseNum = courseNum;
		this.grade = grade;
	}

	public Course(Course aCourse) {
		// copy constructor so Student objects don't share the same course
		this.title = aCourse.getTitle();
		this.creditsWorth = aCourse.getCreditsWorth();
		this.courseNum = aCourse.courseNum;
		this.grade = aCourse.getGrade();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCreditsWorth() {
		return creditsWorth;
	}

	public void setCreditsWorth(int creditsWorth) {
		this.creditsWorth = creditsWorth;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Course [title=" + title + ", creditsWorth=" + creditsWorth + ", courseNum=" + courseNum + ", grade="
				+ grade + "]";
	}

}
