import java.util.Scanner;
public class elseIfStatement {
    public elseIfStatement() {
        //Exercise 1
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input an Integer");
        int i1 = s1.nextInt();
        if (i1 % 2 == 0) {
            System.out.println("Even");
        }
        else if (i1 % 2 != 0) {
            System.out.println("Odd");
        }
        else {
            System.out.println("Neither");
        }
        s1.close();
        
        //Exercise 2
        Scanner s2 = new Scanner(System.in);
        System.out.println("Input an Integer");
        int i2 = s2.nextInt();
        if (i2 > 0) {
            System.out.println("Positive");
        }
        else if (i2 < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
        s2.close();
        
        //Exercise 3
        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter a name:");
        String i3 = s3.nextLine();
        if (i3.equals("John")) {
            System.out.println("I know him.");
        } 
        else if (i3.equals("Jane")) {
            System.out.println("I know her.");
        } 
        else {
            System.out.println("I don't know that person.");
        }
        s3.close();
    }
}