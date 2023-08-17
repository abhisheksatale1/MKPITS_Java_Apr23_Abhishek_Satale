package RunnerExample;

public class Runner {
    private int counter =0;
    public void increment(){
        synchronized (this){
            counter++;
            System.out.println("counter increment to "+counter);
            notify();
        }
    }
    public void decrement(){
        synchronized (this){
            while (counter==0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            counter--;
            System.out.println("counter decrement to "+counter);
        }
    }
}
