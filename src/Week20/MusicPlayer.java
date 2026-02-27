package Week20;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {
	public static Song addSong(){
		//Asks user for new song that want to add
		Scanner input = new Scanner (System.in);
		System.out.print("Enter title: ");
		String title = input.nextLine();
		System.out.print("Enter artist: ");
		String artist = input.nextLine();
		System.out.print("Enter album: ");
		String album = input.nextLine();

		//creates song
        return new Song(title,artist,album);
	}
	public static int findSong(ArrayList<Song> songs){
		Scanner input = new Scanner (System.in);
		//Asks user for what song they are looking for
		System.out.print("Enter title: ");
		String title = input.nextLine();

		//Looks for song in arrayList, returns index if it exists, -1 if not
		for (int i = 0; i < songs.size(); i++){
			if(songs.get(i).getTitle().equals(title)){
				return i;
			}
		}
		return -1;
	}
	public static void playSongs(ArrayList<Song> songs){
		int song = 0;
		Scanner input = new Scanner (System.in);
		System.out.println("To go to the next track, enter \">\", to go back a track, enter \"<\", and to exit, enter \"exit\".");
		//Music player loop, checking for user input
		while(true) {
			System.out.println("Now playing: " + songs.get(song).toString());
			String selection = input.nextLine();
			if (selection.equals("exit")) {
				break;
			}
			else if (selection.equals(">")) {
				if(song+1 >= songs.size()) {
					song = 0;
				}
				else {
					song++;
				}
			}
			else if (selection.equals("<")) {
				if(song-1 == -1){
					song = songs.size()-1;
				}
				else {
					song--;
				}
			}
			else{
				System.out.println("Invalid selection. Please try again.");
			}
		}
	}

 public static void main(String[] args) 
	{ 
		// Create 5 Song objects 
		Song song1 = new Song("Bohemian Rhapsody", "Queen", "Rock"); 
		Song song2 = new Song("Imagine", "John Lennon", "Pop"); 
		Song song3 = new Song("Hey Jude", "The Beatles", "Rock"); 
		Song song4 = new Song("Like a Rolling Stone", "Bob Dylan", "Rock"); 
		Song song5 = new Song("Hallelujah", "Leonard Cohen", "Folk"); 

		//CREATE ARRAYLIST TO STORE SONGS

		ArrayList<Song> songs = new ArrayList<Song>();
		//ADD THE 5 SONGS TO THE ARRAYLIST

		songs.add(song1);
		songs.add(song2);
		songs.add(song3);
		songs.add(song4);
		songs.add(song5);
		
		System.out.println("Welcome to the MusicPlayer");
		
		//CREATE A LIST OF OPTIONS FOR THE USER 
		//SHOULD BE IN A LOOP SO THAT THEY CAN CONTINUE UNTIL
		//THEY WANT TO EXIT
		
		//1. ADD SONG
		//2. REMOVE SONG
		//3. PLAY SONGS
		//4. EXIT
		
		//YOU'LL WRITE THE CODE THAT DOES 
		//EACH OF THE 4 THINGS IN THE LIST
		//CREATE AT LEAST 3 FUNCTIONS TO DO THIS

		Scanner input = new Scanner(System.in);
		//user input loop, asks what operation
		while(true){
			System.out.println("What operation would you like to do?");
			System.out.println("1: Add Song | 2: Remove Song | 3: Play Songs | 4: Exit");
			System.out.print("Please enter a number: ");
			String choice = input.nextLine();
			if(choice.equals("1")){
				songs.add(addSong());
				System.out.println("Song added.");
			}
			else if(choice.equals("2")){
				int index = findSong(songs);
				//Checks if song exists, removes if it does
				if (index != -1){
					songs.remove(index);
					System.out.println("Song removed.");
				}
				else{
					System.out.println("Sorry, that song does not exist.");
				}
			}
			else if(choice.equals("3")){
				playSongs(songs);
			}
			else if(choice.equals("4")){
				break;
			}
			else{
				System.out.println("Invalid selection. Please try again.");
			}
		}
	}
}
