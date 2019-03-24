package com.tano.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="DANHMUCSANPHAM")
public class DanhMucSanPham {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int madanhmuc;
	String tendanhmuc;
	String hinhdanhmuc;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "madanhmuc")
	Set<SanPham> danhSachSanPham;
	
	public int getMadanhmuc() {
		return madanhmuc;
	}
	public void setMadanhmuc(int madanhmuc) {
		this.madanhmuc = madanhmuc;
	}
	public String getTendanhmuc() {
		return tendanhmuc;
	}
	public void setTendanhmuc(String tendanhmuc) {
		this.tendanhmuc = tendanhmuc;
	}
	public String getHinhdanhmuc() {
		return hinhdanhmuc;
	}
	public void setHinhdanhmuc(String hinhdanhmuc) {
		this.hinhdanhmuc = hinhdanhmuc;
	}
	@Override
	public String toString() {
		return "DanhMucSanPham [madanhmuc=" + madanhmuc + ", tendanhmuc=" + tendanhmuc + ", hinhdanhmuc=" + hinhdanhmuc
				+ "]";
	}
	public Set<SanPham> getDanhSachSanPham() {
		return danhSachSanPham;
	}
	public void setDanhSachSanPham(Set<SanPham> danhSachSanPham) {
		this.danhSachSanPham = danhSachSanPham;
	}
}
