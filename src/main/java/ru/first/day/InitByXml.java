package ru.first.day;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitByXml {
    public static void main(String[] args) {

        ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("check lazy annotation1");
//        Person ar = context1.getBean(Person.class);
//        Person pa = context1.getBean(Person.class);


//        System.out.println(ar.getAge());
//        pa.setAge(42);
//
//        // first question - yes (singleton) |||
//
//        System.out.println("Is it objects equals?? " + (ar == pa));
//        System.out.println(ar.getAge());
    }
}
