package count_words;

// Exercise 2
public class Word implements Comparable<Word> {

	public static void main(String[] args) {
		Word word = new Word("Herllo");
		Word word2 = new Word("HErLLO");
		boolean c = word.equals(word2);
		int a = word.compareTo(word2);
		
		
		if (a==0) {
			System.out.println("The two strings are equal");
			
		}
	}

	private String word;

	public Word(String str) {
		this.word = str;
	}

	public String toString() {
		return word;
	}

	@Override
	public int hashCode() {
		return word.toLowerCase().hashCode();
	}

	@Override
	public boolean equals(Object other) {
	// checking for reference
		if (this == other)
			return true;
		// it checks if the argument is of the
		// type Geek by comparing the classes
		// of the passed argument and this object
		if (other == null || getClass() != other.getClass())
			return false;

		if (word.compareToIgnoreCase(other.toString()) == 0)
			return true;

		return false;
	}

	public int compareTo(Word w) {
		
		if (hashCode() == w.hashCode() || equals(w))
			return 0;
		else 
			return word.compareTo(word);
	}
}
