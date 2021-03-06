package com.tano.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tano.DAO.SanPhamDAO;
import com.tano.entity.SanPham;

@Controller
@RequestMapping("/chitiet")
public class ChiTietController {

	@Autowired
	SanPhamDAO sanphamdao;
	
	@GetMapping("/{id}")
	public String ChiTiet(@PathVariable String id, ModelMap model) {
		SanPham sanpham = sanphamdao.ChiTietSanPham(Integer.parseInt(id));
		model.addAttribute("sanpham", sanpham);
		return "ChiTietSanPham";
	}
}
