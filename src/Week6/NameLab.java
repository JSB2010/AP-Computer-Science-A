package Week6;

public class NameLab{
     public static void main(String[] args) {
        // Test with different names
        String fullName1 = "Sofia Hernandez";
        String fullName2 = "Alex Kim";

        // Test fullName() method
        System.out.println("Full name 1: " + fullName(fullName1));
        System.out.println("Full name 2: " + fullName(fullName2));

        // Test getFirstName() method
        System.out.println("First name 1: " + getFirstName(fullName1));
        System.out.println("First name 2: " + getFirstName(fullName2));

        // Test getLastName() method
        System.out.println("Last name 1: " + getLastName(fullName1));
        System.out.println("Last name 2: " + getLastName(fullName2));

        // Test fullNameLength() method
        System.out.println("Full name 1 length: " + fullNameLength(fullName1));
        System.out.println("Full name 2 length: " + fullNameLength(fullName2));

        // Test formatFullName() method
        System.out.println("Formatted name 1: " + formatFullName(fullName1));
        System.out.println("Formatted name 2: " + formatFullName(fullName2));
    }
    
    // Returns the full name as it is
    public static String fullName(String name) {
        // return the name directly
        return name;
    }
    // Returns the first name (everything before the first space)
    public static String getFirstName(String name) {
        // TODO: Find the space index and return the first part of the name
        int spaceIndex = name.indexOf(" ");
        String firstName = name.substring(0, spaceIndex);
        return firstName;
    }
    // Returns the last name (everything after the first space)
    public static String getLastName(String name) {
        // TODO: Find the space index and return the last part of the name
        int spaceIndex = name.indexOf(" ");
        String lastName = name.substring(spaceIndex + 1);
        return lastName;
    }
    // Returns the length of the full name (including spaces)
    public static int fullNameLength(String name) {
        // TODO: Return the length of the string
        int length = name.length();
        return length;
    }
    // Returns the full name in the format "LastName, FirstName"
    public static String formatFullName(String name) {
        // TODO: Split into first and last name, then return "last, first"
        String firstName = getFirstName(name);
        String lastName = getLastName(name);
        String formattedName = lastName + ", " + firstName;
        return formattedName;
    }

}