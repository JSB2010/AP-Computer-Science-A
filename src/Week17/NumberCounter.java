package Week17;
import java.util.Scanner;
public class NumberCounter {

    public static void main(String[] args) {
        //Creating scanner
        Scanner reader = new Scanner(System.in);

        //Array initialization
        int[] numbers = new int[20];
        System.out.println("Enter 20 numbers, all between 1 and 50;");

        //Asking for 20 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = reader.nextInt();
        }
        //Looping through numbers in sets of 5 to 50
        for(int j = 1; j <= 50; j+=5){
            int count = 0;
            //Looping through all numbers in the list, check if are in specific range
            for (int number : numbers) {
                if (number >= j && number <= j + 4) {
                    count++;
                }
            }
            //Printing lists with stars
            System.out.print(+j+"-"+(j+4)+" | ");
            for(int m = 0; m < count; m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
