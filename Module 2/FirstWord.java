import java.util.*;

public class FirstWord {
    public static void main(String[] args) {
        //init scan
        Scanner s = new Scanner(System.in);

        //prompt for the sentence
        System.out.print("Enter a sentence: ");
        String sentence = s.nextLine();

        //find the space and init first word and word length vars
        int firstSpaceIndex = sentence.indexOf(' ');
        String firstWord = sentence.substring(0, firstSpaceIndex);
        int wordLength = firstWord.length();

        //answer
        System.out.println("The first word is: " + firstWord);
        System.out.println("The length of the first word is: " + wordLength);

        //close scan
        s.close();
    }
}