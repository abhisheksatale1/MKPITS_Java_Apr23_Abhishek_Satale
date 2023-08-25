package LinkedList;
import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("shubham");
        list.add(123);
        list.add(23.34);
        for (int add = 0; add < 3; add++)
        {
            System.out.println(list.get(add));

        }
        for(Object obj:list){
            System.out.println("add the list by for each loop "+obj);
        }
    }
}