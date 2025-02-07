import java.util.*;
public class exercise3
{
    public exercise3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a decimal with 3 or more decimal spaces");
        double number = scan.nextDouble();
        int decimalDigits = (int)((number - (int)number) * 1000);
        System.out.println("Answer: " + (decimalDigits / 100) + " " + (decimalDigits / 10 % 10) + " " + (decimalDigits % 10));
        scan.close();
    }
}
