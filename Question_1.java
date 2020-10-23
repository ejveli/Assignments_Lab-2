package Lab_2;

import java.awt.Label;
import java.util.Scanner;

public class Question_1copy {

	/*
	 * Write a program with a loop that lets the user enter a series of integer
	 * numbers. After all the numbers have been entered, the program should display
	 * the largest and smallest numbers entered.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int smallestNumber;
		int largestNumber;
		int check;
		int number3;

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

		System.out.println("Do you want to enter another number: 0-No, 1-Yes");
		check = scan.nextInt();

		while (check == 1 || check == 0) {

			if (check == 0) {

				System.out.println("Smallest number is: " + smallestNumber);
				System.out.println("Largest number is: " + largestNumber);
				break;

			}

			if (check == 1) {

				System.out.println("Enter your next number: ");
				number3 = scan.nextInt();

				if (number3 > largestNumber) {
					largestNumber = number3;

				} else if (number3 < smallestNumber) {
					number3 = smallestNumber;
				}
				System.out.println("Do you want to enter another number: 0-No, 1-Yes");
				check = scan.nextInt();

			}

		}

	}
}
