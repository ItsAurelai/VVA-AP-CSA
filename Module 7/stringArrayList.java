import java.util.ArrayList;
public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.remove(0);
        words.add("blueberry");
        words.add("blackberry");
        words.set(2, "food");
        System.out.println("Size of the list: " + words.size());
        System.out.println("The list: " + words);
    }
}