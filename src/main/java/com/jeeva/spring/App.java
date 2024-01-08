package com.jeeva.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Employee emp = (Employee) ctx.getBean("emp");
        System.out.println("Employee id "+ emp.getId()+" Employee Name "+emp.getName());
        Employee emp2 = (Employee) ctx.getBean("emp");
        System.out.println("Employee id "+ emp2.getId()+" Employee Name "+emp2.getName());

        System.out.println("printing the hash codes");
        System.out.println(emp.hashCode());
        System.out.println(emp2.hashCode());
    }
}