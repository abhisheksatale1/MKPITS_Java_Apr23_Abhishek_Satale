package VectorExample;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String args[]){
        Vector vector = new Vector();
        vector.add(45);
        vector.add(66);
        vector.add("abhishek");

        System.out.println(vector);
        vector.add(2,56);
        System.out.println(vector);
        vector.setSize(5);
        System.out.println(vector.size());
    //________________________________________________
        System.out.println(vector.add(vector));
        System.out.println(vector.addAll(1,vector));
        System.out.println(vector.elements());
        System.out.println(vector.size());
        Vector arr =vector;
        System.out.println(vector.toArray());
        Iterator iterator=vector.listIterator(3);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
         }
        System.out.println(vector.spliterator());

    }
}
