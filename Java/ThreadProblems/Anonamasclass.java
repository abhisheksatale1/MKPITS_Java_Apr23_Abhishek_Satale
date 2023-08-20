public class Anonamasclass {
    public static void main(String args[]){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");

            }
        });
        t.start();   //we can use start before ";" like .start() but we have to delete "Thread t ==" in creating object
    }
}
