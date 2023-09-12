package LambdaExpression;

interface lambdaExpression {
    interface A {

    }

    void display();


    public class Main {
        public static void main(String args[]) {
            lambdaExpression x = () -> {
                System.out.println("hello");
            };
            x.display();
        }
    }
}