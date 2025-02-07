import java.util.Scanner;
public class compoundBoolean {
    public compoundBoolean() {
        //Exercise 1
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input an integer");
        int i1 = s1.nextInt();
        if (i1 >= 64 && i1 <= 100) 
            System.out.println("Pass");
        else
            System.out.println("Fail");
        s1.close();
        
        //Exercise 2
        Scanner s2 = new Scanner(System.in);
        System.out.println("Input 2 integers");
        int i2 = s2.nextInt();
        int i3 = s2.nextInt();
        if ((i2 >= 0 && i3 >= 0) && (i2 % 2 == 0 && i3 % 2 ==0))
            System.out.println("Both are positive and even");
        else
            System.out.println("One is negative or odd.");
        s2.close();
        
        //Exercise 3
        Scanner s3 = new Scanner(System.in);
        System.out.println("Input a decimal");
        double i4 = s3.nextDouble();
        if (i4 > 100 || i4 < -100)
        System.out.println("Invalid Number");
        else if (i4 > 0 == false)
        System.out.println("You have entered a negative number");
        else
        System.out.println("You have entered a positive number");
        s3.close();
    }
}