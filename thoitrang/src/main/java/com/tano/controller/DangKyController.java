package com.tano.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tano.common.Common;
import com.tano.entity.NhanVien;
import com.tano.service.NhanVienService;

@Controller
@RequestMapping("/dangky")
public class DangKyController {
	
	@Autowired
	Common common;
	
	@Autowired
	NhanVienService nhanVienService;
	
	@GetMapping
	public String DangKy() {
		return "DangKy";
	}
	
	@PostMapping
	public String DangKy(@RequestParam String tendangnhap,@RequestParam String email,
			@RequestParam String matkhau, @RequestParam String matkhau1, ModelMap model, 
			HttpServletResponse response) throws IOException {
		String kiemTra = "";
		if(tendangnhap=="" || email=="" || matkhau=="" || matkhau1=="")
		{
			kiemTra = "Không bỏ trống dữ liệu!";
		}else if(nhanVienService.KiemTraTaiKhoanTonTai(tendangnhap)) {
			kiemTra = "Tài khoản đã tồn tại";
		}else if(!common.checkEmail(email)) {
			kiemTra = "Sai định dạng email rồi";
		}else  if(!matkhau.equals(matkhau1)) {
			kiemTra = "Mật khẩu không trùng nhau!";
		}else{			
			NhanVien nhanvien = new NhanVien();
			nhanvien.setTendangnhap(tendangnhap);
			nhanvien.setEmail(email);
			nhanvien.setMatkhau(matkhau);
			if(nhanVienService.ThemNhanVien(nhanvien)) {
				response.sendRedirect("/thoitrang/dangnhap");
				return "";
			}					
		}
		model.addAttribute("KiemTraDangKy", kiemTra);
		return "DangKy";
	}
}
