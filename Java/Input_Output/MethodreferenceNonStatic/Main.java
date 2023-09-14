package MethodreferenceNonStatic;

public class Main {
    public static void main(String[] args) {
        Myclass myclass = new Myclass();
        myclass.display();
        MyInterface myInterface= myclass::display;
        myInterface.disp();

        Runnable runnable = myclass::display;
        Thread thread = new Thread(runnable);
        thread.start();

            }
        }


