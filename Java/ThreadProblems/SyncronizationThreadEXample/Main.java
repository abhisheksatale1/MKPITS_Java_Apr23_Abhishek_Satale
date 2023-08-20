package SyncronizationThreadEXample;

public class Main {
    public static void main(String args[]){
        Sender obj = new Sender();
        ThreadedSend t1 = new ThreadedSend("hi",obj);
        ThreadedSend t2 = new ThreadedSend("bye",obj);
        t1.start();
        t2.start();
    }
}





























































































