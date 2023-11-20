/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author Abhishek
 */
public class StudentInformation {
    private int id;
    private String name;

    public StudentInformation() {
    }

    public StudentInformation(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentInformation{" + "id=" + id + ", name=" + name + '}';
    }
    
    
}
