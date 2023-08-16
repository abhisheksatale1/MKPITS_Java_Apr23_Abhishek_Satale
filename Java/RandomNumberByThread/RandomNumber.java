package RandomNumberByThread;

public class RandomNumber implements Runnable{
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println(Math.random());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
