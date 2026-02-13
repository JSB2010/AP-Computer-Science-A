package Week9;
import java.util.Scanner;
public class salarySchedule {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your starting salary: ");
        double startingSalary = reader.nextDouble();

        System.out.print("Enter your annual raise percentage: ");
        double raisePercentage = reader.nextDouble();

        System.out.print("Enter the number of years you want to calculate: ");
        int years = reader.nextInt();

        System.out.println("Year\tSalary");
        for (int i = 1; i <= years; i++) {
            System.out.printf("%d\t$%.2f\n", i, startingSalary);
            if(i<10) {
                startingSalary += startingSalary * raisePercentage / 100;
            }
        }
    }
}
