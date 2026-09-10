package SkillBuilders;
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		
		//Declaration
		int length;
		int width;
		
		//Create user input
		Scanner userinput = new Scanner(System.in);
		
		//Get width from the keyboard
		System.out.print("Enter width: ");
		width = userinput.nextInt();
		
		//Get length from the keyboard
		System.out.print("Enter length: ");
		length = userinput.nextInt();
		
		//Display dimensions
		System.out.println("Area of Rectangle = " + length * width);
		System.out.print("Perimeter of Rectangle = " +  2 * (length + width));
	}

}
