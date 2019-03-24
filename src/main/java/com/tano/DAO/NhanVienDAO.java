package com.tano.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tano.DAOimp.NhanVienImp;
import com.tano.entity.NhanVien;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class NhanVienDAO implements NhanVienImp {
	
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public boolean KiemTraDangNhap(String tendangnhap, String matkhau) {
		Session session = sessionFactory.getCurrentSession();
		try {
			NhanVien nhanVien =  (NhanVien) session.createQuery("from NHANVIEN where tendangnhap='"+ tendangnhap +"' and matkhau='"+ matkhau +"'").getSingleResult();
			if(nhanVien != null) {
				return true;
			}
			return false;
		} catch (Exception e) {
			System.out.print(e);
			return false;
		}
	}
	@Transactional
	public boolean ThemNhanVien(NhanVien nhanvien) {
		try {
			Session session = sessionFactory.getCurrentSession();
			int maNhanVien = (Integer) session.save(nhanvien);
			if(maNhanVien>0)
				return true;
			return false;
		} catch (Exception e) {
			System.out.print("Thêm nhân viên lỗi" + e);
			return false;
		}
		
	}
	
	@Transactional
	public boolean KiemTraTaiKhoanTonTai(String tennhanvien) {
		Session session = sessionFactory.getCurrentSession();
		try {
			NhanVien nhanVien = (NhanVien) session.createQuery("from NHANVIEN where tendangnhap='"+ tennhanvien +"'").getSingleResult();
			if(nhanVien!=null){
				return true;
			}
			return false;
		} catch (Exception e) {
			System.out.print("Kiểm tra tồn tại nhân viên lỗi! "+ e);
			return false;
		}
	}
	
	
	@Transactional
	public NhanVien LayNhanVienQuaTen(String tennhanvien) {
		Session session = sessionFactory.getCurrentSession();
		try {
			NhanVien nhanVien = (NhanVien) session.createQuery("from NHANVIEN where tendangnhap='"+ tennhanvien +"'").getSingleResult();
			if(nhanVien!=null){
				return nhanVien;
			}
			return null;
		} catch (Exception e) {
			System.out.print("Lấy nhân viên qua tên lỗi rồi: "+ e);
			return null;
		}
	}
	
}
