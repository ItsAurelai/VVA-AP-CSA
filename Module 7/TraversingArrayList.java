import java.util.ArrayList;
import java.util.Scanner;
public class TraversingArrayList {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            double num = input.nextDouble();
            numbers.add(num);
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        System.out.println("ArrayList: " + numbers);
        System.out.println("The sum of the numbers is: " + sum);
        input.close();
    }
}