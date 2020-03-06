package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
        Student1 stud = (Student1)context.getBean("stu");
        System.out.println(stud);
    }
}