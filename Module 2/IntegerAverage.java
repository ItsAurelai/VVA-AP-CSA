import java.util.*;
public class IntegerAverage {
    public static void main(String[] args) {
        // init scan
        Scanner s = new Scanner(System.in);

        // init ints
        Integer a = null;
        Integer b = null;

        // print init a and b
        System.out.println("Initial values of a and b: " + a + " and " + b);

        // get new values
        System.out.print("Enter the value for a: ");
        a = s.nextInt();
        System.out.print("Enter the value for b: ");
        b = s.nextInt();

        // find average
        double average = (double) (a + b) / 2;

        // print a and b and average
        System.out.println("a = " + a + ", b = " + b + ", average = " + average);
        
        // close scan
        s.close();
    }
}