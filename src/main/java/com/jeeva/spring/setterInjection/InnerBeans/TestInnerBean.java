package com.jeeva.spring.setterInjection.InnerBeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInnerBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("innerbean.xml");
        Employee emp = (Employee)context.getBean("emp");
        System.out.println(emp);

    }
}
