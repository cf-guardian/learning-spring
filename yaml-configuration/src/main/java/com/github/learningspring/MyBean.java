package com.github.learningspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    @Value("${morningtoncrescent.home}")
    String home;

    public String getHome() {
        return home;
    }

}
