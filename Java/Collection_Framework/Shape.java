public interface Shape {
    int a =10;

    void calArea();
    static void main1(){
        System.out.println("Orange");
    }
    default void color(){
        System.out.println("12");
    }
}
class Reactangle implements Shape{


    @Override
    public void calArea() {
        System.out.println("Area of circle :");
    }

    @Override
    public void color() {
        Shape.main1();
        System.out.println(Shape.a);
    }
}