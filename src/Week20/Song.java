package Week20;

public class Song {

  private String title;
  private String artist;
  private String genre;

  // Constructor to initialize the song object
  public Song(String title, String artist, String genre) {
    this.title = title;
    this.artist = artist;
    this.genre = genre;
  }

  // Getter methods to access song information
  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public String getGenre() {
    return genre;
  }

  // Override the toString method to display song information in a user-friendly format
  @Override
  public String toString() {
    return "Title: " + title + ", Artist: " + artist + ", Genre: " + genre;
  }
}
