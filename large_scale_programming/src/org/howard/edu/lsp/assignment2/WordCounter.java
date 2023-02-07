package org.howard.edu.lsp.assignment2;
import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.io.FileNotFoundException;

public class WordCounter{
	public static void main(String[] args) {
		Scanner wordFile = null;
		try {
			wordFile = new Scanner(new File("/Users/admin/git/LSP_Lilly/large_scale_programming/src/main/java/resources/words.txt"));
			
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open resource");
		}
		HashMap<String, Integer> wordCounter = new HashMap<>();


	
        // Loop through each line of the file
        while (wordFile.hasNextLine()) 
        {
            // Read the line and split it into words
            String lineInFile = wordFile.nextLine();
            String[] wordsInLine = lineInFile.split("\\s+");
            for (String word : wordsInLine) {
                if (isANumber(word) == true) {
                    continue;
                }
                if (word.length() <= 3) {
                    continue;
                }
                word = word.toLowerCase(); //makes word lowercase
                word = word.replaceAll("[^a-zA-Z0-9']", ""); 
                wordCounter.put(word, wordCounter.getOrDefault(word, 0) + 1);
          
				}
            }

        for (String word : wordCounter.keySet()) {
            System.out.println(word + ":" + wordCounter.get(word));
        }
    }

	
	//Function to determine whether string is a number or not
    private static boolean isANumber(String strNum) {
    	if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
}
    }
