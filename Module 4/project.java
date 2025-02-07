import java.util.Scanner;
public class project {
    public project() {
        // Algorithm 1
        
        // init scanner and get user sentence input
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence1 = s1.nextLine();
        
        // init vars
        int vowels = 0;
        String newSentence1 = "";
        
        // start iterating through the string, and append all of the non-vowels to newSentence, and if it is a vowel, increase int vowels by 1
        for (int i = 0; i < sentence1.length(); i++) {
            char c = sentence1.charAt(i);
            if (i == 0 || !isVowel(c)) {
                newSentence1 += c;
            }
            else {
                vowels++;
            }
        }
        
        // final print statements
        System.out.println("New sentence: " + newSentence1);
        System.out.println("Number of vowels removed: " + vowels);
        
        // close s1
        s1.close();
        
        
        
        // Algorithm 2
        
        // init scanner and get the sentence
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence2 = s2.nextLine();
        
        // init vars
        String newSentence2 = "";
        
        // start iteraring through the string, and if the sentence has a 
        for (int i = 0; i < sentence2.length(); i++) {
            if (i == 0 || sentence2.charAt(i) != sentence2.charAt(i - 1)) {
                newSentence2 += sentence2.charAt(i);
            }
        }
        
        // final print statement
        System.out.println("New sentence: " + newSentence2);
    }
    
    // For algorithm 1, finds if char c is a vowel (this took me way to long to figure out)
    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}