import java.util.*;
public class subseason {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String subjectAsk = new String("What's your favorite subject?");
        System.out.println(subjectAsk);
        String subject = s.nextLine();
        String seasonAsk = "What's your favorite season?";
        System.out.println(seasonAsk);
        String season = s.nextLine();
        System.out.println("I like studying " + subject + " in the " + season + " as well!");
    }
}