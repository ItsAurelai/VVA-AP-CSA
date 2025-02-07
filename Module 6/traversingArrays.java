import java.util.Scanner;

public class ArrayExercises {

    public static void main(String[] args) {
        // Exercise 1: Counting Even Numbers
        int[] numArray = {2, 5, 6, 7, 12, 45, 56, 57, 90};
        int evenCount = 0;

        for (int num : numArray) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Number of even numbers in the array: " + evenCount);

        // Exercise 2: Finding Words Starting with Vowels
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[5];

        System.out.println("\nEnter 5 words:");
        for (int i = 0; i < words.length; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }

        System.out.println("\nWords starting with vowels:");
        for (String word : words) {
            char firstLetter = Character.toLowerCase(word.charAt(0));
            if (isVowel(firstLetter)) {
                System.out.println(word);
            }
        }
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}