package INPUTOUTPUT;

import java.io.*;

public class SquareByBufferedReaderExample {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
           String s = bufferedReader.readLine();
        System.out.println(s);
      File d = new File("abc.txt");
        System.out.println(d.exists());

      String[]files=  d.list();
      for (String fn:files){
          System.out.println(fn);
      }
    }

}
