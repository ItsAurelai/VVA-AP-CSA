import java.util.Scanner;
public class whileLoops {
    public whileLoops() {
        //Exercise 1
        int count = 1;
        int finalSum = 0;
        while (count < 6) {
            finalSum += count;
            count ++;
        }
        System.out.println("The sum is: " + finalSum);
        
        //Exercise 2
        int countdown = 10;
        while (countdown >= 0) {
            System.out.println(countdown);
            countdown --;
        }
        
        //Exercise 3
        Scanner s1 = new Scanner(System.in);
        int sum = 0;
        count = 0;
        while (count < 3) {
            System.out.println("Enter a number");
            sum += s1.nextInt();
            count ++;
        }
        System.out.println("The total is " + sum);
        s1.close();
        
        //Exercise 4
        Scanner s2 = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        count = 0;
        while (count < 6) {
            System.out.print("Enter an integer: ");
            int number = s2.nextInt();
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            count++;
        }
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        s2.close();
    }
}
