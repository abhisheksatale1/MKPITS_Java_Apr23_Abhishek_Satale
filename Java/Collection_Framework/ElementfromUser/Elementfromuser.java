package ElementfromUser;


import Assignment_LinkedList.IterationMethod;

import java.util.LinkedList;
import java.util.*;
public class Elementfromuser {
    public static void main(String[] args) {
        LinkedList<Student> linkedList = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String name = sc.next();

        Student std = new Student(marks, name);
        linkedList.add(std);
//        for (Object obj : linkedList) {
//            System.out.println(std.getMarks() + " " + std.getName());
//        }
       while (true){
           int marks1 = sc.nextInt();
           String name1 = sc.next();
           std=new Student(marks1, name1);
           System.out.println(std.getMarks() + " " + std.getName());
            Scanner scanner1 = new Scanner(System.in);
            String scd= scanner1.next();
           System.out.println(scd);
       }


    }
}
