import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String[] words = {"Cat", "Ant", "Dog", "Bird", "Fish", "Bear"};
        System.out.println("Original array: " + Arrays.toString(words));
        reverseArray(words);
        System.out.println("Reversed array: " + Arrays.toString(words));
    }

    public static void reverseArray(String[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}