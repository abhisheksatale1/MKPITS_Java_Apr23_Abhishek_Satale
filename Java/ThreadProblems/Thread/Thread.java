package Thread;

public class Thread extends java.lang.Thread {
    public Thread(String name) {
        super(name);
    }

    public void run(){
        System.out.println("hello world");
//        System.out.println(currentThread().getPriority());
//        System.out.println(getName());//thread-0

    }
}
