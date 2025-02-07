public class Quiz208Q2 {
    public static void main(String[] args) {
        Integer integer1 = 2;
        Double doubleValue = 2.5;
        Integer integer2 = 4;

        // Compare the two Integer variables using compareTo
        int comparisonResult = integer1.compareTo(integer2);
        System.out.println("Comparison result: " + comparisonResult);

        // Calculate the product of all three variables
        double product = integer1 * doubleValue * integer2;
        System.out.println("Product: " + product);
    }
}
