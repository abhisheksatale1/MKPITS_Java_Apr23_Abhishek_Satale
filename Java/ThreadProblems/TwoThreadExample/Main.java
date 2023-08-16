package TwoThreadExample;

import Threadrunable.ThreadRunable;

public class Main {
    public static void main(String[]args) throws InterruptedException {
        Thread even = new Thread(new TwoThreadEven());
        Thread odd =new Thread(new TwoThreadOdd());
        even.start();
        odd.start();
//        Thread.sleep(1000);

    }
    }

