package com.tano.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tano.DAO.SanPhamDAO;
import com.tano.DAOimp.SanPhamImp;
import com.tano.entity.SanPham;

@Service
public class SanPhamService implements SanPhamImp{
	@Autowired
	SanPhamDAO sanPhamDao;

	public boolean ThemSanPham(SanPham sanpham) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean SuaSanPham(SanPham sanpham) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean XoaSanPham(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<SanPham> DanhSachSanPham(int batdau, int soluong) {
		return sanPhamDao.DanhSachSanPham(batdau, soluong);
	}

	public SanPham ChiTietSanPham(int id) {
		return sanPhamDao.ChiTietSanPham(id);
	}
}
