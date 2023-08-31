package Comprative_Interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ComparatorInterface {
    public static void main(String[] args){
        LinkedList linkedList=new LinkedList();
        StudentComparator[] students = new StudentComparator[5];
        students[0]=new StudentComparator("abhi",90);
        students[1]=new StudentComparator("bhagyashreetai",95);
        students[2]=new StudentComparator("karan",99);
        students[3]=new StudentComparator("trupti",86);
        students[4]=new StudentComparator("pranay",90);
        System.out.println("----------------Sorted by Marks------------------");
        System.out.println("-------------------------------------------------");
        linkedList.addAll(Arrays.asList(students));
        Collections.sort(linkedList,new StudentMarksClass());
        for(Object student:linkedList){
            System.out.println(student);
        }
        System.out.println("----------------Sorted by Name------------------");
        System.out.println("------------------------------------------------");
        Collections.sort(linkedList,new StudentNameClass());
        for(Object student:linkedList){
            System.out.println(student);

        }
    }

}
