package com.example.contentservice.web.session;

import com.example.contentservice.domain.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import javax.servlet.http.HttpServletResponse;

import static org.assertj.core.api.Assertions.*;

class SessionManagerTest {
    SessionManager sessionManager = new SessionManager();

    @Test
    void sessionTest() {

        MockHttpServletResponse response = new MockHttpServletResponse(); // Spring에서는 테스트를 위해 임의의 HttpServletResponse를 제공해줌

        //세션 생성
        Member member = new Member();
        sessionManager.createSession(member, response);

        //요청에 응답 쿠키가 저장되었는지 확인
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setCookies(response.getCookies()); //mySessionId = aslkn13-12elnad...

        //세션 조회
        Object result = sessionManager.getSession(request);
        assertThat(result).isEqualTo(member);

        //세션 만료
        sessionManager.expire(request);
        Object expired = sessionManager.getSession(request);
        assertThat(expired).isNull();

    }
}
