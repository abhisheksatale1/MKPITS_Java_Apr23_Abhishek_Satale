package LinkedList;

import java.util.Iterator;
import java.util.*;

public class LinkedListString {
    public static void main(String args[]){
        LinkedList <String>list = new <String> LinkedList();
        list.add("shubham");
        list.add("pranay");
        list.add("Avnish");
        System.out.println(list);
        Iterator ir=list.descendingIterator();
        while (ir.hasNext()){
            System.out.println(ir.next());

        }
    }
}
