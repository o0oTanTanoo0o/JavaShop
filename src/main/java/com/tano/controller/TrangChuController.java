package com.tano.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tano.entity.SanPham;
import com.tano.service.SanPhamService;


@Controller
@RequestMapping("/")
public class TrangChuController {

	@Autowired
	SanPhamService sanPhamService;
	
//	@Autowired
//	org.hibernate.SessionFactory sessionFactory;
//	
//	@GetMapping
//	@Transactional
//	public String Index() {
//		Session session = sessionFactory.getCurrentSession();
//		SanPham sanpham = new SanPham();
//		sanpham.setTenSanPham("Ga ran");
//		sanpham.setGiaTien("1000");
//		
//		NhanVien nhanvien = new NhanVien();
//		nhanvien.setTenNhanVien("TNT");
//		nhanvien.setTuoi(19);
//		sanpham.setNhanVien(nhanvien);
//		session.save(sanpham);
//		
//		return "trang-chu";
//	}
//	
//	@PostMapping
//	@Transactional
//	public String ThemNhanVien(@RequestParam String tenNhanVien, @RequestParam int tuoi) {
//		Session session = sessionFactory.getCurrentSession();
//		NhanVien nv = new NhanVien();
//		nv.setTenNhanVien(tenNhanVien);
//		nv.setTuoi(tuoi);
//		session.save(nv);
//		return "trang-chu";
//	}
//	
	@GetMapping
	public String TrangChu(HttpSession httpSession, ModelMap model) {
		List<SanPham> danhSachSanPham = sanPhamService.DanhSachSanPham(0, 20);
		model.addAttribute("sessionDangNhap", httpSession.getAttribute("user"));
		model.addAttribute("danhsachsanpham", danhSachSanPham);
		System.out.println(danhSachSanPham.toString());
		return "trang-chu";
	}
}
