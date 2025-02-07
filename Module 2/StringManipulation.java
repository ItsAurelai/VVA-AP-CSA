import java.util.*;

public class StringManipulation {
    public static void main(String[] args) {
        //init scan
        Scanner s = new Scanner(System.in);
        
        //string prompt
        System.out.print("Enter a string: ");
        String inputString = s.nextLine();

        //int prompt
        System.out.print("Enter an integer: ");
        int n = s.nextInt();

        //substring work
        String firstNLetters = inputString.substring(0, n);
        String lastNLetters = inputString.substring(inputString.length() - n);
        
        //print answer
        System.out.println(firstNLetters + lastNLetters);

        //close scan
        s.close();
    }
}