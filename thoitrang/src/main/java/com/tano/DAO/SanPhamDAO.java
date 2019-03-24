package com.tano.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tano.DAOimp.SanPhamImp;
import com.tano.entity.ChiTietSanPham;
import com.tano.entity.SanPham;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SanPhamDAO implements SanPhamImp{

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public boolean ThemSanPham(SanPham sanpham) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean SuaSanPham(SanPham sanpham) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean XoaSanPham(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public List<SanPham> DanhSachSanPham(int batdau, int soluong) {
		Session session = sessionFactory.getCurrentSession();
		List<SanPham> danhSachSanPham = (List<SanPham>)session.createQuery("from SANPHAM").setFirstResult(batdau).setMaxResults(soluong).getResultList();		
		return danhSachSanPham;
	}
	@Transactional
	public SanPham ChiTietSanPham(int id) {
		Session session = sessionFactory.getCurrentSession();
		try {
			SanPham sanpham = (SanPham) session.createQuery("from SANPHAM where masanpham=" + id).getSingleResult();		
			return sanpham;
		} catch (Exception e) {
			System.out.print("Loi chi tiet san pham, loi la: " + e);
			return null;
		}				
	}

	
}
