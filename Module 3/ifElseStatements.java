import java.util.Scanner;
public class ifElseStatements {
    public ifElseStatements() {
        //Exercise 1
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input an integer");
        int i1 = s1.nextInt();
        if (i1 % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        s1.close();
        
        //Exercise 2
        Scanner s2 = new Scanner(System.in);
        System.out.println("Input an integer");
        int i2 = s2.nextInt();
        if (i2 > 0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("0 or Negative");
        }
        s2.close();
        
        //Exercise 3
        Scanner s3 = new Scanner(System.in);
        System.out.println("Input name here");
        String i3 = s3.nextLine();
        if (i3.equals("John")) {
            System.out.println("Same");
        }
        else {
            System.out.println("Different");
        }
        s3.close();
    }
}