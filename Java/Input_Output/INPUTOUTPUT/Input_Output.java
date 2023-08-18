package INPUTOUTPUT;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedInputStream;

public class Input_Output {
    public static void main(String args[]){
//        BufferedInputStream bsi = new BufferedInputStream(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number:");
        try {
            String nm= br.readLine();
            System.out.println("squre of:"+(Integer.parseInt(nm)*Integer.parseInt(nm)));
        } catch (IOException e) {
            throw new RuntimeException(e);

        }

    }
    
}
