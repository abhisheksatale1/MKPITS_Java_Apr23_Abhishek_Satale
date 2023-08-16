package TwoThreadExample;

public class TwoThreadOdd implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd" + i);
            }
        }
    }
}