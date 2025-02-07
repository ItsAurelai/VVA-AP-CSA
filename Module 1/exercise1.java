import java.util.*;
public class exercise1
{
    public exercise1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's the Numerator?");
        int numerator = scan.nextInt();
        System.out.println("What's the Denominator?");
        int denominator = scan.nextInt();
        double decimal1 = (double) numerator / denominator;
        System.out.println("The decimal for this fraction is " + decimal1);
        scan.close();
    }
}
