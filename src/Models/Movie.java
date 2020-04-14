package Models;

public class Movie {

	private String title;
	private String gender;
	private String author;
	private int year;
	private boolean watched;
	
	public Movie(String title, String gender, String author, int year, boolean watched) {
		this.title = title;
		this.gender = gender;
		this.author = author;
		this.year = year;
		this.watched = watched;
	}
	
	public String toString() {
		return this.title + " - " + this.author + " " + this.year + " " + this.gender;
		
	}
	
	
}
