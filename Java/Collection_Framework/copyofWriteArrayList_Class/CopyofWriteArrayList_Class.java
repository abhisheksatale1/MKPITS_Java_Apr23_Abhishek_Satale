package copyofWriteArrayList_Class;

import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyofWriteArrayList_Class {
    public static void main (String args[]){
        CopyOnWriteArrayList <Integer>number = new CopyOnWriteArrayList();
        number.add(23);
        number.add(56);
        number.add(87);
        number.add(12);
        System.out.println(number.set(1,45));
        System.out.println(number);
        System.out.println(number);
        Collections.sort(number);
        System.out.println(number);
        ((CopyOnWriteArrayList<Integer>) number).addIfAbsent(number,23);
        }

    }

