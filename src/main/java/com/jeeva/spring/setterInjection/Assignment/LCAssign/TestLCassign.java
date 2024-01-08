package com.jeeva.spring.setterInjection.Assignment.LCAssign;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLCassign {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("LCAssign.xml");
        TicketResrvation  ticketReservation = (TicketResrvation)context.getBean("TicketReservation");
        System.out.println(ticketReservation);
        context.registerShutdownHook();
    }
}
