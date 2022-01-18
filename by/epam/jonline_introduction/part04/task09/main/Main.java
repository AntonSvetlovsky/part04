/*
 * Создать класс Book, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод  toString().
 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Book:
 * id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

package by.epam.jonline_introduction.part04.task09.main;

import by.epam.jonline_introduction.part04.task09.entity.Library;
import by.epam.jonline_introduction.part04.task09.logic.BookLogic;
import by.epam.jonline_introduction.part04.task09.view.BookView;
import by.epam.jonline_introduction.part04.task09.entity.Book;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Library library = new Library();
		BookLogic logic = new BookLogic();
		BookView view = new BookView();

		library.addBook(new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", "Bloomsbury", 1997, 223,
				45.5, "hardcover"));
		library.addBook(new Book("Harry Potter and the Chamber of Secrets", "J. K. Rowling", "Bloomsbury", 1998, 251,
				47.2, "hardcover"));
		library.addBook(new Book("Leviathan Wakes", "James S. A. Corey", "Orbit Books", 2011, 577, 50, "hardcover"));
		library.addBook(new Book("Caliban's War", "James S. A. Corey", "Orbit Books", 2012, 605, 52, "hardcover"));
		library.addBook(new Book("Abaddon's Gate", "James S. A. Corey", "Orbit Books", 2013, 547, 52.5, "hardcover"));
		library.addBook(new Book("Sword of Destiny", "Andrzej Sapkowski", "SuperNowa", 1992, 384, 35, "softcover"));
		library.addBook(new Book("The Last Wish", "Andrzej Sapkowski", "SuperNowa", 1993, 288, 37.5, "softcover"));

		view.print("All books in library:", library.getBooks());

		List<Book> booksWithFixedAuthor;
		String author = "Andrzej Sapkowski";
		booksWithFixedAuthor = logic.findByAuthor(library.getBooks(), author);
		view.print("Books by " + author + ":", booksWithFixedAuthor);

		List<Book> booksWithFixedPublisher;
		String publisher = "Orbit Books";
		booksWithFixedPublisher = logic.findByPublisher(library.getBooks(), publisher);
		view.print("Books published by " + publisher + ":", booksWithFixedPublisher);

		List<Book> booksAfterFixedYear;
		int year = 1997;
		booksAfterFixedYear = logic.findAfterYear(library.getBooks(), year);
		view.print("Books published after " + year + ":", booksAfterFixedYear);
	}

}
