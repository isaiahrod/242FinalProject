package controller;

import javafx.stage.Stage;
import model.Admin;
import model.BagOfBags;
import model.Staff;
import model.Student;
import view.CurriculumWindow;
import view.LoginListener;
import view.LoginWindow;
import view.OKButtonEventObject;
import view.SainReportWindow;
import view.SainShortWindow;
import view.StudentSearchWindow;

public class Controller {

	Student stu;
	Staff sta;
	CurriculumWindow curriculumWindow;

	public Controller(LoginWindow window, BagOfBags bag) {
		window.setLoginListener(new LoginListener() {

			@Override
			public void okButtonClick(OKButtonEventObject ev) {

				if (window.getTypeSelector().getValue().toString().equals("Student")) {
					if ((ev.getPassword()).equals(bag.getStudentBag().findByUser((ev.getUsername())).getPass())) {
						// if password matches the password of the username
						// entered
						stu = bag.getStudentBag().findByUser(ev.getUsername());
						//same student will get passed on through all windows
						curriculumWindow = new CurriculumWindow(window.getStage());

						curriculumWindow.setProgramTerm("Associate in Science");
						curriculumWindow.setCatalogTerm("Spring 2016");
						curriculumWindow.setLevel("Undergraduate");
						curriculumWindow.setCampus(stu.getCampus());
						if (stu.getMajorId().equals("CST")) {
							curriculumWindow.setCollege("Computer Science");
						} else if (stu.getMajorId().equals("BIS")) {
							curriculumWindow.setCollege("Business");
						}
						curriculumWindow.setDegree("Associate");
						if (stu.getMajorId().equals("CST")) {
							curriculumWindow.setFirstMajor("Computer Science");
						} else if (stu.getMajorId().equals("BIS")) {
							curriculumWindow.setFirstMajor("Business");
						}
						curriculumWindow.getReportButton().setOnAction(action -> {
							SainShortWindow sainShortWindow = new SainShortWindow(curriculumWindow.getStage());
							// pass on the same stage so only one window open at
							// once
							if (stu.getMajorId().equals("CST")) {
								sainShortWindow.setProgramField("Computer Science - AS");
							} else if (stu.getMajorId().equals("BIS")) {
								sainShortWindow.setProgramField(("Business - AS"));
							}
							sainShortWindow.setDegreeField("Associate in Science");
							if (stu.getMajorId().equals("CST")) {
								sainShortWindow.setMajorField("Computer Science");
							} else if (stu.getMajorId().equals("BIS")) {
								sainShortWindow.setMajorField(("Business"));
							}
							sainShortWindow.getGeneratorButton().setOnAction(action2 -> {
								if ((sainShortWindow.getSelector()).getValue().toString().equals("Fall 2015")
										|| sainShortWindow.getSelector().getValue().toString().equals("Spring 2016")
										|| sainShortWindow.getSelector().getValue().toString().equals("Summer 2016")
										|| sainShortWindow.getSelector().getValue().toString().equals("Fall 2016")) {
									// all terms do the same thing
									SainReportWindow srWindow = new SainReportWindow(sainShortWindow.getStage());

									if (stu.getMajorId().equals("CST")) {
										srWindow.getProgramField().setText(("Computer Science - AS"));
									} else if (stu.getMajorId().equals("BIS")) {
										srWindow.getProgramField().setText(("Business - AS"));
									}
									if (stu.getMajorId().equals("CST")) {
										srWindow.getMajorField().setText(("Computer Science"));
									} else if (stu.getMajorId().equals("BIS")) {
										srWindow.getMajorField().setText(("Business"));
									}
									srWindow.getDegreeField().setText("Associate in Science");
									srWindow.getCumGpaField().setText(String.valueOf((stu.getGpa())));
									srWindow.getProgGpaField().setText(String.valueOf((stu.getGpa())));
									srWindow.getMajorGpaField().setText(String.valueOf(String.valueOf((stu.getGpa()))));
									srWindow.getCampusField().setText(stu.getCampus());
									srWindow.getEnteredField().setText(stu.getEnteredTerm());
									srWindow.getMetriculatedField().setText(stu.getMatriculatedTerm());
									srWindow.getCatalogField().setText("Spring 2016");
									srWindow.getEvalTermField().setText("Spring 2016");
									if (stu.getPriorDegrees().isEmpty()) {
										// check to see if there's anything here to print to avoic null pointer
										srWindow.getPriorDegreesField().setText("None");
									} else {
										for (int i = 0; i < stu.getPriorDegrees().size(); i++) {
											srWindow.getPriorDegreesField().appendText(stu.getPriorDegrees().get(i));
										}
									}
									if (stu.getCoursesTaken().isEmpty()) {
										// check to make sure there's anything
										// in the students field for courses
										srWindow.getCoursesTakenArea().setText("None");
									} else {
										for (int i = 0; i < stu.getCoursesTaken().size(); i++) {
											srWindow.getCoursesTakenArea()
													.appendText(stu.getCoursesTaken().get(i).toString() + "\n");
										}
									}
									if (stu.getCoursesOther().isEmpty()) {
										srWindow.getOtherCoursesTakenArea().setText("None");
									} else {
										for (int i = 0; i < stu.getCoursesOther().size(); i++) {
											srWindow.getOtherCoursesTakenArea()
													.appendText(stu.getCoursesOther().get(i).toString() + "\n");
										}
									}
									if (stu.getCoursesFailed().isEmpty()) {
										srWindow.getCoursesWithdrawnArea().setText("None");
									} else {
										for (int i = 0; i < stu.getCoursesFailed().size(); i++) {
											srWindow.getCoursesWithdrawnArea()
													.appendText(stu.getCoursesFailed().get(i).toString() + "\n");
										}
									}
									if (stu.getCoursesTaking().isEmpty()) {
										srWindow.getCurrentCoursesArea().setText("None");
									} else {
										for (int i = 0; i < stu.getCoursesTaking().size(); i++) {
											srWindow.getCurrentCoursesArea()
													.appendText(stu.getCoursesTaking().get(i).toString() + "\n");
										}
									}
									if (stu.getCoursesNeeded().isEmpty()) {
										srWindow.getCoursesNeededArea().setText("None");
									} else {
										for (int i = 0; i < stu.getCoursesNeeded().size(); i++) {
											srWindow.getCoursesNeededArea()
													.appendText(stu.getCoursesNeeded().get(i).toString() + "\n");
										}
									}
									srWindow.getCloseButton().setOnAction(action3 -> {
										// staff panes will save the textfields/areas
										
										// bag.saveStaff("staff.dat");
										// bag.saveStudents("students.dat");
										// not saving because this is student only part of controller
										srWindow.getStage().close();
									});
								}
							});
						});
					}
				} else if (window.getTypeSelector().getValue().toString().equals("Staff")) {
					if ((ev.getPassword()).equals(bag.getStaffBag().findByUser((ev.getUsername())).getPass())) {
						//username/password authentication
						sta = bag.getStaffBag().findByUser(ev.getUsername());
						//save staff member for later use
						StudentSearchWindow ssWindow = new StudentSearchWindow(window.getStage());
						ssWindow.getSearchButton().setOnAction(searchAction -> {
							stu = bag.getStudentBag().findByID(ssWindow.getID());
							ssWindow.setNameField(stu.getName());
						});
						ssWindow.getContinueButton().setOnAction(continueAction -> {
							// I used search and continue button to allow user to search multiple times
							if (stu == null) {
								ssWindow.setNameField("Please Enter Valid ID Then Search");
							} else {
								curriculumWindow = new CurriculumWindow(ssWindow.getStage());

								curriculumWindow.setProgramTerm("Assocaite In Science");
								curriculumWindow.setCatalogTerm("Spring 2016");
								curriculumWindow.setLevel("Undergraduate");
								curriculumWindow.setCampus(stu.getCampus());
								if (stu.getMajorId().equals("CST")) {
									curriculumWindow.setCollege("Computer Science");
								} else if (stu.getMajorId().equals("BIS")) {
									curriculumWindow.setCollege("Business");
								}
								curriculumWindow.setDegree("Associate");
								if (stu.getMajorId().equals("CST")) {
									curriculumWindow.setFirstMajor("Computer Science");
								} else if (stu.getMajorId().equals("BIS")) {
									curriculumWindow.setFirstMajor("Business");
								}
								curriculumWindow.getReportButton().setOnAction(action -> {
									SainShortWindow sainShortWindow = new SainShortWindow(curriculumWindow.getStage());
									// pass on the same stage so only one window open at once
									if (stu.getMajorId().equals("CST")) {
										sainShortWindow.setProgramField("Computer Science - AS");
									} else if (stu.getMajorId().equals("BIS")) {
										sainShortWindow.setProgramField(("Business - AS"));
									}
									sainShortWindow.setDegreeField("Associate in Science");
									if (stu.getMajorId().equals("CST")) {
										sainShortWindow.setMajorField("Computer Science");
									} else if (stu.getMajorId().equals("BIS")) {
										sainShortWindow.setMajorField(("Business"));
									}
									sainShortWindow.getGeneratorButton().setOnAction(action2 -> {
										if ((sainShortWindow.getSelector()).getValue().toString().equals("Fall 2015")
												|| sainShortWindow.getSelector().getValue().toString()
														.equals("Spring 2016")
												|| sainShortWindow.getSelector().getValue().toString()
														.equals("Summer 2016")
												|| sainShortWindow.getSelector().getValue().toString()
														.equals("Fall 2016")) {
											// all terms do the same thing
											SainReportWindow srWindow = new SainReportWindow(
													sainShortWindow.getStage());

											if (stu.getMajorId().equals("CST")) {
												srWindow.getProgramField().setText(("Computer Science - AS"));
											} else if (stu.getMajorId().equals("BIS")) {
												srWindow.getProgramField().setText(("Business - AS"));
											}
											if (stu.getMajorId().equals("CST")) {
												srWindow.getMajorField().setText(("Computer Science"));
											} else if (stu.getMajorId().equals("BIS")) {
												srWindow.getMajorField().setText(("Business"));
											}
											srWindow.getDegreeField().setText("Associate in Science");
											srWindow.getCumGpaField().setText(String.valueOf((stu.getGpa())));
											srWindow.getProgGpaField().setText(String.valueOf((stu.getGpa())));
											srWindow.getMajorGpaField().setText(String.valueOf((stu.getGpa())));
											srWindow.getCampusField().setText(stu.getCampus());
											srWindow.getEnteredField().setText(stu.getEnteredTerm());
											srWindow.getMetriculatedField().setText(stu.getMatriculatedTerm());
											srWindow.getCatalogField().setText("Spring 2016");
											srWindow.getEvalTermField().setText("Spring 2016");
											if (stu.getPriorDegrees().isEmpty()) {
												srWindow.getPriorDegreesField().setText("None");
											} else {
												for (int i = 0; i < stu.getPriorDegrees().size(); i++) {
													srWindow.getPriorDegreesField()
															.appendText(stu.getPriorDegrees().get(i));
												}
											}
											if (stu.getCoursesTaken().isEmpty()) {
												// check to make sure there's anything in here
												srWindow.getCoursesTakenArea().setText("None");
											} else {
												for (int i = 0; i < stu.getCoursesTaken().size(); i++) {
													srWindow.getCoursesTakenArea()
															.appendText(stu.getCoursesTaken().get(i).toString() + "\n");
												}
											}
											if (stu.getCoursesOther().isEmpty()) {
												srWindow.getOtherCoursesTakenArea().setText("None");
											} else {
												for (int i = 0; i < stu.getCoursesOther().size(); i++) {
													srWindow.getOtherCoursesTakenArea()
															.appendText(stu.getCoursesOther().get(i).toString() + "\n");
												}
											}
											if (stu.getCoursesFailed().isEmpty()) {
												srWindow.getCoursesWithdrawnArea().setText("None");
											} else {
												for (int i = 0; i < stu.getCoursesFailed().size(); i++) {
													srWindow.getCoursesWithdrawnArea().appendText(
															stu.getCoursesFailed().get(i).toString() + "\n");
												}
											}
											if (stu.getCoursesTaking().isEmpty()) {
												srWindow.getCurrentCoursesArea().setText("None");
											} else {
												for (int i = 0; i < stu.getCoursesTaking().size(); i++) {
													srWindow.getCurrentCoursesArea().appendText(
															stu.getCoursesTaking().get(i).toString() + "\n");
												}
											}
											if (stu.getCoursesNeeded().isEmpty()) {
												srWindow.getCoursesNeededArea().setText("None");
											} else {
												for (int i = 0; i < stu.getCoursesNeeded().size(); i++) {
													srWindow.getCoursesNeededArea().appendText(
															stu.getCoursesNeeded().get(i).toString() + "\n");
												}
											}
											srWindow.getCloseButton().setOnAction(action3 -> {
												// use the close button to save
												// changes will only be saved if
												// user is Admin. not even Staff
												if (sta instanceof Admin) {
													stu.setCampus(srWindow.getCampusField().getText());
													stu.setEnteredTerm(srWindow.getEnteredField().getText());
													stu.setMatriculatedTerm(srWindow.getMetriculatedField().getText());
													stu.getPriorDegrees()
															.add(srWindow.getPriorDegreesField().getText());
													if (srWindow.getMajorField().getText().equals("Business")) {
														stu.setMajorId("BIS");
													} else if (srWindow.getMajorField().getText()
															.equals("Computer Science")) {
														stu.setMajorId("CST");
													}
													//all fields possible to be saved are saved
													System.out.println("Student Info Saved Sucessfully");
												}

												bag.saveStaff("staff.dat");
												bag.saveStudents("students.dat");
												
												srWindow.getStage().close();
											});
										}
									});
								});
							}
						});

					}
				} else if (ev.getPassword() == "" || ev.getUsername() == "") {
					// check to make sure user input is there
					window.setUsernameField("Please Enter User/Password");
					window.setPwField("");
				} else {
					// if user input is invalid
					window.setUsernameField("Incorrect User/Password");
					window.setPwField("");
				}
			}

		});

	}
}
