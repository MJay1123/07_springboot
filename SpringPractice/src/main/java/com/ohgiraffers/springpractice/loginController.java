package com.ohgiraffers.springpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class loginController {

    @GetMapping("goToSignIn")
    public String goToSignIn(){
        System.out.println("회원가입 페이지로 이동");
        return "signInPage";
    }

    @PostMapping("signIn")
    public String signIn(){
        System.out.println("회원가입 성공!");
        return "signInDone";
    }

    @GetMapping("goToLogin")
    public String goToLogin(){
        System.out.println("로그인 페이지로 이동");
        return "loginPage";
    }





}
