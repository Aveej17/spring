package com.jeeva.spring.constructorInjection;
import org.springframework.beans.factory.annotation.Required;

public class Address {
    private int doorNo;
    private String city;
    private int pinCode;

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }


    @Required
    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNo=" + doorNo +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}

