package com.tano.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="SANPHAM")
public class SanPham {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int masanpham;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "madanhmuc")
	DanhMucSanPham danhmucsanpham;
	
	String tensanpham; 
	String giatien; 
	String mota; 
	String hinhsanpham;
	String hinhsanpham1;
	String hinhsanpham2;
	String danhcho;
	
	@OneToMany(cascade = CascadeType.ALL, fetch= FetchType.LAZY)
	@JoinColumn(name = "masanpham")
	Set<ChiTietSanPham> chitietsanpham;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="CHITIETKHUYENMAI",
	joinColumns = {@JoinColumn(name="masanpham", referencedColumnName = "masanpham")},
	inverseJoinColumns = {@JoinColumn(name = "makhuyenmai", referencedColumnName = "makhuyenmai")})
	Set<KhuyenMai> danhsachkhuyenmai;
	
	public String getHinhsanpham1() {
		return hinhsanpham1;
	}
	public void setHinhsanpham1(String hinhsanpham1) {
		this.hinhsanpham1 = hinhsanpham1;
	}
	public String getHinhsanpham2() {
		return hinhsanpham2;
	}
	public void setHinhsanpham2(String hinhsanpham2) {
		this.hinhsanpham2 = hinhsanpham2;
	}
	public String getDanhcho() {
		return danhcho;
	}
	public void setDanhcho(String danhcho) {
		this.danhcho = danhcho;
	}
	public Set<ChiTietSanPham> getChitietsanpham() {
		return chitietsanpham;
	}
	public void setChitietsanpham(Set<ChiTietSanPham> chitietsanpham) {
		this.chitietsanpham = chitietsanpham;
	}
	public Set<KhuyenMai> getDanhsachkhuyenmai() {
		return danhsachkhuyenmai;
	}
	public void setDanhsachkhuyenmai(Set<KhuyenMai> danhsachkhuyenmai) {
		this.danhsachkhuyenmai = danhsachkhuyenmai;
	}
	public int getMasanpham() {
		return masanpham;
	}
	public void setMasanpham(int masanpham) {
		this.masanpham = masanpham;
	}
	public DanhMucSanPham getDanhmucsanpham() {
		return danhmucsanpham;
	}
	public void setDanhmucsanpham(DanhMucSanPham danhmucsanpham) {
		this.danhmucsanpham = danhmucsanpham;
	}
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	public String getGiatien() {
		return giatien;
	}
	public void setGiatien(String giatien) {
		this.giatien = giatien;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public String getHinhsanpham() {
		return hinhsanpham;
	}
	public void setHinhsanpham(String hinhsanpham) {
		this.hinhsanpham = hinhsanpham;
	}	
}
