package edu.handong.csee.java.lab07.prob3;	//Package name
import java.util.Random;					//Use Random method

/**
 * This class defines Attendance_main class.
 * The Attendance_main class has main method.
 * The Attendance_main class Control Attendance class.
 * @author CUL
 *
 */
public class Attendance_main {

	/**
	 * This method is main method of Attendance
	 * @param args are print student's attendance.
	 */
	public static void main(String[] args) {		//main method call
		Attendance s_1 = new Attendance();			//create the attendance s_1
		Attendance s_2 = new Attendance();			//create the attendance s_2
		Attendance s_3 = new Attendance("Lucas", 1, "21833222", 0);		//create the attendance s_3
		Attendance s_4 = new Attendance("Martha", 2, "21733444", 0);	//create the attendance s_4
		
		s_1.set_name("Jess");		//attendance s_1.name assigns name
		s_1.set_year(4);			//attendance s_1.year assigns year
		s_1.set_id("21400999");		//attendance s_1.student_id assigns student_id
		s_1.set_missed(0);			//attendance s_1.missed assigns missed
		
		s_2.set_name("Kent");		//attendance s_2.name assigns name
		s_2.set_year(2);			//attendance s_2.year assigns year
		s_2.set_id("21700111");		//attendance s_2.student_id assigns student_id
		s_2.set_missed(0);			//attendance s_2.missed assigns missed 
		
		Random randomGenerator = new Random();	//call the random method
		
		s_1.set_missed(randomGenerator.nextInt(10));	//Set the random integer number for s_1_missed
		s_2.set_missed(randomGenerator.nextInt(10));	//Set the random integer number for s_2_missed
		s_3.set_missed(randomGenerator.nextInt(10));	//Set the random integer number for s_3_missed
		s_4.set_missed(randomGenerator.nextInt(10));	//Set the random integer number for s_4_missed
		
		if(s_1.get_missed() > 6) { 		//Check the student's course fail
			System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course"); // print fail this course
			System.out.println(s_1.get_name() + " - Number of absence : " + s_1.get_missed()); //print Student's(s_1) name and number of absence 
		}else		//Student is not fail
			System.out.println("We'll see about the grade, " + s_1.get_name());		//print following sentence
		
		
		if(s_2.get_missed() > 6) {		//Check the student's course fail
			System.out.println("I'm sorry " + s_2.get_name() + ". You fail this course");	// print fail this course
			System.out.println(s_2.get_name() + " - Number of absence : " + s_2.get_missed());	//print Student's(s_2) name and number of absence 
		}else	//Student is not fail
			System.out.println("We'll see about the grade, " + s_2.get_name());		//print following sentence
		
		if(s_3.get_missed() > 6) {		//Check the student's course fail
			System.out.println("I'm sorry " + s_3.get_name() + ". You fail this course");		// print fail this course
			System.out.println(s_3.get_name() + " - Number of absence : " + s_3.get_missed());		//print Student's(s_3) name and number of absence
		}else			//Student is not fail
			System.out.println("We'll see about the grade, " + s_3.get_name());		//print following sentence
		
		if(s_4.get_missed() > 6) {		//Check the student's course fail
			System.out.println("I'm sorry " + s_4.get_name() + ". You fail this course");		// print fail this course
			System.out.println(s_4.get_name() + " - Number of absence : " + s_4.get_missed());		//print Student's(s_4) name and number of absence
		}else			//Student is not fail
			System.out.println("We'll see about the grade, " + s_4.get_name());		//print following sentence
		
		
	}
}
