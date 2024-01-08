package com.jeeva.spring.setterInjection.LifeCycle;

public class Patient {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Inside the setter Method");
        this.id = id;
    }

    public void hi(){
        System.out.println("Inside init Hi Method");
    }

    public void bye(){
        System.out.println("Inside destroy bye method");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }
}
