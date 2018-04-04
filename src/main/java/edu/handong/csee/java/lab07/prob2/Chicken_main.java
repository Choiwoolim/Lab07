package edu.handong.csee.java.lab07.prob2;//Package name.

/**
 * This class defines Chicken_main class.
 * The Chicken_main class has main method.
 * The Chicken_main class Control Chicken class.
 * @author wooli
 *
 */
public class Chicken_main {		//Chicken main class
	
	/**
	 * This method is main method of Chicken
	 * @param args are print chicken's name and rating(stars)
	 */
	public static void main(String[] args) {		//Chicken main method
		Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5);		//menu1 creates and assigns (name, price, stars)
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5);		//menu2 creates and assigns (name, price, stars)
		Chicken menu3 = new Chicken("Spicey_Chicken", 16000.00, 1);		//menu3 creates and assigns (name, price, stars)
	
		menu1.set_stars(3);	//menu1 changes the star (5 ->3)
		menu2.set_stars(4);	//menu2 changes the star (5 ->4)
		menu3.set_stars(1);	//menu3 changes the star (1 ->1)
		
		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars());	//Print menu1's Chicken name and stars
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars());	//Print menu2's Chicken name and stars
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars());	//Print menu3's Chicken name and stars
				
	}

}
