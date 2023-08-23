package InputoutputExample;

import java.io.*;

public class TakingFileName {


    public static void main (String args[]){
        System.out.println("Enter the file name");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fname=br.readLine();
            File file = new File(fname);
            BufferedReader b = new BufferedReader(new FileReader(fname));
            String str = b.readLine();

            System.out.println(str);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
