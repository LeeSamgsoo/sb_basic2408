package com.std.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/home/main")
    @ResponseBody
    public String ShowMain() {
        return "메인페이지";
    }

    @GetMapping("/home/main2")
    @ResponseBody
    public String ShowMain2() {
        return "반갑습니다.";
    }

    @GetMapping("/home/main3")
    @ResponseBody
    public String ShowMain3() {
        return "즐거웠습니다.";
    }
}
