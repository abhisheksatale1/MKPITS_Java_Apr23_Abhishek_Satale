package ReadWrite;

import java.io.*;

public class ReadWrite {
    public static void filecopy(String file1,String file2) throws FileNotFoundException,IOException {
        BufferedReader br=new BufferedReader(new FileReader(file1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
        String str=br.readLine();
        while (str!=null){
            bw.write(str);
            str=br.readLine();

        }
        bw.close();
        System.out.println("file copied......");
    }
}
