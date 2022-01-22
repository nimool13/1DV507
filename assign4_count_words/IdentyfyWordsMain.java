package count_words;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

// Exercise 1
public class IdentyfyWordsMain {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\nimas\\OneDrive\\Desktop\\HistoryOfProgramming.txt");

		if (file.exists()) {
			try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
				StringBuilder stringBuilder = new StringBuilder();
				String line;

				while ((line = reader.readLine()) != null) {

                    //https://stackoverflow.com/questions/11796985/java-regular-expression-to-remove-all-non-alphanumeric-characters-except-spaces
					line = line.replaceAll("[^a-zA-Z\\s]", "");;
					stringBuilder.append(line + "\n");
				}			
				
				File outputFile = new File("C:\\Users\\nimas\\OneDrive\\Desktop\\eclipse-workspace\\1DV507\\src\\count_words\\words.txt");
				try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
					writer.write(stringBuilder.toString());
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
