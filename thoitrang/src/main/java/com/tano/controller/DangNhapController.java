package com.tano.controller;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@RequestMapping("/dangnhap")
public class DangNhapController {

	
	@GetMapping
	public String DangNhap() {
		return "DangNhap";
	}
	
	@GetMapping("/dangxuat")
	public void DangXuat(HttpSession httpSession, HttpServletResponse response) throws IOException {
		httpSession.setAttribute("user", null);
		response.sendRedirect("/thoitrang/");
	}

}
