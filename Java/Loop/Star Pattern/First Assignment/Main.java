import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter upper half number : ");
        int number1 = scanner.nextInt();
        System.out.println("Enter lower half number : ");
        int number2 = scanner.nextInt();
        StarPatternRightAngleUpperHalf starRightAngleUpperHalf = new StarPatternRightAngleUpperHalf();
        starRightAngleUpperHalf.starPatternRightAngleUpperHalf(number1);


        StarPatternDownRightAngleLowerHalf starDownRightAngleLowerHalf = new StarPatternDownRightAngleLowerHalf();
        starDownRightAngleLowerHalf.starPatternDownRightAngleLowerHalf(number2);
		System.out.println(" ");
		
				
		UpperTriangle uppertriangle = new UpperTriangle();
		uppertriangle. upperTriangle(number1);
		
		LowerTriangle lowertriangle = new LowerTriangle();
		lowertriangle. LowerTriangle(number2);
		System.out.println(" ");
		
		LowerRightTriangle lowerrighttriangle= new LowerRightTriangle();
		lowerrighttriangle.LowerRighttriangle(number2);
		System.out.println(" ");
		
		ReverseTriangle reversetriangle = new ReverseTriangle();
		reversetriangle. Reversetriangle(number2);
		
    }
}