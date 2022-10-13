/**
 * @author Ketan Kumar
 * Illustrating SPRING CORE SETTER DEPENDENCY INJECTION USING XML FILE
 * CREATING OBJECT BY USING BEAN
 * SETTING VARIABLE USING PROPERTY
 *
 */

package spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class);
    	ApplicationContext ac =new ClassPathXmlApplicationContext("spring.xml");
    	Student student = (Student)ac.getBean(Student.class);
    	student.reading();
    }
}
