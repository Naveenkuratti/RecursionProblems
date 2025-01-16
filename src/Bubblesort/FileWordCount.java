package Bubblesort;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWordCount {
	 public static void main(String[] args) {
	        String filePath = "sample.txt"; // Replace with your file path
	        int wordCount = 0;

	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] words = line.split("\\s+");
	                wordCount += words.length;
	            }
	            System.out.println("Total number of words: " + wordCount);
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	    }

}
