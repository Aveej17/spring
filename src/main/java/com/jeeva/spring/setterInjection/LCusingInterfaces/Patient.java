package com.jeeva.spring.setterInjection.LCusingInterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Inside the setter Method");
        this.id = id;
    }

//    public void hi(){
//        System.out.println("Inside init Hi Method");
//    }
//
//    public void bye(){
//        System.out.println("Inside destroy bye method");
//    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("inside Interface Initialization");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("inside interface Destroy ");
    }
}
