package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BagOfBags implements Serializable {

	// I like to have two bags inside for less clutter
	// read/save methods in here to keep bags smaller
	StaffBag staffBag;
	StudentBag studentBag;
	MajorBag majorBag;
	CourseBag courseBag;

	public BagOfBags(StaffBag staffBag, StudentBag studentBag, MajorBag majorBag, CourseBag courseBag) {
		super();
		this.staffBag = staffBag;
		this.studentBag = studentBag;
		this.majorBag = majorBag;
		this.courseBag = courseBag;
	}

	public StaffBag getStaffBag() {
		return staffBag;
	}

	public void setStaffBag(StaffBag staffBag) {
		this.staffBag = staffBag;
	}

	public StudentBag getStudentBag() {
		return studentBag;
	}

	public void setStudentBag(StudentBag studentBag) {
		this.studentBag = studentBag;
	}

	public MajorBag getMajorBag() {
		return majorBag;
	}

	public void setMajorBag(MajorBag majorBag) {
		this.majorBag = majorBag;
	}

	public CourseBag getCourseBag() {
		return courseBag;
	}

	public void setCourseBag(CourseBag courseBag) {
		this.courseBag = courseBag;
	}

	public void saveStudents(String fileName) {
		FileOutputStream pfos = null;
		try {
			pfos = new FileOutputStream(fileName);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			ObjectOutputStream poos = new ObjectOutputStream(pfos);
			poos.writeObject(studentBag);
			poos.close();
			System.out.println("Sucessfully saved students to binary file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void saveStaff(String fileName) {
		FileOutputStream pfos = null;
		try {
			pfos = new FileOutputStream(fileName);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			ObjectOutputStream poos = new ObjectOutputStream(pfos);
			poos.writeObject(staffBag);
			poos.close();
			System.out.println("Sucessfully saved staff to binary file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void saveMajors(String fileName) {
		FileOutputStream pfos = null;
		try {
			pfos = new FileOutputStream(fileName);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			ObjectOutputStream poos = new ObjectOutputStream(pfos);
			poos.writeObject(majorBag);
			poos.close();
			System.out.println("Sucessfully saved majors to binary file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void saveCourses(String fileName) {
		FileOutputStream pfos = null;
		try {
			pfos = new FileOutputStream(fileName);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			ObjectOutputStream poos = new ObjectOutputStream(pfos);
			poos.writeObject(courseBag);
			poos.close();
			System.out.println("Sucessfully saved courses to binary file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readStudents(String fileName) throws ClassNotFoundException, IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileName);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		studentBag = (StudentBag) ois.readObject();

		System.out.println("Sucessful student load");
	}

	public void readStaff(String fileName) throws ClassNotFoundException, IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileName);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		staffBag = (StaffBag) ois.readObject();

		System.out.println("Sucessful student load");
	}

	public void readMajors(String fileName) throws ClassNotFoundException, IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileName);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		majorBag = (MajorBag) ois.readObject();

		System.out.println("Sucessful majors load");
	}

	public void readCourses(String fileName) throws ClassNotFoundException, IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileName);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		courseBag = (CourseBag) ois.readObject();

		System.out.println("Sucessful courses load");
	}
}
