package com.tano.DAOimp;

import com.tano.entity.NhanVien;

public interface NhanVienImp {
	boolean KiemTraDangNhap(String tendangnhap, String matkhau);
	boolean ThemNhanVien(NhanVien nhanvien);
}
