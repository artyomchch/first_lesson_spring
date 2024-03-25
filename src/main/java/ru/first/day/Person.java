package ru.first.day;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("getPerson")
@Lazy
@Scope("prototype")
public class Person {
    private String name;
    private int age;


    public Person(@Value("Artyom") String name, @Value("25") int age) {
        System.out.println("Create constructor");
        this.name = name;
        this.age = age;

    }

//    public Person(String s, String s2) {
//
//    }

    public String getName() {
        System.out.println("get Name");
        return name;
    }

    public void setName(String name) {
        System.out.println("set Name");
        this.name = name;
    }

    public int getAge() {
        System.out.println("get Age");
        return age;
    }

    public void setAge(int age) {
        System.out.println("set Age");
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s  - %d", getName(), getAge());
    }
}
