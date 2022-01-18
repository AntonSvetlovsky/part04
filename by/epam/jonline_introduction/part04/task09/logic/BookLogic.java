package by.epam.jonline_introduction.part04.task09.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.jonline_introduction.part04.task09.entity.Book;

public class BookLogic {

	public List<Book> findByAuthor(List<Book> books, String author) {

		List<Book> booksByAuthor = new ArrayList<Book>();

		for (Book book : books) {
			if (book.getAuthor().equals(author)) {
				booksByAuthor.add(book);
			}
		}

		return booksByAuthor;
	}

	public List<Book> findByPublisher(List<Book> books, String publisher) {

		List<Book> booksByPublisher = new ArrayList<Book>();

		for (Book book : books) {
			if (book.getPublisher().equals(publisher)) {
				booksByPublisher.add(book);
			}
		}

		return booksByPublisher;
	}

	public List<Book> findAfterYear(List<Book> books, int year) {

		List<Book> booksAfterYear = new ArrayList<Book>();

		for (Book book : books) {
			if (book.getYear() > year) {
				booksAfterYear.add(book);
			}
		}

		return booksAfterYear;
	}
}
