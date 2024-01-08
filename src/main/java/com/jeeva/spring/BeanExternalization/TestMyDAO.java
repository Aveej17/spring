package com.jeeva.spring.BeanExternalization;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyDAO {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dbconfigpropertiesfile.xml");
         MyDAO myDAO = (MyDAO)context.getBean("MyDAO");
        System.out.println(myDAO);
    }
}
