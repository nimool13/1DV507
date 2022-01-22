package count_words;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;



//Exercise 3
public class WordCount1Main {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\nimas\\OneDrive\\Desktop\\HistoryOfProgramming.txt");
		HashSet<Word> wordHashSet = new HashSet<Word>();
		TreeSet<Word> treeSet = new TreeSet<Word>(new WordComparator());

		if (file.exists()) {
			try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
				String line;

				while ((line = reader.readLine()) != null) {

					for (var w : line.split(" ")) {
						Word word = new Word(w);
						if (!wordHashSet.contains(word))
							wordHashSet.add(word);

						treeSet.add(word);
					}
				}

				reader.close();
				System.out.println("Done!");
			}

			catch (IOException e) {
				e.printStackTrace();
			}
		}

		else
			System.err.println("Input file not found");
	}
}
