package RunnableEvenOddSortingWithLambdaFunction;

public class EvenOddbyusingLambdaExpression {
    public static void main(String[] args) {
        Runnable runnable =()->{
            for(int counter=0;counter<100;counter++){
                if(counter%2==0){
                    System.out.println("numbers are even"+counter);
                }
            }
        };runnable.run();

        Runnable runnable1 =()->{
            for (int counter=0;counter<100;counter++){
                if(counter%2!=0){
                    System.out.println("numbers are odd"+counter);
                }
            }
        };runnable1.run();
    }
}
