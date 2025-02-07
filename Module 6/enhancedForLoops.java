public class ArrayExercises {

    public static void main(String[] args) {
        // Exercise 1: Find the sum and average of numbers in an array
        int[] numArray = {2, 5, 6, 7, 12, 45, 56, 57, 90};
        int sum = 0;

        for (int number : numArray) {
            sum += number;
        }

        double average = (double) sum / numArray.length; 

        System.out.println("Sum of numbers: " + sum);
        System.out.println("Average of numbers: " + average);

        // Exercise 2: Create an acronym from a list of words
        String[] words = {"Cat", "Ant", "Dog", "Bird", "Fish", "Bear"};
        String acronym = "";

        for (String word : words) {
            acronym += word.charAt(0); 
        }

        System.out.println("Acronym: " + acronym);
    }
}