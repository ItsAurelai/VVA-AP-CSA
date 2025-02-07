public class FindMax {
    public static void main(String[] args) {
        int[] numArray = {2, 5, 6, 7, 12, 45, 56, 57, 90};

        int max = numArray[0];

        for (int num : numArray) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The maximum number in the array is: " + max);
    }
}