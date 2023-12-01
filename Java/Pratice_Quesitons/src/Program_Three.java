import java.util.Scanner;

public class Program_Three {
    public void program_Three(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for (int i=0;i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
