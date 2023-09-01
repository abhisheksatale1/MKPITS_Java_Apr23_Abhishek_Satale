package copyofWriteArrayList_Class;

import MapingTaskClassExample.main;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ByusingThread extends Thread {
    static CopyOnWriteArrayList<String> l= new CopyOnWriteArrayList<String>();
    public void run(){
        l.add("D");
        l.add("a");
        l.add("B");
    }
    public static void main(String args[]){                           //copyofArrayList it is a thread safe version of arraylist

        l.add("H");
        l.add("N");
        l.add("B");
        ByusingThread byusingThread = new ByusingThread();
        byusingThread.start();

        Iterator iterator = l.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(l);
    }

}
