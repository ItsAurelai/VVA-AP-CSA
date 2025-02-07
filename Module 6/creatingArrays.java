import java.util.*;

public class creatingArrays {
    public static void main(String[] args) {
        String[] countries = {"China", "Egypt", "France", "Germany", "India", "Japan", "Kenya", "Mexico", "United Kingdom", "United States"};
        String[] capitals = {"Beijing", "Cairo", "Paris", "Berlin", "New Delhi", "Tokyo", "Nairobi", "Mexico City", "London", "Washington D.C."};
        String[] languages = {"Chinese", "Arabic", "French", "German", "Hindi", "Japanese", "Swahili", "Spanish", "English", "English"};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int index = scanner.nextInt() - 1;

        if (index < 0 || index >= countries.length) {
            System.out.println("Invalid input. Please enter a number between 1 and 10.");
        } else {
            System.out.println("The capital of " + countries[index] + " is " + capitals[index] + " where they speak " + languages[index] + ".");
        }

        scanner.close();
    }
}
