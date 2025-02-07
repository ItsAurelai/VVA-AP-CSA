import java.util.*;
public class mod3Project {
    public mod3Project() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Would you like to guess the code?");
        String i1 = s1.nextLine();
        if (i1.equalsIgnoreCase("yes")) {
            System.out.println("The first number is an integer. Enter the number");
            int i2 = s1.nextInt();
            s1.close();
            if ((i2 >= 70 && i2 < 80) || i2 == 7) {
                System.out.println("The next input is a word. Enter your word:");
                Scanner s2 = new Scanner(System.in);
                String i3 = s2.nextLine();
                if (i3.length() == 5) {
                    System.out.println("The final number is an integer. Enter your number");
                    int i4 = s2.nextInt();
                    if (i4 % 2 == 0) {
                        System.out.println("You guessed the code!");
                        s2.close();
                    }
                    else {
                        System.out.println("So close, yet so far away...");
                    }
                }
                else {
                    System.out.println("Nice try...");
                }
            }
            else {
                System.out.println("Incorrect, Try Again!");
            }
        }
        else {
            System.out.println("Ok :(");
        }
    }
}