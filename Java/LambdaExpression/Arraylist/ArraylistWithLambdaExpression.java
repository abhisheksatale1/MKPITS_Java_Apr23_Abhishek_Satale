package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistWithLambdaExpression {
    public static void main(String[] args) {
        ArrayList <Integer>arrayList = new ArrayList<Integer>();
        arrayList.addAll(Arrays.asList(12,23,45,6,7,43,22,34));
        System.out.println(arrayList);
        arrayList.forEach(number->{
            if(number%2==0){
                System.out.println(number);
            }
        });





        
        arrayList.forEach(odd->
        {
            if(odd%2!=0)
            {
                System.out.println("Odd numbers from the Arraylist:-"+odd);
            }
        });

    }
}
