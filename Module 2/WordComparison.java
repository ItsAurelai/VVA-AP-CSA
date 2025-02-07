import java.util.*;

public class WordComparison {
    public static void main(String[] args) {
        //init scan
        Scanner s = new Scanner(System.in);
        
        //prompt for first word
        System.out.print("Enter the first word: ");
        String word1 = s.nextLine().toLowerCase();

        //prompt for 2nd word
        System.out.print("Enter the second word: ");
        String word2 = s.nextLine().toLowerCase();

        //use compareTo() to find the comparison
        int comparisonResult = word1.compareTo(word2);

        //print result
        System.out.println("Result: " + comparisonResult);

        //close scan
        s.close();
    }
}