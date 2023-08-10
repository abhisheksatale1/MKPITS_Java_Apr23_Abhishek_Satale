//Arthimatic ExceptionHandling//
package ExcaptionHandling;

import java.util.Scanner;

public class ExcaptionHandlingExample {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter Second number");
        int b=sc.nextInt();
        try {
            System.out.println(a / b);
        }catch (ArithmeticException e) {
//            System.out.println("can not divide by zero");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){

        }
        catch (Exception e){

        }
        finally {
            System.out.println("hello");
        }
        System.out.println("Bye");


    }
}
