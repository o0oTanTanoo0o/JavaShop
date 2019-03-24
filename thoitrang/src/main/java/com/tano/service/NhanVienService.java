package com.tano.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tano.DAO.NhanVienDAO;
import com.tano.DAOimp.NhanVienImp;
import com.tano.entity.NhanVien;

@Service
public class NhanVienService implements NhanVienImp{

	@Autowired
	NhanVienDAO nhanVienDao;

	public boolean KiemTraDangNhap(String tendangnhap, String matkhau) {
		return nhanVienDao.KiemTraDangNhap(tendangnhap, matkhau);
	}

	public boolean ThemNhanVien(NhanVien nhanvien) {
		return nhanVienDao.ThemNhanVien(nhanvien);
	}
	
	public NhanVien LayNhanVienQuaTen(String tennhanvien) {
		return nhanVienDao.LayNhanVienQuaTen(tennhanvien);
	}
	
	public boolean KiemTraTaiKhoanTonTai(String tennhanvien) {
		return nhanVienDao.KiemTraTaiKhoanTonTai(tennhanvien);
	}
	
}
