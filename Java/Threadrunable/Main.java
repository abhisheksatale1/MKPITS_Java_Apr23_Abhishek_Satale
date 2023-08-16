package Threadrunable;

import javax.xml.namespace.QName;
import java.util.PriorityQueue;

public class Main {
    public static void main(String args[]){
    Thread runa  = new Thread (new ThreadRunable(),"shyam");
    Thread runa1 = new Thread (new ThreadRunable(),"kiran");
        runa.setPriority(10);
        runa.getPriority();
        runa1.getPriority();
        runa1.setPriority(1);
    runa.start();
    runa1.start();
//        System.out.println(runa.getPriority());
//        System.out.println(Thread.currentThread().activeCount());
//        System.out.println(runa.getId());
}
}
