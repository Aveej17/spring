package com.jeeva.spring.constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("empconstructor.xml");
        Employee employee = (Employee)context.getBean("emp");
        System.out.println(employee);

    }
}
