//http://robertovormittag.net/how-to-implement-a-simple-hashset-in-java/

package count_words;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;



//Exercise 4
public class HashWordSet implements IWordSet {

	private Word[] buckets;
	private int size;

	public HashWordSet(int capacity) {

		buckets = new Word[capacity];
		size = 0;
	}

	private int hashFunction(int hashCode) {

		int index = hashCode;
		if (index < 0) {
			index = -index;
		}
		return index % buckets.length;
	}

	@Override
	public void add(Word word) {
		// TODO Auto-generated method stub

		if (size >= buckets.length)
			reHash();

		int index = hashFunction(word.hashCode());
		if (!contains(word)) {
			buckets[index] = word;
			size++;
		}
	}

	@Override
	public boolean contains(Word word) {

		int index = hashFunction(word.hashCode());
		Word current = buckets[index];

//		if (current != null && current.equals(word)) {
		if (current != null && current.hashCode() == word.hashCode()) {
			return true;
		}

		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Iterator<Word> iterator() {
		return null;
	}

	public void reHash() {
		Word[] copy = new Word[buckets.length * 2];
		System.arraycopy(buckets, 0, copy, 0, buckets.length);
		buckets = copy;
	}

	@Override
	public String toString() {
		String contents = "";
		for (Word word : buckets){
		contents+= " "+ word.toString();
	}
	return contents;
}

}
