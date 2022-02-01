package by.epam.jonline_introduction.part04.aggregation_and_composition.task11.view;

import by.epam.jonline_introduction.part04.aggregation_and_composition.task11.entity.Sentence;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task11.entity.Text;
import by.epam.jonline_introduction.part04.aggregation_and_composition.task11.entity.Word;

public class TextView {

	public void printTitle(Text text) {
		String title = text.getTitle();
		title = title.toUpperCase();
		System.out.println(title + "\n");
	}

	public void printText(Text text) {

		for (Sentence sentence : text.getText()) {
			for (Word word : sentence.getSentence()) {
				System.out.print(word.getWord());
			}
		}

		System.out.println();
	}
}
