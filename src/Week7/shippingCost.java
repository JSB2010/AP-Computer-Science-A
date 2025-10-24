package Week7;

import java.util.Scanner;

public class shippingCost {
    public static void main(String[] args) {
        //Asking for user input
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the weight of the package in lbs: ");
        int weight = reader.nextInt();

        System.out.print("Enter the distance needed to be shipped. Enter 1 for local, 2 for regional, or 3 for national: ");
        int distance = reader.nextInt();

        System.out.print("Enter the fragility of the package. Enter \"standard\" or \"fragile\": ");
        String fragility = reader.next();

        System.out.print("Does your package need weekend delivery? Enter \"yes\" or \"no\": ");
        String weekend = reader.next();

        //Calculating cost
        double cost = 0.0;

        //Distance calculation
        double distanceCost = 0.0;
        if (distance == 1) {
            distanceCost += 5.00;
        } else if (distance == 2) {
            distanceCost += 10.00;
        } else if (distance == 3) {
            distanceCost += 15.00;
        }
        //Weekend calculation
        double weekendCost = 0.0;
        if (weekend.equals("yes")) {
            weekendCost = distanceCost * 0.1;
        }
        //Weight calculation
        double weightCost = 0.0;
        if (weight >= 5) {
            weightCost = 2.00;
        }
        //Fragility calculation
        double fragilityCost = 0.0;
        if (fragility.equals("fragile")) {
            fragilityCost = 3.00;
        }
        //Total cost
        if (distance == 1 && weight < 2 && fragility.equals("standard") && weekend.equals("no")) {
            System.out.println("Free shipping!");
            System.out.printf("Total Cost: $%.2f\n", 0.00);
        }
        else {
            System.out.println("--Shipping Cost Breakdown--");
            System.out.printf("Distance Cost: $%.2f\n", distanceCost);
            System.out.printf("Weekend Cost: $%.2f\n", weekendCost);
            System.out.printf("Weight Cost: $%.2f\n", weightCost);
            System.out.printf("Fragility Cost: $%.2f\n", fragilityCost);
            System.out.println("---------------------------");
            System.out.printf("Total Cost: $%.2f\n", (distanceCost + weekendCost + weightCost + fragilityCost));
        }
    }
}