package org.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springtutorial.autoWired.Book;
import org.springtutorial.autoWired.Chapter;
import org.springtutorial.constructInject.Person;
import org.springtutorial.core.Employ;
import org.springtutorial.lifeCycle.Drinks;
import org.springtutorial.lifeCycle.Food;
import org.springtutorial.lifeCycle.Starters;
import org.springtutorial.removeXML.Hotel;
import org.springtutorial.removeXML.JavaConfig;
import org.springtutorial.streotype.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        Employ emp1= (Employ) context.getBean("employ1");
//        System.out.println(emp1);

//        ApplicationContext refContext = new ClassPathXmlApplicationContext("refConfig.xml");
//        Student stud1= refContext.getBean("stud1", Student.class);
//        System.out.println(stud1);

//        ApplicationContext ciContext = new ClassPathXmlApplicationContext("ciConfig.xml");
//        Person p1= ciContext.getBean("p1", Person.class);
//        System.out.println(p1);

        //To run the destroy method we need to implement pre shutdown hook
//        AbstractApplicationContext lifeCycleContext=new ClassPathXmlApplicationContext("lifeCycleConfig.xml");
//        Food food= lifeCycleContext.getBean("food1", Food.class);
//        System.out.println(food);
//        lifeCycleContext.registerShutdownHook();
//
//        //Implementoing bean life cycle using interface
//        Drinks drink = lifeCycleContext.getBean("drink1", Drinks.class);
//        System.out.println(drink);
//
//        //Implementoing bean life cycle using Annotations
//        Starters starter = lifeCycleContext.getBean("starter1", Starters.class);
//        System.out.println(starter);
//
//        ApplicationContext autoContext = new ClassPathXmlApplicationContext("autoWiredConfig.xml");
//        Book book = autoContext.getBean("book", Book.class);
//        System.out.println(book);

//        ApplicationContext streoTypeContext = new ClassPathXmlApplicationContext("streotypeConfig.xml");
//        Student student1= streoTypeContext.getBean("stud1", Student.class);
//        System.out.println(student1);

        ApplicationContext xmlContext= new AnnotationConfigApplicationContext(JavaConfig.class);
//        Hotel hotel = xmlContext.getBean("hot", Hotel.class);
//        System.out.println(hotel);

        Hotel hotel = xmlContext.getBean("getHotel", Hotel.class);
        System.out.println(hotel);


    }
}
