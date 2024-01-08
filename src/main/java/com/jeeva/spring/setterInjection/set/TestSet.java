package com.jeeva.spring.setterInjection.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSet {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("setconfig.xml");
        CarDealer car = (CarDealer) ctx.getBean("cars");
        System.out.println("CarDealer Name "+car.getName()+ "=> Cars Available "+ car.getCars());
        System.out.println(car.getCars().getClass()); // Default Implementation class

    }
}
