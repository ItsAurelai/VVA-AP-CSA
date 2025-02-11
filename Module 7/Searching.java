import java.util.ArrayList;
import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("How many names would you like to enter? ");
        int numNames = input.nextInt();
        input.nextLine(); // Consume newline

        for (int i = 0; i < numNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = input.nextLine().trim(); // Trim whitespace

            if (name.isEmpty()) {
                System.out.println("Name cannot be empty. This name will be skipped.");
                continue; // Skip to the next iteration of the loop
            }

            names.add(name);
        }

        int vowelCount = 0;
        for (String name : names) {
            if (!name.isEmpty()) { // Check again in case of empty strings somehow making it in
                char firstChar = name.toLowerCase().charAt(0);
                if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
                    vowelCount++;
                }
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("Names entered: " + names);
        System.out.println("Number of names starting with a vowel: " + vowelCount);

        input.close();
    }
}