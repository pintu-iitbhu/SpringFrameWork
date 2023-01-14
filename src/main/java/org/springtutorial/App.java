package org.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springtutorial.core.Employ;
import org.springtutorial.ref.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        Employ emp1= (Employ) context.getBean("employ1");
//        System.out.println(emp1);

        ApplicationContext refContext = new ClassPathXmlApplicationContext("refConfig.xml");
        Student stud1= refContext.getBean("stud1", Student.class);
        System.out.println(stud1);


    }
}
