package model;

import java.io.Serializable;
import java.util.ArrayList;

public class CourseBag implements Serializable {

	ArrayList<Course> courses;
	private int maxSize;
	private int count = 0;

	public CourseBag(int maxSize) {
		this.maxSize = maxSize;
		courses = new ArrayList<Course>(this.maxSize);
	}

	public Course findByTitle(String title) {
		Course temp = null;
		for (int i = 0; i < count; i++) {
			if (courses.get(i).getTitle().equals(title)) {
				temp = courses.get(i);
			}
		}
		return temp;
	}

	public void addCourse(Course c) {
		courses.add(c);
		count++;
	}
}
