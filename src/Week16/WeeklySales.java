package Week16;

import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. Daily sales for Monday–Friday as an array
        int[] sales = {100, 150, 200, 175, 125};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        // 2. Print Monday & Friday
        for (int i = 0; i < sales.length; i++) {
            System.out.println(days[i] + ": $" + sales[i]);
        }

        // 3. Correct Wednesday
        sales[2] = 99;
        System.out.println("Wednesday sales corrected to $" + sales[2]);

        // 4. User views a day's sales
        System.out.print("Enter a day (0-4): ");
        int day = in.nextInt();
        System.out.println(days[day] + ": $" + sales[day]);

        // 5. User updates a day's sales
        System.out.print("Enter a day (0-4): ");
        day = in.nextInt();
        System.out.print("Enter new sales: $");
        sales[day] = in.nextInt();
        System.out.println("Sales updated.");
        System.out.println(days[day] + ": $" + sales[day]);
    }
}
