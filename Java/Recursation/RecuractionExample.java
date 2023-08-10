package Recursation;

public class RecuractionExample {

    public static int Recuraction(int number){
        int factorial=1;
        while(number>0){
            factorial=factorial*number;
            number--;
        }
        return factorial;
    }
    public static void main(String[] args){
        System.out.println(Recuraction(5));
    }
}
