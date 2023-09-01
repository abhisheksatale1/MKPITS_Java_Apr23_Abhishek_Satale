package Interface;

public interface Shape   {
    void calculateArea();

    default void displayColor(){
        System.out.println("red");
    }
    static void displayName(){
        System.out.println("Abhishek");
    }
    default void displaycolorname(){
        System.out.println("pranay");
    }
}
