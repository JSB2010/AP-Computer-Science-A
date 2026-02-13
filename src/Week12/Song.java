package Week12;

public class Song {
    //Write private instance variables for song's title, artist, and duration in seconds.
    private String title;
    private String artist;
    private int duration;
    
    //Write a constructor that takes the title, artist, and duration as parameters and initializes the corresponding instance variables.
    public Song(String name, String singer, int time) {
        title = name;
        artist = singer;
        duration = time;

    }
    //Write getter methods for all of the private instnace variables. Note make sure the names of the methods match what is used in the tester class.
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int getDuration() {
        return duration;
    }
    
    //Write setter methods for all of the private instnace variables. Note make sure the names of the methods match what is used in the tester class.
    public void setTitle(String name) {
        title = name;
    }
    public void setArtist(String singer) {
        artist = singer;
    }
    public void setDuration(int time) {
        duration = time;
    }
    
    //Overide the toString method to display the all information about the song, you can format it any way you want.
    public String toString() {
        return "Title: " + title + "\nArtist: " + artist + "\nDuration: " + duration + " seconds";
    }
    
}