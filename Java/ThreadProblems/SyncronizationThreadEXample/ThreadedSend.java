package SyncronizationThreadEXample;

public class ThreadedSend extends Thread {
    private String Message;
    Sender sender;

    ThreadedSend(String m, Sender obj) {
        Message = m;
        sender = obj;
    }

    public void run() {
        synchronized (this.sender) {
            sender.send(Message);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
