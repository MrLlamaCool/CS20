/*

Program: Delivery.java          Last Date of this Revision: 10/9/2026

Purpose: An application that will either accept or reject the box dimensions.

Author: Evan Chaba, 
School: CHHS
Course: Computer Programming 20
 

*/

package SkillBuilders;
import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
		
		//Create user input
		Scanner userinput = new Scanner(System.in);
		
		//User inputs box dimensions
		System.out.println("All Dimensions Must be Under or Equal to 10.");
		
		//Enter dimensions
		System.out.println("Enter length: ");
		int length = userinput.nextInt();
		System.out.println("Enter width: ");
		int width = userinput.nextInt();
		System.out.println("Enter height: ");
		int height = userinput.nextInt();
		
		//If any dimensions are above 10, display 'Reject', otherwise display 'Accept'
		if(length <= 10 && width <= 10 && height <= 10)
		{
			System.out.println("Accept");
		}
		else
		{
			System.out.println("Reject");
		}
	}

}


/*  Screen Dump

All Dimensions Must be Under or Equal to 10.
Enter length: 
9
Enter width: 
6
Enter height: 
5
Accept

*/