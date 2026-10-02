package SkillBuilders;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		// create dictionary
        Map<String, String> dictionary = new HashMap<>();

        //keys and values
        dictionary.put("1", "1: 74-95 mph or 64-82 kt or 119-153 km/hr");
        dictionary.put("2", "2: 96-110 mph or 83-95 kt or 154-177 km/hr");
        dictionary.put("3", "3: 111-130 mph or 96-113 kt or 178-209 km/hr");
        dictionary.put("4", "4: 131-155 mph or 114-135 kt or 210-249 km/hr");
        dictionary.put("5", "5: greater than 155 mph or 135 kt or 249 km/hr");
        
        // open the scanner to read user input
        Scanner input = new Scanner(System.in);
        
        // read the category entered by the user
        System.out.print("Enter a hurricane category (1-5): ");
        String category = input.nextLine();
        
        //print the value based on user input
        if (dictionary.containsKey(category)) {
            System.out.println("Category " + dictionary.get(category));
        } else {
            System.out.println("Please enter a number between 1 and 5.");
        }
        
        //close the scanner
        input.close();
	}
}
