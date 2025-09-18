package Week2;

public class AboutMe {
    public static void main(String[] args){
        //Defining variables
        String name = "Jacob Barkin";
        int age = 15;
        int heightInches = 69;
        int favoriteNumber = 10;
        double freshmanGPA = 4.380;
        double sophomoreGPA = 4.48;

        //Calculations
        int heightFeet = heightInches / 12;
        int heightRemainingInches = heightInches % 12;

        int favoriteNumberTimesAge = favoriteNumber * age;
        double cumulativeGPA = (freshmanGPA + sophomoreGPA)/2;

        //Print statements
        System.out.println("Hi, my name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("I am " + heightFeet + " feet " + heightRemainingInches + " inches tall.");
        System.out.println("My favorite number is " + favoriteNumber + ".");
        System.out.println("If you multiply my favorite number by my age, you get " + favoriteNumberTimesAge + ".");
        System.out.println("My cumulative GPA is " + cumulativeGPA + ".");

    }
}
