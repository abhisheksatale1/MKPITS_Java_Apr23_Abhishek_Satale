interface Shape {
    void CalArea(int l, int b);
}
class Rectangle{
    Rectangle(){
        Shape s =(int l, int b)->{
            System.out.println("Area of Rectangle"+(l*b));
        }; s.CalArea(5,4);
    }

    public class Main{
        public static void main(String args[]){
           new Rectangle();
        }
    }

}
