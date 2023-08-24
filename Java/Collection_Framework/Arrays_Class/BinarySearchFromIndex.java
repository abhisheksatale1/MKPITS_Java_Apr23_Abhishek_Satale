package Arrays_Class;

import java.util.Arrays;

public class BinarySearchFromIndex {
    public static void main(String[] args) {
        int Arr[]={12,23,45,67,102};
        Arrays.sort(Arr);
        System.out.println(Arrays.binarySearch(Arr,
                1
        ));
    }
}
