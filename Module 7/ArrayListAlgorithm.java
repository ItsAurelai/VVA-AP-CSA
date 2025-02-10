import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Part 1
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner s1 = new Scanner(System.in);

        // Part 2
        System.out.println("Enter 10 numbers between 0 and 10:");
        for (int i = 0; i < 10; i++) {
            int num;
            System.out.print("Enter number " + (i + 1) + ": ");
            num = s1.nextInt();
            if (num < 0 || num > 10) {
                System.out.println("Number must be between 0 and 10. Try again.");
            }
            numbers.add(num);
        }

        // Part 3
        int min = numbers.get(0);
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }

        // Part 4
        int countBelow5 = 0;
        for (int num : numbers) {
            if (num < 5) {
                countBelow5++;
            }
        }

        // Part 5
        System.out.println("The ArrayList: " + numbers);

        // Part 6
        System.out.println("The minimum number in the list is: " + min);

        // Part 7
        System.out.println("The number of elements under 5 is: " + countBelow5);
        s1.close();
    }
}