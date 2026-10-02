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