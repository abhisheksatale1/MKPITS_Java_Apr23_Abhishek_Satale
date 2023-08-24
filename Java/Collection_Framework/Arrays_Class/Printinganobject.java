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

    }
}
