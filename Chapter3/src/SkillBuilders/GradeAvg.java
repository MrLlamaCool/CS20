package SkillBuilders;
import java.util.Scanner;

public class GradeAvg {

	public static void main(String[] args) {
		//Declare variables
		int G1, G2, G3, G4, G5;
		
		try (
			//Create Scanner object
			Scanner input = new Scanner(System.in)) {
			//Create empty variable that will progressively store user inputs
			int total = 0;
			
			//Get user inputs and store into the variables
			System.out.print("Enter first grade: ");
			G1 = input.nextInt();
			total += G1;
			System.out.println("Enter second grade: ");
			G2 = input.nextInt();
			total += G2;
			System.out.println("Enter third grade: ");
			G3 = input.nextInt();
			total += G3;
			System.out.println("Enter fourth grade: ");
			G4 = input.nextInt();
			total += G4;
			System.out.println("Enter fifth grade: ");
			G5 = input.nextInt();
			total += G5;
			//////////////////////////////////////////////
			
			//Calculate Average
			int Avg = total / 5;
			//Output Average Grade
			System.out.println("Average grade: " + Avg + "%");
		}
	}
}