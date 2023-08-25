package Arrays_Class;

import java.util.*;

public class Printinganobject {
    public static void main(String[] args) {
        List list= new ArrayList();
        list.add(45);
        list.add(4923454l);
        list.add(34.54);
        list.add("shubham");
        list.add(1,47);
        int i = list.hashCode();
        System.out.println(list);
        System.out.println(i);
        System.out.println(list.remove(2));

        int[]arrNumber={36,78,45};
        Arrays.asList(arrNumber);
        List  newList= new ArrayList();
        List newList1= Arrays.asList(12,45,6,7,4,3,2345,3454,3); //we will pass here n number of variables
//        newList1.add(3,34);
        System.out.println(newList);
        System.out.println(newList1);

        List list2= new ArrayList();
        list2.add(56);
        list2.add(53);
        System.out.println(list.addAll(list2));
        list.remove(1);
        System.out.println(list.remove(list2));

    }
}
