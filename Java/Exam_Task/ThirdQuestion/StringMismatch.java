package ThirdQuestion;

public class StringMismatch {


    public static void main(String[] args) {
       String str1="hello";
       String str2="world";

        try {
            if (!str1.equalsIgnoreCase(str2)) {
                throw new StringMismatchExceptionBuilder().setMessage("The strings are not equal.").createStringMismatchException();
            } else {
                System.out.println("The strings are equal.");
            }
        } catch (StringMismatchException e) {
            System.out.println("Exception error");
        }
    }
}