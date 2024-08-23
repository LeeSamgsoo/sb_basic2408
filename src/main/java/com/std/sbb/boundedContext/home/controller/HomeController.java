package com.std.sbb.boundedContext.home.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class HomeController {
    @GetMapping("/home/reqAndResp")
    @ResponseBody
    public void showReqAndResp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int age = Integer.parseInt(req.getParameter("age").replaceAll(" ", ""));
        resp.getWriter().append("Hello, you are %d years old.".formatted(age));
    }

    // 이 방식이 가능한 이유는 스프링부트가 배후에서 처리를 해주기 때문이다.(이 방식이 코딩하기 더 편하다.)
    @GetMapping("/home/reqAndRespV2")
    @ResponseBody
    public String showReqAndRespV2(int age) {
        return "Hello, you are %d years old.".formatted(age);
    }
}


