package RandomNumberByThread;

public class Main {
    public static void main (String args[]){
    Thread t1 = new Thread(new RandomNumber());
    Thread t2 = new Thread(new RandomNumbersecond());
    t2.start();
    t1.start();

    }
}
