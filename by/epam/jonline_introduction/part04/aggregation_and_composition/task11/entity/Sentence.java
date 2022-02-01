package by.epam.jonline_introduction.part04.aggregation_and_composition.task11.entity;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

	private List<Word> words;

	{
		words = new ArrayList<Word>();
	}

	public Sentence() {

	}

	public Sentence(Word... word) {
		Word space = new Word(" ");
		for (int i = 0; i < word.length; i++) {
			words.add(word[i]);
			words.add(space);
		}
	}

	public List<Word> getSentence() {
		return words;
	}

	public void addWordsToSentence(Word... word) {
		Word space = new Word(" ");
		for (int i = 0; i < word.length; i++) {
			words.add(word[i]);
			words.add(space);
		}
	}

	public void formatSentence() {
		Word lastWord = words.get(words.size() - 2);
		Word firstWord = words.get(0);
		String last = lastWord.getWord();
		String first = firstWord.getWord();
		char lastSymbol = last.charAt(last.length() - 1);
		char firstSymbol = first.charAt(0);
		char newFirstSymbol;

		if (lastSymbol != '.' && lastSymbol != '!' && lastSymbol != '?') {

			words.get(words.size() - 2).setWord(last + ".");
		}

		if ((int) firstSymbol > 96 && (int) firstSymbol < 123) {
			newFirstSymbol = (char) ((int) firstSymbol - 32);
			first = first.replaceFirst("[a-z]", String.valueOf(newFirstSymbol));
			words.get(0).setWord(first);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((words == null) ? 0 : words.hashCode());
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
		Sentence other = (Sentence) obj;
		if (words == null) {
			if (other.words != null) {
				return false;
			}
		} else if (!words.equals(other.words)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Sentence [sentence=" + words + "]";
	}

}
