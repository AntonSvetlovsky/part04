package by.epam.jonline_introduction.part04.aggregation_and_composition.task11.entity;

import java.util.ArrayList;
import java.util.List;

public class Text {

	private String title;
	private List<Sentence> sentences;

	{
		sentences = new ArrayList<Sentence>();
		title = new String();
	}

	public Text() {

	}

	public Text(String title, List<Sentence> text) {
		this.title = title;
		this.sentences = text;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Sentence> getText() {
		return sentences;
	}

	public void setText(List<Sentence> text) {
		this.sentences = text;
	}

	public void addSentences(Sentence... sentence) {
		for (int i = 0; i < sentence.length; i++) {
			sentence[i].formatSentence();
			sentences.add(sentence[i]);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentences == null) ? 0 : sentences.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Text other = (Text) obj;
		if (sentences == null) {
			if (other.sentences != null) {
				return false;
			}
		} else if (!sentences.equals(other.sentences)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Text [title=" + title + ", text=" + sentences + "]";
	}

}
