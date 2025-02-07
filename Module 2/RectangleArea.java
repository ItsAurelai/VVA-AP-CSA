import java.util.*;

public class RectangleArea {
    public static void main(String[] args) {
        // init scan
        Scanner s = new Scanner(System.in);

        // init ints
        Integer length = null;
        Double width = null;

        // get length and width
        System.out.print("Enter the length of the rectangle: ");
        length = s.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        width = s.nextDouble();

        // find area
        double area = length * width;

        // print area
        System.out.println("The area of the rectangle is: " + area);
        
        // close scan
        s.close();
    }
}