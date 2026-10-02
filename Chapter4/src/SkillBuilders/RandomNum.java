package SkillBuilders;
import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
		
		//Create user input
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter minimun number");
		int min = userinput.nextInt();
		
		System.out.print("Enter max number");
		int max = userinput.nextInt();
		
		System.out.print(Math.floor(Math.random() * (max - min + 1) + min));
	}

}
