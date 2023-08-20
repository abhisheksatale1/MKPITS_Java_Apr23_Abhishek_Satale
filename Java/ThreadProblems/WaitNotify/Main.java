package WaitNotify;

import WaitMethod.MyThread;

public class Main {
    public static void main(String args[]){
        MyThreadexample t = new MyThreadexample();
        t.start();
        synchronized (t){
            try {
                t.wait();
            } catch (InterruptedException e) {
                System.out.println(e);;
            }
        }
        System.out.println(t.total);
    }
}
