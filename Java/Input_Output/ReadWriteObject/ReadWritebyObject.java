package ReadWriteObject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWritebyObject {
    public static void main(String args[]){
        try {
            BufferedWriter bbr= new BufferedWriter(new FileWriter("abc.txt"));//object output stream object input strea
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
