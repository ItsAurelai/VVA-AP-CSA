public class nestedLoop {
    public nestedLoop() {
        //Exercise 1
        int rows1 = 3;
        int columns1 = 3;
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.print("X");
            }
            System.out.println(); // Move to the next line after each row
        }
        
        //Exercise 2
        int rows2 = 2;
        int columns2 = 4;
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print("/");
            }
            System.out.println();
        }
        
        //Exercise 3
        int rows3 = 4;
        int columns3 = 1;
        for (int i = 0; i < rows3; i++) {
            for (int j = 0; j < columns3; j++) {
                System.out.print("?");
            }
            System.out.println();
        }
    }
}