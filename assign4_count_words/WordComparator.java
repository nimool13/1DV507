package count_words;
import java.util.Comparator;

//Exercise 3
class WordComparator implements Comparator<Word>{
	 
    @Override
    public int compare(Word w1, Word w2) {
        return w1.compareTo(w2);
    }
}
