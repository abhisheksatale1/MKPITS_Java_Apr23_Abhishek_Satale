package Arrays_Class;

import java.util.Arrays;

public class SortArrayExample {
    public static void main(String[] args) {
        int arrNum[]={34,56,67,78,102};
        Arrays.sort(arrNum);
        for(int number:arrNum){
            System.out.println(number);
        }
    }
}
