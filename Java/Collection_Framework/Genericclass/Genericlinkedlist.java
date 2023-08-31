package Genericclass;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Genericlinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(300);
        linkedList.add(200);
        linkedList.add(100);
        Collections.sort(linkedList);
        System.out.println(linkedList);// comparate and comparatable interface
    }
}
