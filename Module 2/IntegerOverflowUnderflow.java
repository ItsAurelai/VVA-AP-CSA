public class IntegerOverflowUnderflow {
    public static void main(String[] args) {
        // create int and overflow
        int maxInt = Integer.MAX_VALUE;
        maxInt++;
        System.out.println("Maximum integer + 1: " + maxInt);

        // create int and underflow
        int minInt = Integer.MIN_VALUE;
        minInt--;
        System.out.println("Minimum integer - 1: " + minInt);
    }
}