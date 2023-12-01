import java.util.Scanner;

public class Pratice_program2 {

    public void pratice_class1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=scanner.nextInt();
        for (int i=0;i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
    }



}
