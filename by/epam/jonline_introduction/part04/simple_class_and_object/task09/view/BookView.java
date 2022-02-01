package by.epam.jonline_introduction.part04.simple_class_and_object.task09.view;

import java.util.List;

import by.epam.jonline_introduction.part04.simple_class_and_object.task09.entity.Book;

public class BookView {

	public void print(String message, List<Book> books) {

		System.out.println(message);

		for (Book book : books) {
			System.out.format("%04d%42s%24s%16s%8d%8d%8.2f%10s", book.getId(), book.getTitle(), book.getAuthor(),
					book.getPublisher(), book.getYear(), book.getNumberOfPages(), book.getPrice(), book.getCover());
			System.out.println();
		}
	}
}
