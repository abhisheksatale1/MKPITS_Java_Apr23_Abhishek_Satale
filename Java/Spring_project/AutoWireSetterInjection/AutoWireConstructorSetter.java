/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autowireconstructorsetter;


import Teacher.TeacherInformation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 *
 * @author Abhishek
 */
public class AutoWireConstructorSetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
ApplicationContext context= new ClassPathXmlApplicationContext("newXMLDocument.xml");


  TeacherInformation teacherinfo=(TeacherInformation)context.getBean("Teacher");
  teacherinfo.displayDetails();
 
    }
    
}
