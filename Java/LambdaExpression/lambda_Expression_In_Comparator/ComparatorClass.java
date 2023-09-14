package lambda_Expression_In_Comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ComparatorClass {
    public static void main(String[] args) {
        LinkedList<Student> linkedList=new LinkedList<Student>();
        linkedList.add(new Student(11,"Pranay"));
        linkedList.add(new Student(12,"Abhi"));
        linkedList.add(new Student(13,"Shubh"));

        Comparator<Student> sortByName=(s1,s2)->{
           return s1.getName().compareTo(s2.getName());

       };

        Collections.sort(linkedList,sortByName);
        System.out.println(linkedList);
    }
}
