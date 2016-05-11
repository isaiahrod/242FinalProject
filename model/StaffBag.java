package model;

import java.io.Serializable;
import java.util.ArrayList;

public class StaffBag implements Serializable {

	ArrayList<Staff> theBag;
	private int maxSize;
	private int count;

	public StaffBag(int maxSize) {
		this.maxSize = maxSize;
		theBag = new ArrayList<Staff>(this.maxSize);
		count = 0;
	}

	public void add(Staff a) {
		theBag.add(a);
		count++;
	}

	public Staff findByID(int i) {
		Staff findee = null;
		for (int j = 0; j < count; j++) {
			if (theBag.get(j).getId() == i) {
				findee = theBag.get(j);
			}
		}
		return findee;
	}

	public Staff findByUser(String user) {
		Staff findee = null;
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
