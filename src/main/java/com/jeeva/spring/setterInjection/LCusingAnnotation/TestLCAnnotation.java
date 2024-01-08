package com.jeeva.spring.setterInjection.LCusingAnnotation;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLCAnnotation {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("LCAnnotation.xml");
        Patient patient = (Patient)context.getBean("patient");
        System.out.println(patient);
        context.registerShutdownHook();

//        patient.hi();
//        System.out.println(patient.toString());
//        patient.bye();
    }
}

