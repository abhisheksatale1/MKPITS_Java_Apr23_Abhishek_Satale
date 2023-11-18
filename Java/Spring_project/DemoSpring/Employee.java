/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author Abhishek
 */
public class Employee {
    private int id;
    private String name;
    private Address address;

    public Employee() {
    }

    public Employee(int id, String name, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.address=address;
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
    
    public void display(){
        System.out.println("id= "+id+" "+"name="+name);
        System.out.println(address.toString());
    }
}
