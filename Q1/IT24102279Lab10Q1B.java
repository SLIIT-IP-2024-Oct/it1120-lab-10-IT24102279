import java.util.Scanner;

public class IT24102279Lab10Q1B {

    public static void validateMark(int mark) {
        assert mark >= 0 && mark <= 100 : "Invalid Mark";
    }

    public static char calculateGrade(int mark) {
        char grade;
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static void validateGrade() {
            assert calculateGrade(75) == 'A' : "Incorrect Grade Assigned for 75";
         
            assert calculateGrade(65) == 'B': "Incorrect Grade Assigned for 65";
        
            assert calculateGrade(55) == 'C' : "Incorrect Grade Assigned for 55";
        
            assert calculateGrade(45) == 'D' : "Incorrect Grade Assigned for 45";
        
            assert calculateGrade(20) == 'F' : "Incorrect Grade Assigned for 20";
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the mark (0-100): ");
        int mark = input.nextInt();
        validateMark(mark);
        System.out.println("Mark is Validated");
        char grade = calculateGrade(mark);
        validateGrade();
        System.out.println("The Grade for the Entered Mark is: " + grade);
    }
}
