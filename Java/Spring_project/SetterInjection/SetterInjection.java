/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setterinjection;


import Employee.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Abhishek
 */
public class SetterInjection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("newXMLDocument.xml");
        BeanFactory factory= new XmlBeanFactory(resource);
        Employee emplyeeo= (Employee) factory.getBean("obj");
        emplyeeo.display();
    }
    
}
