package com.ohgiraffers.chap01;

import jdk.jfr.Name;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
    @Value("${test.value}")
    public String testValue;

    @Value("${test.abc}")
    public String testAbc;

    @Value("${test.age}")
    public String testAge;

    /* 설명. @Value는 시스템 환경변수도 불러올 수 있다. */
    @Value("${username}")
    public String userName;

    @Bean
    public Object propertReadTest() {
        System.out.println("testValue: " + testValue);
        System.out.println("testAge: " + testAge);
        System.out.println("userName: " + userName);
        System.out.println("testAbc = " + testAbc);

        return new Object();
    }
}
