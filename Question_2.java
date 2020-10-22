package Lab_2;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		/*
		 * A bag of cookies holds 40 cookies. The calorie information on the bag claims
		 * that there are 10 serving in the bag and that a serving equals 300 calories.
		 * write a program that lets the user enter the number of cookies he or she
		 * actually ate and then reports the number of total calories consumed.
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter how many cookies did you eat: ");
		int cookies=scan.nextInt();
		
		if(cookies>40) {
			System.out.println("A bag of cookies holds 40 cookies.Enter minus from 40:");
			cookies=scan.nextInt();
		}
		int calories=cookies*(300*10/40);   //a cooky equals 300*10/40 calories
		
		System.out.println("Number of total calories is: "+calories);
	}

}
