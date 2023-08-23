package LongestWordinFile;

import java.io.*;

public class LongestWordFile {
    public static void LongestWord() throws IOException {
        File file = new File("abc.txt");
        BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
        int lineCounter=0;
        String longestWord=" ";
        String string=bufferedReader.readLine();

        while (string!=null) {
            String[] array=string.split(" ");
            lineCounter++;
            for(int number=0;number<array.length;number++){
                if(longestWord.length()<array[number].length()){
                    longestWord=array[number];
//                    String word = longestWord;
                }
            }
            string=bufferedReader.readLine();
        }
//        System.out.println(lineCounter);
        System.out.println(longestWord);

        }

   }

