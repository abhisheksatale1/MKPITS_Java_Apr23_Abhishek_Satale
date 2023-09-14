package MethodreferenceNonStatic;

public class Myclass {
    public void display(){
        for(int number =1;number<=100;number++){
            if (number%2==0)
            System.out.println("all numbers are even"+number);

        }

        for(int number =1;number<100;number++){
            if (number%2!=0){
                System.out.println("all numbers are odd"+number);
            }
        }
    }
}
