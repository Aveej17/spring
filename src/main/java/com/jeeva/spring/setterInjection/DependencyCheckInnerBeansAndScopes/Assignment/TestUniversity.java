package com.jeeva.spring.setterInjection.DependencyCheckInnerBeansAndScopes.Assignment;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUniversity {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("university.xml");
        University university = (University)context.getBean("Univ");
        System.out.println(university);

        University university1 = (University)context.getBean("Univ");
        System.out.println(university1);

        System.out.println("  Prototype Scope is used hashcode must vary: ");
        System.out.println(university.hashCode());
        System.out.println(university1.hashCode());


    }
}
