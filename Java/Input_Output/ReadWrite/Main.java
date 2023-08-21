package ReadWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]arg){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter the file name :");
            String st=br.readLine();
            File fl=new File(st);
            if(fl.exists()){
                System.out.println("enter target");
                String fn2=br.readLine();
                ReadWrite.filecopy(st,fn2);
            }

//            BufferedReader bt=new BufferedReader(new FileReader(st));
//            String bt1=bt.readLine();
//            get_Data gt=new get_Data();
//            gt.filecopy(bt1);
//            System.out.println(bt1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}