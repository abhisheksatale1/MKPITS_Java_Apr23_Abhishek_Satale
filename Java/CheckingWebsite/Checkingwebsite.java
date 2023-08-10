package CheckingWebsite;
import java.util.Scanner;
public class Checkingwebsite {
    public static void check(String str) {
        String s1 = str.substring(0, 11);
        System.out.println(s1);
        if (s1.equals("http://www.")) {
            if (str.substring(10).contains(".")) {
                System.out.println("Valid website name");
            } else {
                System.out.println("Invalid website Name");
            }
        }
        else
        {
                    System.out.println("Invalid Website name");
                }
            }
        }

