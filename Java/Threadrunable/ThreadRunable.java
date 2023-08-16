package Threadrunable;

public class ThreadRunable implements Runnable {
    public void Runable() {


    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello " + Thread.currentThread().getName());

        }
    }
}
