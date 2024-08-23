package com.std.sbb.boundedContext.member.service;

import com.std.sbb.base.rsData.RsData;

public class MemberService {
    private static final String correctUsername;
    private static final String correctPassword;

    static {
        correctUsername = "user1";
        correctPassword = "1234";
    }

    public RsData memberCheck(String username, String password) {
        if (correctUsername.equals(username) && correctPassword.equals(password)) {
            return RsData.of("S-1", username + "님 환영합니다.");
        } else if (!correctPassword.equals(password)) {
            return RsData.of("F-1", "비밀번호가 일치하지 않습니다.");
        } else {
            return RsData.of("F-2",  username + "(은)는 존재하지 않는 회원입니다.");
        }
    }
}
