package shapes;

public class circle implements shapes.shape{
    public int radius;
    public circle(int radius){
        this.radius=radius;
    }




    @Override
    public void CalArea() {
        System.out.println(Math.PI*radius*radius);
    }
}
