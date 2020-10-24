public class Question_1 {

	/*
	 * Write a program with a loop that lets the user enter a series of integer
	 * numbers. After all the numbers have been entered, the program should display
	 * the largest and smallest numbers entered.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int smallestNumber;
		int largestNumber;
		int firstnumber;
		int nextNumber;
		int check = 1; // I assume check=1 in order to enter while loop

		System.out.println("Enter your first number: ");
		firstnumber = scan.nextInt();

		System.out.println("Enter your next number: ");
		nextNumber = scan.nextInt();

		if (firstnumber > nextNumber) {
			smallestNumber = nextNumber;
			largestNumber = firstnumber;
		} else {
			smallestNumber = firstnumber;
			largestNumber = nextNumber;
		}
		while (check == 1) {

			System.out.println("Do you want to enter another number: 0-No, 1-Yes");
			check = scan.nextInt();

			if (check == 0) {
				break;
			}

			if (check == 1) {
				System.out.println("Enter your next number: ");
				nextNumber = scan.nextInt();

				if (nextNumber > largestNumber) {
					largestNumber = nextNumber;
				} else if (nextNumber < smallestNumber) {
					smallestNumber = nextNumber;
				}
			}
			check = 1; // to return beginning of while loop if another number entered instead of 1 or 0
		}
		System.out.println("Smallest number is: " + smallestNumber);
		System.out.println("Largest number is: " + largestNumber);
	}
}
