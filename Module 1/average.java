import java.util.*;
/**
 * Write a description of class average here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class average
{
    public average() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Whats the first number?");
        int num1 = scan.nextInt();
        System.out.println("Whats the second number?");
        int num2 = scan.nextInt();
        System.out.println("Whats the third number?");
        int num3 = scan.nextInt();
        double numCombined = (double) num1 + num2 + num3;
        double average = numCombined / 3;
        System.out.println("The average of the 3 numbers is " + average);
    }
}