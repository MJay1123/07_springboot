package com.ohgiraffers.springpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SignInController {
    @GetMapping("goToSignIn")
    public String goToSignIn(){
        System.out.println("회원가입 페이지로 이동");
        return "signInPage";
    }

    @PostMapping("signIn1")
    public String signIn1(@RequestParam("ID") String ID,
                         @RequestParam("PWD") String PWD,
                         RedirectAttributes rttr){
        System.out.println("ID = " + ID);
        System.out.println("PWD = " + PWD);
        rttr.addFlashAttribute("id", ID);
        rttr.addFlashAttribute("pwd", PWD);
        System.out.println("회원가입 다음 페이지로 이동");
        return "nextSignInPage";
    }

    @PostMapping("signIn2")
    public String nextSignIn(@RequestParam String name,
                             @RequestParam int age,
                             @RequestParam String gender,
                             RedirectAttributes rttr,
                             Model model){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        rttr.addFlashAttribute("name", name);
        rttr.addFlashAttribute("age", age);
        rttr.addFlashAttribute("gender", gender);
//        rttr.addFlashAttribute("message", "회원가입 완료! " + name + "님, 가입을 축하드립니다!");
        model.addAttribute("message", "회원가입 완료! " + name + "님, 가입을 축하드립니다!");
        System.out.println("회원가입 완료");
        return "result";
    }

}
