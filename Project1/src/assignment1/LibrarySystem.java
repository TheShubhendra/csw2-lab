package assignment1;

abstract class LibraryResource{
	private String title;
	private String author;
	public LibraryResource(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	abstract public void displayDetails();
	
}

class Book extends LibraryResource{
	private int pageCount;

	public Book(String title, String author, int pageCount) {
		super(title, author);
		this.setPageCount(pageCount);
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	
	
	@Override
	public void displayDetails() {
		System.out.println("Title: "+ this.getTitle() + " Author: "+ this.getAuthor() + " Page Count: "+ this.pageCount);
	}
}


class Magazine extends LibraryResource{
	private String issueDate;

	public Magazine(String title, String author, String issueDate) {
		super(title, author);
		this.issueDate = issueDate;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Title: "+ this.getTitle() + " Author: "+ this.getAuthor() + " Issue date: "+ this.issueDate);
	}
}

class DVD extends LibraryResource{
	private int duration;

	public DVD(String title, String author, int duration) {
		super(title, author);
		this.setDuration(duration);
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Title: "+ this.getTitle() + " Author: "+ this.getAuthor() + " Duration: "+ this.duration);
	}
}

public class LibrarySystem {

	public static void main(String[] args) {
		Book b = new Book("Java", "Mayur Ramgiri", 700);
		Magazine m = new 		Magazine("Magzine", "Carl Sagan", "12-March-2024");
		DVD d = new DVD("rap song", "yo yo HONEY SING", 2343);
		
		b.displayDetails();
		m.displayDetails();
		d.displayDetails();
	}

}
