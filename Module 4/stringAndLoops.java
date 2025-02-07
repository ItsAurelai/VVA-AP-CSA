import java.util.*;
public class stringAndLoops {
    public stringAndLoops() {
        //Exercise 1
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String i1 = s1.nextLine();
        int count = 0;
        for (int i = 0; i < i1.length(); i++) {
            if (i1.charAt(i) == 'e') {
                count++;
            }
        }
        System.out.println(count);
        
        //Exercise 2
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String i2 = s2.nextLine();
        String i2Reversed = "";
        for (int i = i2.length() - 1; i >= 0; i--) {
            i2Reversed += i2.charAt(i);
        }
        System.out.println("Original string: " + i2);
        System.out.println("Reversed string: " + i2Reversed);
        
        //Exercise 3
        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter a string:");
        String i3 = s3.nextLine();
        int index = -1;
        for (int i = 0; i < i3.length(); i++) {
            if (i3.charAt(i) == 'a') {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("The first 'a' is at index: " + index);
        }
        else {
            System.out.println("There is no 'a' in the string!");
        }
    }
}