package Lab_2;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		/*
		 * Write a program that asks the user for a positive nonzero integer value. The
		 * program should use a loop to get the sum of all the integers from 1 up to the
		 * number entered.
		 */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a positive number: ");
		int number=scan.nextInt();
		int sum=0;
		
		for(int i=1;i<=number;i++) {
			sum+=i;
		}
		System.out.println("Sum of all the integers from 1 up to the "+number+": "+sum);
	}

}
