package ReadWriteByObject;

import java.io.*;

public class FileOutputStreamExample {

    public static void writeobjectTofile (ReadWriteObject ReadWriteObject ) throws IOException {
        ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream("abx.txt"));
        object.writeObject(object);
        object.close();

    }

    public static void ReadobjectTofile() throws IOException{
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("abx.txt"));
        try {
            ReadWriteObject s = (ReadWriteObject) obj.readObject();
            System.out.println(s);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
