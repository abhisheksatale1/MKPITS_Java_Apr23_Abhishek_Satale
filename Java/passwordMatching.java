import java.util.Scanner;
public class passwordMatching {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password:");
        String s1=sc.next();
        System.out.print("confirm passsword:");
        String s2=sc.next();
        if(s1.equals((s2)))
            System.out.println("valid password");


        else
            System.out.println("Invalid password");

    }
}
