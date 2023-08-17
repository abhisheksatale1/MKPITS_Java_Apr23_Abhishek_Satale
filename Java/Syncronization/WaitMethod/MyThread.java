package WaitMethod;

public class MyThread implements Runnable{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("My First Thread"+Thread.currentThread().getName()+i);
        }
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        notify();
    }

}
