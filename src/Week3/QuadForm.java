package Week3;//Ms. Asplund
//September 16, 2024
/*This program, when it is working correctly, should prompt the user for a,b, and c from a quadratic equation and use those values in the quadratic formula to find the value(s) of the x intercept.

    As it is right now, there are a number of errors...
    -at least 3 syntax errors
    -at least 1 run time error
    -at least 1 logic error

You need to fix the errors in my code and explain what it was that I did wrong...you can do the explanation through comments in the code...but you probably want to copy into Eclipse or another IDE to help you.
*/
import java.util.Scanner;

public class QuadForm
{
    public static void main(String [] args){ // FIXED: Main should be lowercase 'main'
        // FIXED: Added Scanner object declaration - this was the missing 'reader'
        Scanner reader = new Scanner(System.in);

        double a,b,c; // FIXED: Changed to double to handle decimal inputs properly
        double x1, x2;

        System.out.println("This is just a simple class to test your debugging skills :)");
        System.out.println("and your knowledge of the quadratic formula! ");
        System.out.print("Enter the value of a: ");
        a = reader.nextDouble();
        System.out.print("Enter the value of b: ");
        b = reader.nextDouble(); // FIXED: Changed to nextDouble() for consistency
        System.out.print("Enter the value of c: "); // FIXED: Changed println to print for consistency
        c = reader.nextDouble(); // FIXED: Changed to nextDouble() for consistency

        // Calculate the discriminant to check if real solutions exist
        double discriminant = b*b - 4*a*c;

        if (discriminant < 0) {
            System.out.println("No real solutions exist (discriminant is negative: " + discriminant + ")");
        } else if (discriminant == 0) {
            // One solution (repeated root)
            x1 = -b / (2*a);
            System.out.println("One solution: x = " + x1);
        } else {
            // Two real solutions
            x1 = (-b + Math.sqrt(discriminant)) / (2*a);
            x2 = (-b - Math.sqrt(discriminant)) / (2*a);
            System.out.println("The value of x is " + x1 + " and " + x2);
        }

        reader.close(); // FIXED: Added to close the Scanner resource
    }
}
//FYI - when the program is working correctly, entering a = 2, b = -6, and c = 3,
//should give x = 2.3660254037844384 and 0.6339745962155614