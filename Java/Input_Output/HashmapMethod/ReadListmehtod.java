package HashmapMethod;

import java.io.*;
import java.util.HashMap;

public class ReadListmehtod {
    public static void reads() throws IOException {
        BufferedWriter bufferedWriter=new BufferedWriter( new FileWriter("txt.txt"));
        HashMap hashMap=new HashMap();
        hashMap.put(1,"pranay");
        hashMap.put(2,"ashu");
        hashMap.put(3,"raja");
        bufferedWriter.write(String.valueOf(hashMap));
        bufferedWriter.close();

        BufferedReader bufferedReader=new BufferedReader(new FileReader("txt.txt"));

        System.out.println(  bufferedReader.readLine());

    }
}