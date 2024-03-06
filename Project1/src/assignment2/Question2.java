package assignment2;

import java.util.Objects;

class Book{
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
	
	
}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
