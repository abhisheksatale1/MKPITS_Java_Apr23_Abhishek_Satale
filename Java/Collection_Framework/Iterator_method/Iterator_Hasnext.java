package Iterator_method;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iterator_Hasnext {
    public static void main(String[] args) {

        List<String> list= new LinkedList<String>();
        list.add("abhi");
        list.add("pranay");
        list.add("shubham");
        System.out.println(list);
        ListIterator<String> l= list.listIterator();
        System.out.println("-----------------next value------------------------");
        while (l.hasNext()) {
            System.out.println(l.next());
        }
        System.out.println("---------------------------privious value---------------");
        while (l.hasPrevious()){
            {
                System.out.println(l.previous());
            }
        }
    }
}