package shapes;



public class Rectangle implements shapes.shape {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }



    @Override
    public void CalArea() {
        System.out.println(length*breadth);
    }
}
