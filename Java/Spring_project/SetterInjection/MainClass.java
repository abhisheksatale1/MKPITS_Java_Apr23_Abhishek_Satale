/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressSetterInjection.EmployeeAddress;

import Employee.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Abhishek
 */
public class MainClass {
    public static void main(String args[]){
        Resource resource = new ClassPathResource("AddressSetterInjection.EmployeeAddress.SetterInjectionAddress.xml");
        BeanFactory factory= new XmlBeanFactory(resource);
        EmployeeNew employeenew = (EmployeeNew) factory.getBean("obj");
         employeenew.displayinfo();
        
        
    }
    
}
