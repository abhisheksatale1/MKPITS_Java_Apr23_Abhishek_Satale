package InputoutputExample;

import java.io.*;

public class CreatingFileTread {
    public static void main(String args[]){
        BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));
        try {
            BufferedWriter bwd= new BufferedWriter(new FileWriter("abhi.txt"));
            System.out.println("Enter anything:");
            String nm = brf.readLine();
            for(int i=0;i<10;i++){
                bwd.write(nm+"\n");
                nm=brf.readLine();
            }
            bwd.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
