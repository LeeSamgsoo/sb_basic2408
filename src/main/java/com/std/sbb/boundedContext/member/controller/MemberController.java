package com.std.sbb.boundedContext.member.controller;

import com.std.sbb.base.rsData.RsData;
import com.std.sbb.boundedContext.member.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {


    @GetMapping("/member/login")
    @ResponseBody
    public RsData login(@RequestParam String username, @RequestParam String password) {
        MemberService ms = new MemberService();
        return ms.memberCheck(username, password);
    }
}
