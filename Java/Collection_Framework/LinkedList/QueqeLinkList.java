package LinkedList;

import java.util.LinkedList;

public class QueqeLinkList {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.add(45);
        list1.add(56);
        System.out.println(list1);
        LinkedList list2= new LinkedList();
        list2.addAll(list1);
        list2.addFirst(100);
        System.out.println(list2);
        list2.addLast(200);
        System.out.println(list2);
        list2.addLast("abhi");
        System.out.println(list2);
        list2.addFirst("pranay");
        System.out.println(list2);
        list1.removeFirst();
        System.out.println(list1);
        list2.removeLast();
        System.out.println(list2);
        list2.poll();
        System.out.println(list2);
        list2.peek();
        System.out.println(list2); // all methods pick pull poll is the queqe methods
        list2.pop();
        System.out.println(list2);
        list2.push(list2);
        System.out.println(list2);

    }
}
