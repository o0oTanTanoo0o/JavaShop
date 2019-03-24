package com.tano.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tano.service.NhanVienService;

@Controller
@RequestMapping("api/")
@SessionAttributes("user")
public class ApiController {
	@Autowired
	NhanVienService nhanVienService; 
	
	@GetMapping("KiemTraDangNhap")
	@ResponseBody
	public String KiemTraDangNhap(@RequestParam String tendangnhap, @RequestParam String matkhau, ModelMap model) {
		Boolean result = nhanVienService.KiemTraDangNhap(tendangnhap, matkhau);
		if(result==true)
			model.addAttribute("user",tendangnhap);
		return result +"";
	}
	
}
