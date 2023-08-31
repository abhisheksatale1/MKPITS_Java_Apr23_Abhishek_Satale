package Set;

import java.util.Arrays;
import java.util.HashSet;

public class TwodifferentArray {
    public static void main (String args[]){
        Integer [] numberArray1 = {34,56,75,76};
        Integer [] numberArray2 ={44,56,76,34};
        HashSet<Integer> hashSet1=new HashSet<Integer>(Arrays.asList(numberArray1));
        HashSet <Integer>hashSet2=new HashSet<Integer>(Arrays.asList(numberArray2));
        hashSet1.addAll(hashSet2);
        hashSet1.removeAll(hashSet2);
        System.out.println(hashSet1);

    }
}
