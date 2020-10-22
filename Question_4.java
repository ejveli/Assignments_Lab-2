package Lab_2;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		/*
		 * Write a program that asks user for the number of males and the number of
		 * females registered in a class. The program should display the percentage of
		 * males and females in the class.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of males: ");
		int males = scan.nextInt();
		System.out.println("Enter number of females: ");
		int females = scan.nextInt();

		double percentageMales = males * 100.0 / (females + males);
		double percentageFemales = females * 100.0 / (males + females);

		System.out.println("The percentage of males: % " + percentageMales);
		System.out.println("The percentage of females: % " + percentageFemales);

	}

}
