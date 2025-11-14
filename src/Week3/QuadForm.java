package Week3;

//Jacob Barkin
//September 23, 2025
/*This program, when it is working correctly, should prompt the user for a,b, and c
from a quadratic equation and use those values in the quadratic formula to find the
value(s) of the x intercept.
As it is right now, there are a number of errors...
-at least 3 syntax errors
-at least 1 run time error
-at least 1 logic error
You need to fix the errors in my code and explain what it was that I did
wrong...you can do the explanation through comments in the code...but you probably
want to copy into Eclipse or another IDE to help you.
*/
import java.util.Scanner;

public class QuadForm {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //Fixed: needed to import Scanner as the reader
        int a,b,c;
        double x1, x2;
        System.out.println("This is just a simple class to test your debugging skills :)"); //Fixed: was on 2 lines, now on one, also was printl instead of println
        System.out.println("and your knowledge of the quadratic formula! ");
        System.out.print("Enter the value of a: ");
        a = reader.nextInt();
        System.out.print("Enter the value of b: ");
        b = reader.nextInt();
        System.out.print("Enter the value of c: ");
        c = reader.nextInt();
        x1 = (-b + Math.sqrt(b*b-4*a*c)) / (2*a); //Fixed: was not the correct quadratic formula
        x2 = (-b - Math.sqrt(b*b-4*a*c)) / (2*a); //Fixed: was not the correct quadratic formula
        System.out.println("The value of x is " + x1 + " and "+  x2);
    }
}
//FYI - when the program is working correctly, entering a = 2, b = -6, and c = 3,
//should give x = 2.3660254037844384 and 0.6339745962155614