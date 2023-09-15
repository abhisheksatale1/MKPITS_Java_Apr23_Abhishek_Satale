package Anonymous_Class_In_Comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ComparatorClass {
    public static void main(String[] args) {
        LinkedList<Student> linkedList = new LinkedList<Student>();
        linkedList.add(new Student("pranay",90));
        linkedList.add(new Student("abhi",80));
        linkedList.add(new Student("shubham",70));

        System.out.println("--------------------- Sorting on Marks -----------------------------");
        Collections.sort(linkedList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getMarks()==o2.getMarks())
                    return 0;
                else if (o1.getMarks()<o2.getMarks()) {
                    return -1;
                }else
                    return 1;
            }
        });
        System.out.println(linkedList);

        System.out.println("--------------------------- Sorting on Name ------------------------------");
        Collections.sort(linkedList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(linkedList);

    }
}
