import java.util.*;
public class exercise2
{
    public exercise2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's the first decimal?");
        double dec1 = scan.nextDouble();
        System.out.println("What's the second decimal?");
        double dec2 = scan.nextDouble();
        dec1 += 0.5;
        dec2 += 0.5;
        int rounded1 = (int) dec1;
        int rounded2 = (int) dec2;
        System.out.println("The difference of the 2 numbers rounded is " + (rounded1 - rounded2));
        scan.close();
    }
}
