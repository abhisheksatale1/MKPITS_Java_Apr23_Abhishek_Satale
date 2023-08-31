package Comprative_Interface;

import java.util.Comparator;

public class StudentMarksClass implements Comparator <StudentComparator>{
    @Override
    public int compare(StudentComparator student1, StudentComparator student2) {
        if(student1.getMarks()==student2.getMarks()){
            return 0;
        } else if (student1.getMarks()<student2.getMarks()) {
            return -1;
        }else {
            return 1;
        }
    }
}
