package RandomNumberByThread;

public class RandomNumbersecond implements Runnable {
    public void run(){
        for(int i=0;i<=1000;i++){
            System.out.println(" first"+Math.random());
        }
    }
}
