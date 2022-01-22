package ns222tv_assign2;


	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Arrays;
	import java.util.stream.Stream;


	public class WarAndPeace {
	    public static void main(String[] args) {
	        String text = readText("C:\\Users\\nimas\\OneDrive\\Desktop\\WarAndPeace.txt");   // My own method
	        String[] words = text.toLowerCase().replaceAll("[^a-zA-Z\\s'-]", "").split(" ");  // Simple split, will be cleaned up later on
	        System.out.println("Initial word count: "+ words.length);
	        // We found 577091

	        Stream stream = Arrays.stream(words);
	        long numberOfDistinctWords = stream.distinct().count();
	        System.out.println("Total number of distinct word found: " + numberOfDistinctWords);
	    }

	    private static String readText(String filePath) {
	        File file = new File(filePath);

	        if (file.exists()) {
	            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
	                StringBuilder stringBuilder = new StringBuilder();
	                String line;

	                while ((line = reader.readLine()) != null) {
	                    stringBuilder.append(line);
	                }

	                reader.close();
	                return stringBuilder.toString();
	            }

	            catch (IOException e) {
	                e.printStackTrace();
	                return null;
	            }
	        }
	        else
	        {
	            System.err.println("Input file not found");
	            System.exit(0);
	            return null;
	        }
	    }
	}


