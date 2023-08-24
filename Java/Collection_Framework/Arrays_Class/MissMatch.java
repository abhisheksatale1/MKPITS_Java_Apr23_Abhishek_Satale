package Arrays_Class;

import java.util.Arrays;

public class MissMatch {
    public static void main(String[] args) {
        int Arrfirst[]={3,4,5,6,2,4,5};
        int Arrsecond[]={5,3,3,2,};
        System.out.println(Arrays.mismatch(Arrfirst, Arrsecond));
        Arrays.parallelSort(Arrfirst);
        System.out.println(Arrays.toString(Arrfirst));
        System.out.println(Arrfirst.length);

        boolean ArrNum[]=new boolean[5];
        for(boolean number:ArrNum){
            System.out.println(number);
        }

        int arrnum[]=new int[5];
        Arrays.fill(arrnum,70);
        for (int numbers:arrnum){
            System.out.println(numbers);
        }
    }
}
