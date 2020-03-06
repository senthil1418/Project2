package com.pack;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.pack.Payment;
 
public class Main {
 
    public static void main(String a[]){
        ConfigurableApplicationContext context 
                        = new ClassPathXmlApplicationContext("beans.xml");
        Payment payment = (Payment) context.getBean("payment");
        System.out.println(payment.toString());
    }
}