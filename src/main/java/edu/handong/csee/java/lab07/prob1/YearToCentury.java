package edu.handong.csee.java.lab07.prob1;		//package name

/**
 * This class defines YearToCentury class.
 * The YearTocentury has year value
 * The YearToCentury class has YearToCentury, YearToCentury(int) calc_century() method.
 * @author CUL
 *
 */

public class YearToCentury {		//Class name.
	int year;						//Declare variable

	/**
	 * YearToCentury method is initialize the year variable
	 */
	public YearToCentury() {		//initialize  century
		year=0;						//year is initialized
	}
	
	/**
	 * YearToCetury(int)method assigns input integer number.
	 * @param year assign the input number
	 */
	public YearToCentury(int year) {		//Another method create
		this.year = year;					//Input year assigns this class and method
		
	}
	
	/**
	 * calc_century() method is change year to century
	 * @return year is century value
	 */
	public int calc_century(){				//calculate the year to century
		if(year % 100 == 0)					//year modulus 100 is 0
			year = year/100;				//year is year divided 100
		else {								//other if condition
			year = (year/100) +1;			//year assigns century
		}
		return year;						//return year integer value.
	}

}
