package model;

import java.io.Serializable;
import java.util.ArrayList;

public class MajorBag implements Serializable {

	ArrayList<Major> majors;
	private int maxSize;
	private int count;

	public MajorBag(int maxSize) {
		super();
		this.maxSize = maxSize;
		majors = new ArrayList<Major>(this.maxSize);
	}

	public Major findMajorByID(String id) {
		Major temp = null;
		for (int i = 0; i < count; i++) {
			if (majors.get(i).id.equals(id)) {
				temp = majors.get(i);
			}
		}
		return temp;
	}

	public void addMajor(Major m) {
		majors.add(m);
		count++;
	}

}
