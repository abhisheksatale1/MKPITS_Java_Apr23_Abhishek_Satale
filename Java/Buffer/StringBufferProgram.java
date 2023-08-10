package Buffer;

public class StringBufferProgram {
    public void palindrome(String string1){
        StringBuffer str= new StringBuffer(string1);
        str.reverse();
        if(string1.equals(str.toString()))
        {
            System.out.println("IT IS PALINDROME");
        }else {
            System.out.println("NAN");

        }

    }


}