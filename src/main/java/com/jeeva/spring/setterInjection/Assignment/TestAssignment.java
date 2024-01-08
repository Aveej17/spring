package com.jeeva.spring.setterInjection.Assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAssignment {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("assignment.xml");
        ShoppingCart shoppingCart = (ShoppingCart)context.getBean("ShoppingCart");
        System.out.println(shoppingCart.getItem().getClass());
        System.out.println(shoppingCart.toString());
    }
}
