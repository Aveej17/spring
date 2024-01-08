package com.jeeva.spring.setterInjection.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("mapconfig.xml");
        Shop myShop =  (Shop) context.getBean("shop");
        System.out.println(myShop.getName()+" "+ myShop.getItems());

        System.out.println(myShop.toString());
        System.out.println(myShop.getItems().getClass()+" this is the Default class ");
    }
}
