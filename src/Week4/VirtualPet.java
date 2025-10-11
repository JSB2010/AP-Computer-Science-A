package Week4;
import java.util.Scanner;
public class VirtualPet {
    //Introduce pet
    public static void introducePet(String name) {
        System.out.println("Hello, my pet's name is " + name + ".");
    }

    //Feed pet
    public static int feedPet(int currentHunger){
        currentHunger -= 1;
        return currentHunger;
    }

    //Play with pet
    public static int playWithPet(int currentHappiness){
        currentHappiness += (int)(Math.random()*3)+1;
        return currentHappiness;
    }

    //Show pet stats
    public static void showStats(String name, int hunger, int happiness){
        System.out.println("Stats for " + name + ":");
        System.out.println("Hunger: " + hunger);
        System.out.println("Happiness: " + happiness);
    }

    public static void main(String[] args) {
        //Asking for user input for pet name and stats
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your pet's name: ");
        String petName = reader.nextLine();
        System.out.print("Enter your pet's hunger (0-10): ");
        int hunger = reader.nextInt();
        System.out.print("Enter your pet's happiness (0-10): ");
        int happiness = reader.nextInt();

        //Calling functions
        introducePet(petName);
        showStats(petName, hunger, happiness);
        System.out.println("Feeding pet...");
        hunger = feedPet(hunger);
        System.out.println("Playing with pet...");
        happiness = playWithPet(happiness);

        //Printing final stats
        System.out.println("Hunger after feeding: "+ hunger);
        System.out.println("After playing with pet: "+happiness);

    }
}