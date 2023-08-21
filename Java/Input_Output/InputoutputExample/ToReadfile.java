package InputoutputExample;

import java.io.*;

public class ToReadfile {
    public static void main(String args[]){
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the file name");
            String fname=b.readLine();
            File file = new File(fname);
            if (file.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(fname));
                String str = br.readLine();
                while (str!= null) {
                    System.out.println(str);
                    str = br.readLine();
                }
            }
            else
                System.out.println("file does not exists");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
