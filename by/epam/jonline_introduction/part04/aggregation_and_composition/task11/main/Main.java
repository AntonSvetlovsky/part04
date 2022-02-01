/*
 * Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

package by.epam.jonline_introduction.part04.aggregation_and_composition.task11.main;

import by.epam.jonline_introduction.part04.aggregation_and_composition.task11.entity.Sentence;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task11.entity.Text;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task11.entity.Word;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task11.view.TextView;

public class Main {

	public static void main(String[] args) {

		Text text = new Text();
		TextView view = new TextView();

		Sentence sentence1 = new Sentence(new Word("This"), new Word("is"), new Word("the"), new Word("sentence"),
				new Word("number"), new Word("one."));
		Sentence sentence2 = new Sentence(new Word("This"), new Word("is"), new Word("the"), new Word("sentence"),
				new Word("number"), new Word("two"));
		Sentence sentence3 = new Sentence(new Word("this"), new Word("is"), new Word("the"), new Word("sentence"),
				new Word("number"), new Word("three."));

		text.setTitle("Three sentences");
		text.addSentences(sentence1, sentence2, sentence3);

		view.printTitle(text);
		view.printText(text);
	}

}
