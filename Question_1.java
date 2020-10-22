package Lab_2;

import java.util.Scanner;

public class Question_1 {

	/*
	 * Write a program with a loop that lets the user enter a series of integer
	 * numbers. After all the numbers have been entered, the program should display
	 * the largest and smallest numbers entered.
	 */

	static int smallestNumber;
	static int largestNumber;
	static int check;
	static Scanner scan;


	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		int number1 = scan.nextInt();
		System.out.println("Enter your next number: ");
		int number2 = scan.nextInt();

		if (number1 > number2) {

			smallestNumber = number2;
			largestNumber = number1;
		} else {
			smallestNumber = number1;
			largestNumber = number2;
		}

		check();

		while (check == 1) {
			System.out.println("Enter your next number: ");
			int number3 = scan.nextInt();
			if (number3 > largestNumber)
				largestNumber = number3;
			else if (number3 < smallestNumber)
				number3 = smallestNumber;

			check();

		}
	}

	public static int check() {

		System.out.println("Do you want to enter another number: 0-No, 1-Yes");
		check = scan.nextInt();

		if (check == 0 || check == 1) {

			if (check == 0) {

				System.out.println("Smallest number is: " + smallestNumber);
				System.out.println("Largest number is: " + largestNumber);

			}
		} else {

			System.out.println("You must enter 0 or 1");
			check();

		}

		return check;
	}

}