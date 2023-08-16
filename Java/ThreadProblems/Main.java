import Thread.Thread;
public class Main {
    public static void main(String[] args) {
        System.out.println("hi");
        Thread thr = new Thread("Shyam");
        System.out.println(thr.getName());
        //we cant give the name to main thread
//        thr.setName("Jai");
        thr.start();
        System.out.println(thr.getName());
//        System.out.println("by");
//        System.out.println(thr.getPriority());
//        System.out.println(thr.getName());
//        System.out.println(thr.currentThread().getName());//main
    }
}