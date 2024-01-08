package com.jeeva.spring.setterInjection.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestList {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("listconfig.xml");
        Hospital hospital =(Hospital)ctx.getBean("hospital");
        System.out.println("Hospital Name " + hospital.getName() + "\tDepartments "+ hospital.getDepartments());
        System.out.println(hospital.getDepartments().getClass()); // Default Implementation class
    }
}
