package Recursation;

public class Recurcation {
    static int i=0;
    public static void display(){
        i++;
        if(i<=5){
            System.out.println("hello");
            display();
        }

        System.out.println("hello");

    }
    public static void main(String[]args){
        display();
    }
}
