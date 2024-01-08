package com.jeeva.spring.setterInjection.Assignment.LCAssign;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketResrvation {
    private int TicketId;

    public int getTicketId() {
        return TicketId;
    }

    public void setTicketId(int ticketId) {
//        System.out.println("Inside Setter Method");
        TicketId = ticketId;
    }

    @PostConstruct
    public void initialize(){
        System.out.println("inside the initialize method");
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("Inside cleanup method");
    }

    @Override
    public String toString() {
        return "TicketResrvation{" +
                "Ticketid=" + TicketId +
                '}';
    }
}
