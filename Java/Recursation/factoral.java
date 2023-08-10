package Recursation;

public class factoral {
    static int i=0;
public static void display(){


}
public static int factorial (int n){
    display();
    int f=1;
    while (n>0);
    {
        f=f*n;
        n--;

    }
    return f;
}
public static void main(String []args){
    System.out.println(factorial(5));
}
}
