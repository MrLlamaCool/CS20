package SkillBuilders;
import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		//Declare variables
		int number, onesPlace, tensPlace;
		
		//Create Scanner object
		Scanner input = new Scanner(System.in);
		
		//Get the two-digit number from the user
		System.out.print("Enter a two-digit number: ");
		
		//Store the number from the user
		number = input.nextInt();
		
		//Calculate the ones and tens place
		onesPlace = number % 10;
		tensPlace = number / 10;
		
		//Output the results to the console
		System.out.println("The tens-digit is: " + tensPlace + " and the ones-digit is " + onesPlace);
	}

}
