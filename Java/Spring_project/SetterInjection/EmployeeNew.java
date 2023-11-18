/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressSetterInjection.EmployeeAddress;



/**
 *
 * @author Abhishek
 */
public class EmployeeNew {
    private int id;
    private String name;
    private AddressSetterInjection address;

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

    public AddressSetterInjection getAddress() {
        return address;
    }

    public void setAddress(AddressSetterInjection address) {
        this.address = address;
    }
    
    public void displayinfo(){
        System.out.println(id+""+name);
        System.out.println(address);
    }
}
