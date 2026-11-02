/*

Program: Evens.java          Last Date of this Revision: 10/27/2026

Purpose: An application that displays the even numbers between 1 and 20, inclusive.

Author: Evan Chaba, 
School: CHHS
Course: Computer Programming 20
 

*/


package SkillBuilders;

public class Evens {

	public static void main(String[] args) {
		System.out.println("Even numbers between 1 and 20: ");
		
		//Start at at 2 and increment by 2
		for (int i = 2; i <= 20; i += 2) {
			System.out.print(i + " "); //Print the list of evens
		}
		System.out.println(); 
	}

}


/*  Screen Dump

Even numbers between 1 and 20: 
2 4 6 8 10 12 14 16 18 20 


*/