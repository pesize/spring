package com.spring_mvc.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController {
	
	//루트로 서비스 요청
	@RequestMapping("/")
	public String home() {
		return "home";//뷰페이지 이름 변환:newView.jsp
	}
	
	
	
	//서비스 요청처리
	//url매핑:/newView
	@RequestMapping("/newView")
	public String newView() {
		return "new/newView";//뷰페이지 이름 변환:newView.jsp
	}
}
