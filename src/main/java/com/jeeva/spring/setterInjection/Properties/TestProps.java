package com.jeeva.spring.setterInjection.Properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProps {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("properties.xml");
        CountriesAndLanguages countriesAndLanguages = (CountriesAndLanguages) context.getBean("countries");
        System.out.println(countriesAndLanguages.getCountriesAndLanguages().getClass());
        System.out.println(countriesAndLanguages.toString());
    }
}
