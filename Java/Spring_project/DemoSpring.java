/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demospring;

import Employee.Employee;
import Question.Question;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Abhishek
 */
public class DemoSpring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Resource resource = new ClassPathResource("ApplicationContext.xml");
    BeanFactory beanfactory = new XmlBeanFactory(resource);
    Employee emplyee = (Employee) beanfactory.getBean("emp");
    emplyee.display();
    
    Question question=(Question)beanfactory.getBean("ques");
    question.displayInfo();
    }
}