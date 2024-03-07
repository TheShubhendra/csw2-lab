package assignment2;

import java.util.Objects;

class Book implements Comparable<Book>{
	private int bookId;
	private String bookName;
	private float price;
	
	
	public Book(int bookId, String bookName, float price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}


	@Override
	public int hashCode() {
		return Objects.hash(bookId, bookName, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return bookId == other.bookId && Objects.equals(bookName, other.bookName)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + "]";
	}


	@Override
	public int compareTo(Book o) {
		return this.equals(o)?0:this.price>o.price?1:-1;
	}
	
	
}

public class Question2 {

	public static void main(String[] args) {
		Book b1 = new Book(1, "Harry Potter and the Order of the Phoenix", 1322.50f);
		Book b2 = new Book(12, "CEH v11 Certified Ethical Hacker Study Guide", 100000f);
		System.out.println((b1.compareTo(b2) > 0 ?b1:b2 ) + " is more costly");

	}

}
