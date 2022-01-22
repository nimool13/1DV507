package ns222tv_assign3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class PrintJavaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File directory = new File("C:\\Program Files (x86)\\eclipse-workspace\\1DV507");
		
		printAllJavaFiles(directory);
	}

	public static void printAllJavaFiles(File directory)
	{
		if (directory.isDirectory())
		{
	      File[] files = directory.listFiles();
	         for (File file : files) {
	    	 printAllJavaFiles(file);
	       }
		}
		
		else if (getFileExtension(directory).equals("java")) {
			try (BufferedReader reader = new BufferedReader(new FileReader(directory))) {
				long noOfLines = 0;
				while (reader.readLine() != null) {
					noOfLines++;
				}

				System.out.println(directory.getName() + " with " + noOfLines + " rows.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	   private static String getFileExtension(File file) {
	        String fileName = file.getName();
	        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
	        return fileName.substring(fileName.lastIndexOf(".")+1);
	        else return "";
	    }
}

