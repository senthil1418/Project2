package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
	      
	      Student student = (Student) context.getBean("student");
	      System.out.println("Name : " + student.getName() );
	      System.out.println("Age : " + student.getAge() );
	   }
}
