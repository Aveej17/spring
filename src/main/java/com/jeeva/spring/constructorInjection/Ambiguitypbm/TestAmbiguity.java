package com.jeeva.spring.constructorInjection.Ambiguitypbm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAmbiguity {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ambiguityconstructor.xml");
        Addition addition = (Addition)context.getBean("addition");
        System.out.println(addition);
    }
}
