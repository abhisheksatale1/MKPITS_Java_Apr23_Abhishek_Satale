package WaitNotifyExample;

public class ThreadA {
    public static void main(String []args){
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b){
            try {
                b.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("total is"+b.total);
        }
    }
}
