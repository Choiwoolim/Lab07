package edu.handong.csee.java.lab07.prob3;	//package name


/**
 * This class defines Attendance class.
 * The Attendance has student's name, year, id, missed
 * The Attendance class has Attendance(), get_name(), get_year(), get_id(), get_missed(), set_name(), set_year(), set_id(), set_missed() method.
 * 
 * @author CUL
 *
 */
public class Attendance {		//Class name is attendance
	private String name = " ";	//String type 'name' variable declare
	private int year = 0;		//integer type 'year' variable declare
	private String student_id = " ";	//String type 'student_id' variable declare
	private int missed = 0 ;	//integer type 'missed' variable declare
	
	/**
	 * Attendance method is setting a basic state.
	 */
	public Attendance(){		//method name is Attendance
		this.name = "Null";		//name is not setting
		this.year = 0;			//year is not setting
		this.student_id = "Null";	//student is not setting
		this.missed = 0;		//missed is not setting
	}
	
	/**
	 * Attendance (String, int ,String, int) is setting a input value
	 * 
	 * @param name is student's name
	 * @param year is student's grade
	 * @param student_id is student's id
	 * @param missed is student's absence
	 */
	public Attendance(String name, int year, String student_id, int missed) {	//create the 'Attendance' method (overloading)
		this.name = name;		//name assigns input value of name
		this.year = year;		//year assigns input value of year
		this.student_id = student_id;		//student_id assigns input value of student_id
		this.missed = missed;		//missed assigns input value of missed
	}
	
	/**
	 * String get_name is return the student's name
	 * @return student's name
	 */
	public String get_name() {	//create the 'String get_name' method
		return name;		//return the student's name
	}
	
	/**
	 * get_year is return the student's year
	 * @return student's year
	 */
	public int get_year() {		//create the 'get_year' method
		return year;		//return the student's year
	}
	
	/**
	 * get_id returns the student's id
	 * @return student's id
	 */
	public String get_id() {	//create the 'String get_id' method
		return student_id;	//return the student's id
	}
	
	/**
	 * get_missed the student's absence
	 * @return student's absence
	 */
	public int get_missed() {	//create the 'get_missed' method
		return missed;		//return the student's absence
	}
	
	/**
	 * set_name is setting a student's name
	 * @param name student's name
	 */
	public void set_name(String name) {		//create the 'set_name' method
		this.name = name;		//name is student's name
	}
	
	/**
	 * set_year is setting a student's year
	 * @param year student's year
	 */
	public void set_year(int year) {		//create the 'set_year' method
		this.year = year;		//year is student's year
	}
	/**
	 * set_id is setting a student's id
	 * @param student_id		
	 */
	public void set_id(String student_id) {		//create the 'set_id' method
		this.student_id = student_id;	//student_id is student's id
	}
	
	/**
	 * set_missed is setting a student's absence
	 * @param missed
	 */
	public void set_missed(int missed) {		//create the 'set_missed' method
		this.missed = missed;		//missed is student's absence
	}
	

}
