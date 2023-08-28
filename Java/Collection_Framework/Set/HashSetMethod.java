package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethod {
    public static void main(String args[]){
        HashSet hashSet = new HashSet();
        hashSet.add(34);
        hashSet.add(65);
        hashSet.add(67);
        hashSet.add(67);// duplicates are not allowed  in hashset method
        System.out.println(hashSet);
        hashSet.clone();
        System.out.println(hashSet);
//        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println("contains method");
        System.out.println(hashSet.contains(67));
//        hashSet.clear();
        System.out.println("clear all elements");
        System.out.println(hashSet);
        System.out.println("remove the elements");
        hashSet.remove(65);
        System.out.println(hashSet);
        System.out.println("useing iterator i.e giving elements one by one");
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
        boolean empty=hashSet.isEmpty();
        System.out.println(empty);
    }
}
