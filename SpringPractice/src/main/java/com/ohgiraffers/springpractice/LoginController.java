package com.ohgiraffers.springpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
    @GetMapping("goToLogin")
    public String goToLogin(){
        System.out.println("로그인 페이지로 이동");
        return "loginPage";
    }

    @PostMapping("login")
    public String login(@RequestParam("ID") String ID,
                        @RequestParam("PWD") String PWD,
                        RedirectAttributes rttr,
                        Model model){
        System.out.println("ID = " + ID);
        System.out.println("PWD = " + PWD);
        rttr.addFlashAttribute("ID", ID);
        rttr.addFlashAttribute("PWD", PWD);
        rttr.addFlashAttribute("message", ID + "님, 오신 것을 환영합니다!");
        model.addAttribute("message", ID + "님, 오신 것을 환영합니다!");
        return "result";
    }

}
