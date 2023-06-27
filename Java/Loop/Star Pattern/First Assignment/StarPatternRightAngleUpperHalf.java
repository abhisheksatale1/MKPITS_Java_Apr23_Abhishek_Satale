import java.util.Scanner;

public class StarPatternRightAngleUpperHalf{
    public void starPatternRightAngleUpperHalf(int number){
        //Upper HALF
        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}