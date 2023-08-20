package FindingThreadName;

public class Main {
    public static void main(String args[]){
        Thread th1 = new Thread(new ThreadName(),"aaa");
        Thread th2 = new Thread(new ThreadName(),"haa");
        try {
            th1.start();
            th1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
         th2.start();
    }
}
