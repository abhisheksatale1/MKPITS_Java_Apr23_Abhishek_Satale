package MultiplechoiceStudentInformation;

import MultipleChoice_StudentsInformation.Studentclass;

import java.util.LinkedList;
import java.util.Scanner;

public class MethodsforStudents {
    Scanner scanner;
    LinkedList list = new LinkedList();

    public MethodsforStudents(LinkedList list) {
        this.list = list;
    }

    public void Addstudens(){
        System.out.println("Enter the name");

        String sc = scanner.next();
        System.out.println("enter the marks");

        int mark = scanner.nextInt();
//        StudentInformation ServiceClass = new StudentInformation(Name, Mark);
//        list.add(ServiceClass);
////
    }
}
