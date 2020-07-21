import java.util.Scanner;

public class ConditionalLabThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter a number between 1 and 100.");
		int number = scnr.nextInt();

		System.out.println("You picked the number " + number);

		if (number % 2 == 0) {
			System.out.println(number + " is an even number.");
		} if (number % 2 == 1) {
			System.out.println(number + " is an odd number.");
		} else if (number <= 24 && number % 2 == 0) {
			System.out.println(number + " is even and less than 25.");
		} else if (number > 26 && number <= 60 && number % 2 == 0) {
			System.out.println(number + " is even.");
		} else if (number > 60 && number % 2 == 0) {
			System.out.println(number + " is even.");
		}  if (number >= 60 && number % 2 == 1) {
			System.out.println(number + " is odd and over 60.");
			
			scnr.close();
			return;
			
		}

	}
}
