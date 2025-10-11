package Week5;

public class BalloonTester {
    public static void main(String[] args) {
        //Step 1 and 2: Create two balloons
        Balloon balloon1 = new Balloon("Jacob", 100);
        Balloon balloon2 = new Balloon("Eli",-50);

        //Step 3: Print out the names and altitudes of the balloons
        System.out.println("The first balloon's name is " + balloon1.getName() + " and its altitude is " + balloon1.getAltitude() + ".");
        System.out.println("The second balloon's name is " + balloon2.getName() + " and its altitude is " + balloon2.getAltitude() + ".\n");

        //Step 4 and 5: Call the methods to change the altitudes of the balloons
        balloon1.ascendTo(250);
        balloon2.adjustAltitude(350);

        //Step 6: Print out the names and altitudes of the balloons again
        System.out.println("The first balloon's name is " + balloon1.getName() + " and its altitude is " + balloon1.getAltitude() + ".");
        System.out.println("The second balloon's name is " + balloon2.getName() + " and its altitude is " + balloon2.getAltitude() + ".\n");

        //Step 7 and 8: Call the methods to change the altitudes of the balloons again
        balloon2.adjustAltitude(-150);
        balloon1.descendTo(balloon1.getAltitude());

        //Step 9: Print out the names and altitudes of the balloons again
        System.out.println("The first balloon's name is " + balloon1.getName() + " and its altitude is " + balloon1.getAltitude() + ".");
        System.out.println("The second balloon's name is " + balloon2.getName() + " and its altitude is " + balloon2.getAltitude() + ".\n");

        //Step 10 and 11: Call the methods to change the altitudes of the balloons again
        balloon1.ascendTo(balloon1.getAltitude()*3);
        balloon2.descendTo(balloon2.getAltitude()-300);

        //Step 12: Print out the names and altitudes of the balloons again
        System.out.println("The first balloon's name is " + balloon1.getName() + " and its altitude is " + balloon1.getAltitude() + ".");
        System.out.println("The second balloon's name is " + balloon2.getName() + " and its altitude is " + balloon2.getAltitude() + ".");

    }
}
