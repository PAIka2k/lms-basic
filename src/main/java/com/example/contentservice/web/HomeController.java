package com.example.contentservice.web;

import com.example.contentservice.domain.member.Member;
import com.example.contentservice.domain.member.MemberRepository;
import com.example.contentservice.web.session.SessionManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final MemberRepository memberRepository;
    private final SessionManager sessionManager;


    @GetMapping("/")
    public String homeLogin(HttpServletRequest request, Model model) {

        //세션 관리자에 저장된 회원 정보 조회
        Member member = (Member) sessionManager.getSession(request);

        // 로그인 성공
        if (member == null) {
            return "home";
        }

        model.addAttribute("member", member);
        return "loginHome"; // 로그인 사용자 전용 Home

    }

}
