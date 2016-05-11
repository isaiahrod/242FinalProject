package model;

import java.io.Serializable;
import java.util.ArrayList;

public class StudentBag implements Serializable {

	ArrayList<Student> theBag;
	private int maxSize;
	private int count;

	public StudentBag(int maxSize) {
		this.maxSize = maxSize;
		theBag = new ArrayList<Student>(this.maxSize);
		count = 0;
	}

	public void add(Student s) {
		theBag.add(s);
		count++;
	}

	public Student findByID(int i) {
		Student findee = null;
		for (int j = 0; j < count; j++) {
			if (theBag.get(j).getId() == i) {
				findee = theBag.get(j);
			}
		}
		return findee;
	}

	public Student findByUser(String user) {
		Student findee = null;
		for (int j = 0; j < count; j++) {
			if (theBag.get(j).getUsername().equals(user)) {
				findee = theBag.get(j);
			}
		}
		return findee;
	}

	public int getCount() {
		return count;
	}

	public boolean contains(int i) {
		if (findByID(i) == null) {
			return false;
		} else {
			return true;
		}
	}
}
