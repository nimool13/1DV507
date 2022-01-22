package count_words;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeWordSet implements IWordSet{
	
	BinarySearchTree tree = new BinarySearchTree();
	    boolean rootAdded = false;
    int size = 0;

	@Override
	public Iterator<Word> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Word word) {
		if (!rootAdded) {
			tree.insert(word);
			rootAdded = true;
			size++;
		} else
		{
			tree.insert(word);
			size++;
		}
	}

	@Override
	public boolean contains(Word word) {	
		return tree.Contains(tree.root, word);
	}

	@Override
	public int size() {
		return size;
	}


}
