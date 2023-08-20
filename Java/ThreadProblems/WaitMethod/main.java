package WaitMethod;

public class main {
    public static void main(String []args){
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new YourThread());
        t1.start();

        t2.start();
    }
}
