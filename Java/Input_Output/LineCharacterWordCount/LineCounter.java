package LineCharacterWordCount;

import java.io.*;

public class LineCounter {
    public void lineCounter() throws IOException {

        File file = new File("abc.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        int lineCount = 0;
        int charCount = 0;
        int wordCount = 0;

        String line;
        while ((line = reader.readLine()) != null) {
            lineCount++;
            charCount += line.length();
            String[] words = line.split(" ");
            wordCount += words.length;
        }


        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
    }

}