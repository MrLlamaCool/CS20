
/*

Program: Grade.java          Last Date of this Revision: 10/14/2026

Purpose: Mastery Exercise 5, A grade application that displays a corresponding letter to a grade percentage.

Author: Evan Chaba, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		
		System.out.println("Enter your test grade percentage.");
		
		//Create user input
		Scanner userinput = new Scanner(System.in);
		int grade = userinput.nextInt();
				
		//Figure out which letter fits the entered grade
		if(grade >= 90 && grade <= 100)
		{
			System.out.println("You got an A.");
		}
		else if(grade >= 80 && grade <= 89)
		{
			System.out.println("You got a B.");
		}
		else if(grade >= 70 && grade <= 79)
		{
			System.out.println("You got a C.");
		}
		else if(grade >= 60 && grade <= 69)
		{
			System.out.println("You got a D.");
		}
		else if(grade <= 60)
		{
			System.out.println("You got an F.");
		}

	}

}

/*  Screen Dump

Enter your test grade percentage.
78
You got a C.

*/