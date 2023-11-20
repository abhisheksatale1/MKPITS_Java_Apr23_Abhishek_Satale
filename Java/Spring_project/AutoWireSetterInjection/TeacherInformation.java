/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teacher;

import Student.StudentInformation;

/**
 *
 * @author Abhishek
 */
public class TeacherInformation {
    private int id;
    private String name;
    private StudentInformation student;

    public StudentInformation getStudent() {
        return student;
    }

    public void setStudent(StudentInformation student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
  public void displayDetails(){
      System.out.println("------------------------Teachers Details-------------------------");
      System.out.println(id);
      System.out.println(name);
      System.out.println("--------------------Student details------------------");
      System.out.println(student);
  }  
    
}
