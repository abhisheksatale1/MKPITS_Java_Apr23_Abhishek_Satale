package CountTheWordsCharacterLines;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FindingWords {
    public void findingwords() throws IOException {
        String line;
        int count =0;
        FileReader file = new FileReader("abc.txt");
        BufferedReader br = new BufferedReader(file);
        while ((line=br.readLine())!=null){
            String words[]=line.split("");
            count=count+ words.length;
            System.out.println(count);


    }
    }
}
