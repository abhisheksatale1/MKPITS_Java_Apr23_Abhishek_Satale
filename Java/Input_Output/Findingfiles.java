import  java.io.File;
import java.io.IOException;

public class Findingfiles {
    public static void main(String []args){
        File f = new File("c:\\user","abc.txt");
        System.out.println(f.exists());
        System.out.println(f.getAbsoluteFile());
        File d = new File("D:\\JAVA","Byte.java");
        System.out.println(d.exists());
        File fd = new File("D:\\JAVA");
        String []files=fd.list();
        for(String fn:files){
            System.out.println(fn);
        }
        File fz= new File("xyz.txt");
        File fr = new File("abc.txt");
        System.out.println(fz.compareTo(fr));

        System.out.println(fz.delete());
        try {
            System.out.println(fz.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();

        File f1 = new File("C:\\Users\\Abhishek\\Desktop\\Daily Notes","array");
        f1.hashCode();

        File f2= new File("C:\\Users\\Abhishek\\Desktop\\Daily Notes","array_object 07 08 2023.txt ");
        System.out.println(f2.setLastModified(54567));
        System.out.println(f2.lastModified());
        System.out.println(f2.getFreeSpace());
        System.out.println(f1.toPath());
        System.out.println(f1.renameTo(new File("Array_object.txt")));
        System.out.println(f1.setReadOnly());
    }

}
