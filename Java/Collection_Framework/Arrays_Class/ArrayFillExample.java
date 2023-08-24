package Arrays_Class;

import java.util.Arrays;

public class ArrayFillExample {
    public static void main(String[] args) {
        int Arr[]={10,20,30,40,50};
            int key=2;
        Arrays.fill(Arr, key);
        System.out.println(Arrays.toString(Arr));
    }
}
