import java.util.Scanner;

public class IT24102279Lab10Q1A {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the mark
        System.out.print("Enter the mark: ");
        int mark = scanner.nextInt();

        // Assertion to check if the mark is within the valid range (0 to 100)
        assert (mark >= 0 && mark <= 100) : "Invalid Mark"; // This will throw AssertionError if mark is out of range

        // If assertion passes, print the validation message
        System.out.println("Mark is Validated");

    }
}
