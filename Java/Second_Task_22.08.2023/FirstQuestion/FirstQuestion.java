package FirstQuestion;

import java.io.*;
import java.util.SortedMap;

public class FirstQuestion {

        public void Towrite () throws IOException {
            BufferedWriter bw = new BufferedWriter(new FileWriter("ABC.txt"));
            bw.write("abhishek");
            System.out.println("done");
            bw.close();



        }

        public void Toread () {
            try {
                BufferedReader Br = new BufferedReader(new FileReader("abc.txt"));
                try {
                    Br.readLine();
                    String str1 = Br.readLine();
                    System.out.println(str1);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
