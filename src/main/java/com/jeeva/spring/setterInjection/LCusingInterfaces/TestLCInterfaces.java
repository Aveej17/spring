package com.jeeva.spring.setterInjection.LCusingInterfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLCInterfaces {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("LCinterfaces.xml");
        Patient patient = (Patient)context.getBean("patient");
        System.out.println(patient);
        context.registerShutdownHook();
//        patient.hi();
//        System.out.println(patient.toString());
//        patient.bye();
    }
}

