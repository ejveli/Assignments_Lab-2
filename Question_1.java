public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int smallestNumber;
		int largestNumber;
		int enteredNumber;
		int check = 1; // I assume check=1 in order to enter while loop

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

		while (check == 1) {

			System.out.println("Do you want to enter another number: 0-No, 1-Yes");
			check = scan.nextInt();

			if (check == 0) {

				break;

			}

			if (check == 1) {

				System.out.println("Enter your next number: ");
				enteredNumber = scan.nextInt();

				if (enteredNumber > largestNumber) {

					largestNumber = enteredNumber;

				} else if (enteredNumber < smallestNumber) {

					smallestNumber = enteredNumber;
				}

			}
			check = 1; // to return beginning of while loop if another number entered instead of 1 or 0
		}
		System.out.println("Smallest number is: " + smallestNumber);
		System.out.println("Largest number is: " + largestNumber);

	}
