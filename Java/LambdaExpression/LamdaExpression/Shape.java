package LamdaExpression;

interface Shape {
    void calArea(int r);


    public class Main {
        public static void main(String[] args) {
            Shape s = (int r) ->
                    System.out.println("Area of triangle"+(r*r));
            s.calArea(5);
        }

    }

}