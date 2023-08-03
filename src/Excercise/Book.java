package Excercise;

public final class Book{
	
	public final String title;
	public final String author;
	public final int publicationYear;
	
	public Book(String title, String author, int publicationYear) {
		this.title=title;
		this.author=author;
		this.publicationYear=publicationYear;
	}
	public String gettitle() {
		return title;
	}
	public String getauthor() {
		return author;
	}
	public int getpublicationYear() { 
		return publicationYear;
	}
} 

