import java.util.Scanner;
public class forLoops {
    public forLoops() {
        //Exercise 1
        for (int a=1; a<6; a++) {
            System.out.println(a);
        }
        
        //Exercise 2
        for (int b=10; b>0; b--) {
            System.out.println(b);
        }
        
        //Exercise 3
        Scanner s1 = new Scanner(System.in);
        int sum = 0;
        for (int c=1; c<6; c++) {
            System.out.println("Enter a number: ");
            int number = s1.nextInt();
            sum += number;
        }
        double average = sum / 5;
        System.out.println("The average of the 5 numbers is " + average);
        s1.close();
        
        //Exercise 4
        Scanner s2 = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        for (int d=1; d<5; d++) {
            System.out.print("Enter a number: ");
            int number = s2.nextInt();
            if (number % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        s2.close();
    }
}