package com.jeeva.spring.setterInjection.DependencyCheckInnerBeansAndScopes;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrescription {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("prescription.xml");
        Prescription p = (Prescription)context.getBean("prescription");
        System.out.println(p);


    }
}
