package WaitMethod;

public class YourThread implements Runnable {
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("my Second thread"+Thread.currentThread().getName()+i);
        }
    }
}
