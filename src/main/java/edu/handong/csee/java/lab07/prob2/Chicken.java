package edu.handong.csee.java.lab07.prob2; //Package name.

/**
 * 
 * This class defines Chicken class.
 * The Chicken has name, price, stars
 * The Chicken class has Chicken(), get_name(), get_price(), get_stars(), set_name() set_price() set_stars() method.
 * 
 * @author CUL
 *
 */
public class Chicken {		//Create method
	private String name;	//declare the String type variable
	private double price;	//declare the double type variable
	private int stars;		//declare the integer type variable 
	
	/**
	 * This method is initialized Chicken's name, price and stars
	 */
	public Chicken() {		//Create Chicken method
		this.name = "";		//initialize parameter.
		this.price = 0.0;	//initialize parameter.
		this.stars = 0;		//initialize parameter.
		}
	
	/**
	 * This method assigns Input data.
	 * @param name is chicken's name
	 * @param price is chicken's price
	 * @param stars is chicken's rating
	 */
	public Chicken(String name, double price, int stars){	//Create the Chicken method.
		this.name = name;		//assign Input data.
		this.price = price;		//assign Input data.
		this.stars = stars;		//assign Input data.
	}
	
	/**
	 * This method gets chicken's name
	 * @return String value
	 */
	public String get_name() {		//Create the get_name method.
		return this.name;		//return name
	}

	/**
	 * This method gets chicken's price
	 * @return is double type variable
	 */
	public double get_price() {		//Create the get_price method.
		return this.price;			//return price
	}
	
	/**
	 * This method gets chicken's stars
	 * @return is integer type variable
	 */
	public int get_stars() {		//Create the get_stars method.
		return this.stars;			//return stars.
	}
	
	/**
	 * This method sets the name.
	 * @param name is chicken's name.
	 */
	public void set_name(String name) {		//Create the set_name method.
		this.name = name;			//Setting the name.
	}

	/**
	 * This method sets the price.
	 * @param price is chicken's price.
	 */
	public void set_price(double price) {	//Create the set_price method.
		this.price = price;			//Setting the price.
	}
	
	/**
	 * This method sets the stars.
	 * @param stars is chicken's rating
	 */
	public void set_stars(int stars) {		//Create the set_stars method.
		this.stars = stars;			//Setting the stars.
	}
	
}
