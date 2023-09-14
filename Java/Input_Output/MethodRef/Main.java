package MethodRef;

public class Main {
    public static void main(String[] args) {
//       Runnable runnable= Myclass::display;
//       Thread thread= new Thread(runnable);
//       thread.start();

        //lambda expression
        MYinterface mYinterface=Myclass::display;
        mYinterface.disp();
    }
}
