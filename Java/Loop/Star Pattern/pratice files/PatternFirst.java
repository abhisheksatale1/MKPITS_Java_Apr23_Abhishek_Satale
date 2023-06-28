import java.util.Scanner;
public class PatternFirst extends Main {
    public void pyramidPattern(){
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();



        for(int row=0;row<=rows;row++)
        {
            for( int space=rows;space>row;space--){
                System.out.print(" ");

            }
            for (int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }


        for(int row=1; row<=rows-1 ; row++)
        {
            for (int space=1; space<=row; space++)
            {
                System.out.print(" ");
            }
            for (int col=0; col<=rows-1-row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
  }

}
}