package RunnerExample;

public class Main {

    public static void main(String[] args) {
        Runner runner = new Runner();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                runner.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                runner.decrement();
            }
        });

        t1.start();
        t2.start();
    }
}
