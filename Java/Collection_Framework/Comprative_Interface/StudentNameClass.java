package Comprative_Interface;

import java.util.Comparator;

public class StudentNameClass implements Comparator<StudentComparator> {
    @Override
    public int compare(StudentComparator student1, StudentComparator student2) {
//        return student1.getName().compareTo(student2.getName());
        if(student1.getName()==student2.getName()) {
            return 0;
        }else if(student1.getName().length()<=student1.getName().length())
            return -1;
        else {
            return 1;
        }
    }
}
