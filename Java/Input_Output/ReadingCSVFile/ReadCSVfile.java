package ReadingCSVFile;

import java.io.*;

public class ReadCSVfile {
    public void readCSVfile() throws IOException {

        BufferedReader br= new BufferedReader(new FileReader("addresses.csv"));
       String str;
        str = br.readLine();

        while (str!=null){
            String arr[]=str.split(",");
            System.out.println(arr[0]+"\t"+arr[1]+"\t"+arr[2]+"\t"+arr[3]+"\t"+arr[4]+"\t");
            str=br.readLine();
//            System.out.println(str);
        }
    }
}
