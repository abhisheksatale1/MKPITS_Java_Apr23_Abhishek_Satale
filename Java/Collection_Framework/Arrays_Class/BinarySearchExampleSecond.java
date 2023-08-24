package Arrays_Class;

import java.util.Arrays;

public class BinarySearchExampleSecond {
    public static void main(String args[]){
        int Arr[]={12,34,32,1,2,3,5};
        Arrays.sort(Arr);

        System.out.println(Arrays.binarySearch(Arr, 1));
    }
}
