import java.util.Scanner;
public class IfStatements {
    public IfStatements() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a double: ");
        double i1 = s1.nextDouble();
        if (i1 == 17.7) {
            System.out.println("EQUAL");
        }
        s1.close();
        
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int i2 = s2.nextInt();
        if (i2 == 25) {
            System.out.println("EQUAL");
        }
        s2.close();
        
        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int i3 = s3.nextInt();
        System.out.println("Enter another integer: ");
        int i4 = s3.nextInt();
        if (i4 * 2 == i3) {
            System.out.println("Doubled");
        }
        s3.close();
        
        Scanner s4 = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int i5 = s4.nextInt();
        if (i5 % 2 == 0) {
            System.out.println("Can be divided by 2");
        }
        if (i5 % 10 == 0) {
            System.out.println("Can be divided by 10");
        }
        s4.close();
        
        Scanner s5 = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String i6 = s5.nextLine();
        if (i6.equals("Nice")) {
            System.out.println("Same");
        }
        s5.close();
    }
}