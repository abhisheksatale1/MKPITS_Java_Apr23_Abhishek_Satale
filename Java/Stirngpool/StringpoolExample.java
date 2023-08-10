package Stirngpool;

public class StringpoolExample {
    public static void main(String []args){
        String str1="Java";
        String str2= new String("Java").intern();
         String str3= new String("Python");
         String str4= new String("Python");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1==str3);
    }
}
