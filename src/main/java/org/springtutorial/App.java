package org.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springtutorial.constructInject.Person;
import org.springtutorial.core.Employ;
import org.springtutorial.lifeCycle.Drinks;
import org.springtutorial.lifeCycle.Food;
import org.springtutorial.lifeCycle.Starters;
import org.springtutorial.ref.Student;

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
        AbstractApplicationContext lifeCycleContext=new ClassPathXmlApplicationContext("lifeCycleConfig.xml");
        Food food= lifeCycleContext.getBean("food1", Food.class);
        System.out.println(food);
        lifeCycleContext.registerShutdownHook();

        //Implementoing bean life cycle using interface
        Drinks drink = lifeCycleContext.getBean("drink1", Drinks.class);
        System.out.println(drink);

        //Implementoing bean life cycle using Annotations
        Starters starter = lifeCycleContext.getBean("starter1", Starters.class);
        System.out.println(starter);


    }
}
