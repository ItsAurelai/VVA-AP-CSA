public class BoolExpressions {
    public static void main(String[] args) {
        int x = 5;
        int y = 12;
        int z = 17;
        Boolean q1 = new Boolean(x + y == z);
        System.out.println("Does x + y equal z?: " + q1);
        Boolean q2 = new Boolean(x != y);
        System.out.println("Does x not equal y?: " + q2);
        boolean q3 = z - y >= x;
        System.out.println("Is z-y greater than or equal to x?: " + q3);
        boolean q4 = x % 2 == 0;
        System.out.println("Is x even?: " + q4);
        boolean q5 = x % 2 > 0;
        System.out.println("Is x odd?: " + q5);
    }
}
