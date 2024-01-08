package com.jeeva.spring.BeanExternalization.Assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWebsite {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("testBeanExternalization.xml");
        Website website = (Website)context.getBean("website");
        System.out.println(website);
    }
}
