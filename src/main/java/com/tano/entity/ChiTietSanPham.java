package com.tano.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="CHITIETSANPHAM")
public class ChiTietSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int machitietsanpham; 
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "masanpham")
	SanPham masanpham;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mamau")
	MauSanPham mamau;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "masize")
	SizeSanPham sizesanpham;
		
	int soluong;
	String ngaynhap;
	public int getMachitietsanpham() {
		return machitietsanpham;
	}
	public void setMachitietsanpham(int machitietsanpham) {
		this.machitietsanpham = machitietsanpham;
	}
	public SanPham getMasanpham() {
		return masanpham;
	}
	public void setMasanpham(SanPham masanpham) {
		this.masanpham = masanpham;
	}
	public MauSanPham getMamau() {
		return mamau;
	}
	public void setMamau(MauSanPham mamau) {
		this.mamau = mamau;
	}
	public SizeSanPham getSizesanpham() {
		return sizesanpham;
	}
	public void setSizesanpham(SizeSanPham sizesanpham) {
		this.sizesanpham = sizesanpham;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public String getNgaynhap() {
		return ngaynhap;
	}
	public void setNgaynhap(String ngaynhap) {
		this.ngaynhap = ngaynhap;
	}	
}
