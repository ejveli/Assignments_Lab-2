package Lab_2;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		/*
		 * 
		 * Write a program that computes the tax and tip on a restaurant bill. The
		 * program should ask the user to enter the charge for the meal. The tax should
		 * be 6.75 percent of the meal charge. The tip should be 20 percent of the total
		 * after adding tax. Display the meal charge, tax amount, tip amount, and total
		 * bill on the screen.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the charge for the meal: ");
		double charge = scan.nextDouble();
		double tax=charge*0.0675;
		double tip=(tax+charge)*0.2;
		double total=charge+tax+tip;
		
		System.out.println();
		System.out.println("********************");
		System.out.println("********************");
			
		System.out.println("Meal charge : " + charge);
		System.out.println("Tax         : " + Math.round(tax*100)/100f); // for rounding the value to two decimal digit
		System.out.println("Tip charge  : " + Math.round(tip*100)/100f);
		System.out.println("Total Bill  : " + Math.round(total*100)/100f);

	}

}
