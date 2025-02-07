import java.util.*;
public class expressionAssignmentState
{
    public expressionAssignmentState()
    {
        // Part I: Declare Variables and Init Scan
        int int1 = 3;
        int int2 = 7;
        double double1 = 6.5;
        double double2 = 9.2;
        boolean bool1 = true;
        boolean bool2 = false;
        String str1 = "book";
        String str2 = "bag";
        Scanner scan = new Scanner(System.in);
        
        //Ex. 1: Use a print statement to add one integer variable and one double variable.
        System.out.println(int1 + double1);
        
        //Ex. 2: Use two print statements to find the remainder of the two integer variables, each statement in the opposite order.
        System.out.println(int1 % int2);
        System.out.println(int2 % int1);
        
        //Ex. 3: Use a print statement to add the two String variables.
        System.out.println(str1 + str2);
        
        //Ex. 4: Use a print statement and the equality operator to determine the value of one boolean variable is equivalent to the other boolean variable.
        System.out.println(bool1 == bool2);
        
        //Ex. 5: Initialize an integer type variable to take user input and then print the user input using the variable it is stored in.
        System.out.println("Input a Integer:");
        int userInputInt = scan.nextInt();
        System.out.println(userInputInt);
        
        //Ex. 6: Initialize a double type variable to take user input and then print the user input using the variable it is stored in.
        System.out.println("Input a Double:");
        double userInputDouble = scan.nextDouble();
        System.out.println(userInputDouble);
        
        //Ex. 7: Initialize a boolean type variable to take user input and then print the user input using the variable it is stored in.
        System.out.println("Input a Boolean:");
        boolean userInputBool = scan.nextBoolean();
        System.out.println(userInputBool);
        scan.close();
        
        //Ex. 8: Initialize a String type variable to take user input and then print the user input using the variable it is stored in.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String:");
        String userInputString = scanner.nextLine();
        System.out.println(userInputString);
        scanner.close();
        
        //Ex. 9: Use a print statement to divide one of the integer variables by 0.
        //System.out.println(int1 / 0);
        //I commented this out so the rest of the code could run
        
        //Ex. 10: Use a print statement to calculate the first integer variable added to the second integer variable multiplied by the first double variable.
        System.out.println(int1 + int2 * double1);
    }
}
