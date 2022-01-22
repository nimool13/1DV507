package count_words;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class WordCount2Main {

	public static void main(String[] args) {

		HashWordSet hws = new HashWordSet(1000);
	    TreeWordSet tws = new TreeWordSet();	
		File file = new File("C:\\Users\\nimas\\OneDrive\\Desktop\\HistoryOfProgramming.txt");

		if (file.exists()) {
			try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
				String line;

				while ((line = reader.readLine()) != null) {

					for (var w : line.trim().split(" ")) {
						Word word = new Word(w);
						
						if (!hws.contains(word))
							hws.add(word);
						
						if (!tws.contains(word))
							tws.add(word);
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
