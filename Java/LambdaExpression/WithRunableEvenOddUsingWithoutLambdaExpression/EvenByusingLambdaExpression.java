package WithRunableEvenOddUsingWithoutLambdaExpression;

public class EvenByusingLambdaExpression {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Numbers are odd");
                for (int counter =1;counter<100;counter++){
                    if(counter%2!=0){
                        System.out.println(counter+"Numbers is odd");
                    }

                }
            }
        };runnable.run();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Numbers are Even");
                for (int counter =1;counter<100;counter++){
                    if (counter%2==0){
                        System.out.println(counter+"number is even");
                    }
                }
            }
        };runnable1.run();
    }
}
