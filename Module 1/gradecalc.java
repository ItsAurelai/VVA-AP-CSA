//Import Scanner
import java.util.*;
public class gradecalc
{
    public gradecalc()
    {
        //Init Scanner
        Scanner scan = new Scanner(System.in);
        
        //Get course name
        System.out.println("What's the name of your course?");
        String courseName = scan.nextLine();
        
        //Get course time
        System.out.println("How many minutes have you spent in the classroom?");
        int classMinutes = scan.nextInt();
        
        //Get course grades
        System.out.println("Input your first classwork grade");
        int classwork1 = scan.nextInt();
        System.out.println("Input your second classwork grade");
        int classwork2 = scan.nextInt();
        System.out.println("Input your first quiz grade");
        double quiz1 = scan.nextDouble();
        System.out.println("Input your second quiz grade");
        double quiz2 = scan.nextDouble();
        System.out.println("Input your third quiz grade");
        double quiz3 = scan.nextDouble();
        System.out.println("Input your test grade");
        double test = scan.nextDouble();
        
        //Close Scanner
        scan.close();
        
        //Find course time
        System.out.println("Time spent in course...");
        System.out.println("Hours: " + (classMinutes / 60));
        System.out.println("Minutes: " + (classMinutes % 60));
        
        //Calculate and print averages
        double classworkAverage = (double)(classwork1 + classwork2) / 2;
        double quizAverage = (double)(quiz1 + quiz2 + quiz3) / 3;
        System.out.println("Average Classwork Grade: " + classworkAverage);
        System.out.println("Average Quiz Grade: " + quizAverage);
        System.out.println("Test Grade: " + test);
        
        //Calculate and print final grade
        double finalGrade = (classworkAverage * .25) + (quizAverage * .35) + (test * .4);
        System.out.println("Your overall grade is: " + (int) finalGrade);
    }
}
