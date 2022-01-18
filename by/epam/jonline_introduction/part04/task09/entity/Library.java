package by.epam.jonline_introduction.part04.task09.entity;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> books;
	private static int idCounter = 0;

	{
		books = new ArrayList<Book>();
	}

	public Library() {

	}

	public Library(List<Book> books) {
		this.books = books;
	}

	public void addBook(Book book) {
		book.setId(++idCounter);
		books.add(book);
	}

	public void removeBook(Book book) {
		books.remove(book);
	}

	public void removeBook(int i) {
		books.remove(i);
	}

	public List<Book> getBooks() {
		return books;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Library other = (Library) obj;
		if (books == null) {
			if (other.books != null) {
				return false;
			}
		} else if (!books.equals(other.books)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Library [books=" + books + "]";
	}

}
