package ru.first.day;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Init {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ru.first.day"); // создание при инициализация конструктора
        // ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("check lazy annotation");
        Person ar = context.getBean(Person.class);
        Person pa = context.getBean(Person.class);


        System.out.println(ar.getAge());
        pa.setAge(42);

        // first question - yes (singleton) |||

        System.out.println("Is it objects equals?? " + (ar == pa));
        System.out.println(ar.getAge());

    }
}
