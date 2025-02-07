public class studentData {
    public static void main(String[] args) {
        double[] gpaArray = {5.6, 3.4, 2.3, 1.1, 0.7, 3.7, 4.0, 4.1, 3.2, 2.6};
        String[] nameArray = {"Jan", "Jon", "Ken", "Kate", "Ed", "Al", "Tina", "Joe", "Tim", "Zack"};
        // Part 1
        int[] gradeArray = {12, 10, 10, 12, 9, 11, 11, 9, 12, 9, 10};
        
        // Part 2 + 7
        double gpaSum = 0;
        for (double gpa : gpaArray) {
            gpaSum += gpa;
        }
        double gpaAverage = gpaSum / gpaArray.length;
        System.out.println("Average GPA: " + gpaAverage);
        
        // Part 3 + 8
        int maxNameLength = 0;
        for (String name : nameArray) {
            int currentNameLength = name.length();
            if (currentNameLength > maxNameLength) {
                maxNameLength = currentNameLength;
            }
        }
        System.out.println("Longest Name(s): ");
        for (String name : nameArray) {
            if (name.length() == maxNameLength) {
                System.out.println(name);
                System.out.println(name.length());
            }
        }
        
        // Part 4 + 9
        double gpaHighest = 0;
        String gpaHighestName = "";
        int highestIndex = 0;
        for (int i = 0; i < gpaArray.length; i++) {
            double gpa = gpaArray[i]; // Get the GPA at the current index
            if (gpa > gpaHighest) {
                gpaHighest = gpa;
                gpaHighestName = nameArray[i];
                highestIndex = i;
            }
        }
        System.out.println("Highest GPA: " + gpaHighestName + ": " + gpaHighest);
        System.out.println("Index of Highest GPA: " + highestIndex); // Print the index
        
        // Part 5 + 10
        int ninthGraders = 0;
        int tenthGraders = 0;
        int eleventhGraders = 0;
        int twelfthGraders = 0;
        for (int grade : gradeArray) {
            if (grade == 9) {
                ninthGraders++;
            }
            else if (grade == 10) {
                tenthGraders++;
            }
            else if (grade == 11) {
                eleventhGraders++;
            }
            else if (grade == 12) {
                twelfthGraders++;
            }
            else {
                System.out.println("Invalid Grade!");
            }
        }
        System.out.println("Ninth Graders: " + ninthGraders);
        System.out.println("Tenth Graders: " + tenthGraders);
        System.out.println("Eleventh Graders: " + eleventhGraders);
        System.out.println("Twelfth Graders: " + twelfthGraders);
        
        // Part 6
        System.out.println("Student Data:");
        for (int i = 0; i < nameArray.length; i++) {
            System.out.println(nameArray[i] + ": " + gpaArray[i]);
        }
    }
}