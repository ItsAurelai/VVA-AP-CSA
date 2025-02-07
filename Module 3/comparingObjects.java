import java.util.*;
public class comparingObjects {
    public comparingObjects() {
        //Exercise 1
        Scanner s1 = new Scanner(System.in);
        System.out.println("Input your password");
        String i1 = s1.nextLine();
        if (i1.equals("computer")) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Wrong");
        }
        s1.close();
        
        //Exercise 2
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter 2 Strings");
        String i2 = s2.nextLine();
        String i3 = s2.nextLine();
        if (i2.equals(i3)) {
            System.out.println("Same");
        } else if (i2.equalsIgnoreCase(i3)) {
            System.out.println("Almost");
        } else if (i2.length() == i3.length()) {
            System.out.println("So close");
        } else {
            System.out.println("Denied");
        }
        s2.close();
    }
}