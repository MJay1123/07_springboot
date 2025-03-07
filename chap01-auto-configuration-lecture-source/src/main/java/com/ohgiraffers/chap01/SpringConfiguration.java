package com.ohgiraffers.chap01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
    @Value("${test.value}")
    public String testValue;

    /* 설명. @Value는 시스템 환경변수도 불러올 수 있다. */
    @Value("${username}")
    public String userName;

    @Value("${test.age}")
    public int age;

    @Bean
    public Object propertReadTest(){
        System.out.println("testValue : " + testValue);
        System.out.println("userName : " + userName);
        System.out.println("testAge : " + age);

        return new Object();
    }
}
