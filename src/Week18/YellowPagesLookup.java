package Week18;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class YellowPagesLookup {
    public static void main(String[] args) throws IOException {
        // Prepare arrays for 15 entries
        String[] names  = new String[15];
        String[] cats   = new String[15];
        String[] phones = new String[15];

        // TODO: Read "yellow_pages.txt" into names[], cats[], phones[]
        File pages = new File("src/Week18/yellow_pages-1.txt");
        Scanner input = new Scanner(pages);

        for(int i = 0; i < names.length; i++){
            names[i] = input.next();
            cats[i] = input.next();
            phones[i] = input.next();
        }
        // TODO: Print the full directory table
        System.out.printf("%-15s %-15s %-12s%n", "Name", "Category", "Phone");
        System.out.printf("%-15s %-15s %-12s%n", "---------------", "---------------", "------------");

        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-15s %-15s %-12s%n", names[i], cats[i], phones[i]);
        }

        // Interactive lookup
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.print("Enter 'C' (category), 'N' (name), or 'exit': ");
            String choice = console.nextLine().trim();
            if (choice.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            } else if (choice.equalsIgnoreCase("C")) {
                System.out.print("Enter category: ");
                String category = console.nextLine().trim();
                listByCategory(names, cats, phones, category);
            } else if (choice.equalsIgnoreCase("N")) {
                System.out.print("Enter business name: ");
                String name = console.nextLine().trim();
                String phone = findPhone(names, phones, name);
                System.out.println(phone);
            } else {
                System.out.println("Invalid option.");
            }
            System.out.println();
        }
        console.close();
    }

    /**
     * Print all businesses in the given category.
     */
    public static void listByCategory(String[] names, String[] cats,
                                      String[] phones, String category) {
        // TODO: implement category lookup
        boolean found = false;
    	for (int i = 0; i < cats.length; i++){
            if(cats[i].equals(category)){
                found = true;
                System.out.println("Name: " + names[i] + " Phone: " + phones[i]);
            }
        }
        if (!found) {
            System.out.println("No businesses found...");
        }
    }

    /**
     * Return the phone number for the given business name, or "Not found".
     */
    public static String findPhone(String[] names, String[] phones, String name) {
        // TODO: implement name lookup
        boolean foundPhone = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return phones[i];
            }
        }
        return "Not found";
    }
}