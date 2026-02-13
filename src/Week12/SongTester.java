package Week12;

public class SongTester {
    public static void main(String[] args) {
        // Create a new Song object
        Song song1 = new Song("Bohemian Rhapsody", "Queen", 354);

        // Test getter methods
        System.out.println("Title: " + song1.getTitle());
        System.out.println("Artist: " + song1.getArtist());
        System.out.println("Duration: " + song1.getDuration() + " seconds");

        // Test toString method
        System.out.println(song1);
        
        // Test setter methods
        song1.setTitle("Another One Bites the Dust");
        song1.setArtist("Queen");
        song1.setDuration(215);

        
        System.out.println(song1);

        // Create another Song object
        Song song2 = new Song("Smells Like Teen Spirit", "Nirvana", 301);

        // Test toString method
        System.out.println(song2);
    }
}