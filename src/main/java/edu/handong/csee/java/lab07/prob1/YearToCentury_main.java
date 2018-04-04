package edu.handong.csee.java.lab07.prob1;

import java.util.Scanner;		//Use Scanner.

/**
 * This class defines YearToCentury_main class.
 * The YearToCentury_main class has main method.
 * The YearToCentury_main class Control YearToCentury class.
 * @author CUL
 *
 */
public class YearToCentury_main {		//YearToCentury main class
	
	/**
	 * main method is receive the year.
	 * And calculate the year to century.
	 * print century.
	 * @param args main
	 */
	public static void main(String [] args) {		//This is main method		
		int yr=0;									//Declare and initialize integer variable
		
		Scanner keyboard = new Scanner(System.in);	//Scanner 
		
		System.out.println("Input year: ");			//Print following sentence
		yr =keyboard.nextInt();						//yr assigns input integer number.
		
		YearToCentury year = new YearToCentury(yr);	//Create the other method (include Other class)
		System.out.println(yr + " is " + year.calc_century() + "th century");	//Print 0000 is 00th century
		
	}

}
