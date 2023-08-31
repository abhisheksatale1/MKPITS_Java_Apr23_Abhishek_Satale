package Genericclass;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class GenericlinkedlistStudentclass  {
    public static void main (String args[]){
        LinkedList <Studentclass> linkedList = new LinkedList<Studentclass>();
        Studentclass[] studentclasses = new Studentclass[4];
        studentclasses[0]= new Studentclass("shubham",89);
        studentclasses[1]= new Studentclass("abhishek",90);
        studentclasses[2]= new Studentclass("pranay",99);
        studentclasses[3]=new Studentclass("swapnil",98);
        linkedList.addAll(Arrays.asList(studentclasses));
  Collections.sort(linkedList);
        for (Studentclass s :linkedList
             ) {
            System.out.println(s.getMarks()+" "+s.getName());
        }


    }
}
//comparable interface 