package CountTheWordsCharacterLines;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintLines {

    public void printline() throws IOException {
        int line=0;
        int counter=0;
        char word;
        FileReader file = new FileReader(String.valueOf(new FileReader("abc.txt")));
        BufferedReader br = new BufferedReader(file);
       String w= br.readLine();
        while(br!=null){
            line++;
            w=br.readLine();

        }
        System.out.println(line);
    }
}