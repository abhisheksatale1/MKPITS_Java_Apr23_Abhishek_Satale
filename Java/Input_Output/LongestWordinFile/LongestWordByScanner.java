package LongestWordinFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWordByScanner {
    static void longestwordfromfile () throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the file name");
        Scanner scanner = new Scanner(new File(String.valueOf(sc)));
         String longestWord="";
        while (scanner.hasNext()){    //hasNext is used for next word  and .next is to for print check true or false
            String word=scanner.next();

//            System.out.println(scanner.next());
            if(word.length()>longestWord.length()){
                longestWord=word;
            }
        }
        System.out.println(longestWord);
    }
}
