/*

Program: RandomNum.java          Last Date of this Revision: 10/9/2026

Purpose: An application that displays a random number between on the min and max entered by the user.

Author: Evan Chaba, 
School: CHHS
Course: Computer Programming 20
 

*/

package SkillBuilders;
import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
		
		//Create user input
		Scanner userinput = new Scanner(System.in);
		
		//User inputs min and max range
		System.out.print("Enter minimun number");
		int min = userinput.nextInt();
		System.out.print("Enter max number");
		int max = userinput.nextInt();
		
		//Random range calculation using the user inputs
		System.out.print(Math.floor(Math.random() * (max - min + 1) + min));
	}

}


/*  Screen Dump

Enter minimun number1
Enter max number10
7.0

*/