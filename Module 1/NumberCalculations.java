import java.util.*;
public class NumberCalculations
{
    public NumberCalculations()
    {
        //Exercise 1:
        
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Type an Integer");
        int ex1Int = scan1.nextInt();
        int count = 0;
        System.out.println("Going Up!");
        while(count < 3) {
            ex1Int ++;
            System.out.println("The new number is " + ex1Int);
            count ++;
        }
        System.out.println("Going Down!");
        while(count > 0) {
            ex1Int --;
            System.out.println("The new number is " + ex1Int);
            count --;
        }
        scan1.close();
        
        //Exercise 2:
        
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Insert a number of inches to convert into feet.");
        double ex2Doub = scan2.nextDouble();
        ex2Doub /= 12;
        System.out.println("There are " + ex2Doub + " feet.");
        scan2.close();
        
        //Exercise 3:
        
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Insert the area of the rectangle");
        double ex3Doub = scan3.nextDouble();
        ex3Doub /= 2;
        System.out.println("The length is " + ex3Doub);
        scan3.close();
        
        //Exercise 4:
        
        Scanner scan4 = new Scanner(System.in);
        System.out.println("How much did the item cost?");
        double ex4Doub = scan4.nextDouble();
        ex4Doub = 20 - ex4Doub;
        System.out.println("Change = $" + ex4Doub);
        scan4.close();
    }
}
