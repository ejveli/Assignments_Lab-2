package Lab_2;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		/*
		 * 
		 * Write a program that will ask the user to enter the amount of a purchase. The
		 * program should then compute the state and county tax sales tax. Assume the
		 * state sales tax is 4 percent and the county sales tax is 2 percent. The
		 * program should display the amount of the purchase , the state sales tax, the
		 * county sales tax, the total sales tax, and the total of the sale (which is
		 * the sum of the amount of purchase plus the total sales tax)
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Item Price: ");
		double itemPrice = scan.nextDouble();
		double stateTax = itemPrice * 0.04;
		double countryTax = itemPrice * 0.02;
		double totalSalesTax=stateTax+countryTax;
		double total = totalSalesTax + itemPrice;
		

		System.out.println();
		System.out.println("***************************");
		System.out.println("***************************");
			
		System.out.println("Item Price       : " + itemPrice);
		System.out.println("State Tax        : " + Math.round(stateTax*100)/100f); // for rounding the value to two decimal digit
		System.out.println("Country Tax      : " + Math.round(countryTax*100)/100f);
		System.out.println("Total Sales Tax  : " + Math.round(totalSalesTax*100)/100f);
		System.out.println("Total Bill       : " + Math.round(total*100)/100f);


	}

}
