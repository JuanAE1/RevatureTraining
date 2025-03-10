package org.revature;

import org.revature.models.Animal;
import org.revature.models.HelloWorld;
import org.revature.models.Owner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Spring helps us manage our objects, and helps us with dependency injection
         * With large applications, we have a lot of classes that depend on each other.
         * Objects that are managed by Spring are called beans
         * One way to configure our beans through XML
         * IOC Container -> Inversion of Control, beans, dependency injections are controlled by the container
         */

        ApplicationContext contextXML = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) contextXML.getBean("helloWorld");
        obj.getMessage();

        Animal animal1 = (Animal) contextXML.getBean("animal1");
        System.out.println(animal1);

        Animal animal2 = (Animal) contextXML.getBean("animal2");
        System.out.println(animal2);

        Owner owner = (Owner) contextXML.getBean("owner");
        System.out.println(owner);

        Owner owner2 = (Owner) contextXML.getBean("owner2");
        System.out.println(owner2);

        List<String> animalTypes = (ArrayList) contextXML.getBean("animals");
        System.out.println(animalTypes);
    }
}