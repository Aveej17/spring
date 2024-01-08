package com.jeeva.spring.BeanExternalization.Assignment;

public class Website {
    private String url;

    public Website(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Website{" +
                "url='" + url + '\'' +
                '}';
    }
}
