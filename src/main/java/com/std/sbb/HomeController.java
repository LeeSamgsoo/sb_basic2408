package com.std.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    private int num;

    public HomeController() {
        num = -1;
    }

    @GetMapping("/home/plus")
    @ResponseBody
    public int showPlus(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/home/minus")
    @ResponseBody
    public int showMinus(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }

    @GetMapping("/home/multiply")
    @ResponseBody
    public int showMultiply(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }

    @GetMapping("/home/divide")
    @ResponseBody
    public int showDivide(@RequestParam int a, @RequestParam int b) {
        return a / b;
    }

    @GetMapping("/home/increase")
    @ResponseBody
    public int getA() {
        num++;
        return num;
    }

    @GetMapping("/home/main")
    @ResponseBody
    public String ShowMain() {
        return "안녕하세요";
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
