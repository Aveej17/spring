package com.jeeva.spring.setterInjection.RefTypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRefTypes {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("reftypes.xml");
        Student student = (Student) context.getBean("Student");
        System.out.println(student.toString());
        System.out.println(student.getScores().getClass());
    }
}
