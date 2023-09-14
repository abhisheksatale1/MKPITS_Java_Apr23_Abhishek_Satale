package ConstructorReference;

public class Main {
    public static void main(String[] args) {
        ContructorReference contructorReference =Student::new;
      Student student=  contructorReference.getStudent("abhi",23);
        System.out.println(student.getName());
        System.out.println(student.getMarks());

    }
}
