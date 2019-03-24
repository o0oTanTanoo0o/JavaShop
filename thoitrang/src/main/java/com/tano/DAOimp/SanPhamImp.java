package com.tano.DAOimp;

import java.util.List;

import com.tano.entity.NhanVien;
import com.tano.entity.SanPham;

public interface SanPhamImp {
	boolean ThemSanPham(SanPham sanpham);
	boolean SuaSanPham(SanPham sanpham);
	boolean XoaSanPham(int id);
	List<SanPham> DanhSachSanPham(int batdau, int soluong);
	SanPham ChiTietSanPham(int id);
}
