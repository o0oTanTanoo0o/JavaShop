package com.tano.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="NHANVIEN")
public class NhanVien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int manhanvien;
	String hoten;
	String diachi;
	String CMND;
	boolean gioitinh;
	int sodt;
	String email;	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "machucvu")	
	ChucVu chucvu;	
	
	String tendangnhap;
	String matkhau;
	
	public int getManhanvien() {
		return manhanvien;
	}
	public void setManhanvien(int manhanvien) {
		this.manhanvien = manhanvien;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getCMND() {
		return CMND;
	}
	public void setCMND(String cMND) {
		CMND = cMND;
	}
	public boolean isGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}
	public int getSodt() {
		return sodt;
	}
	public void setSodt(int sodt) {
		this.sodt = sodt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ChucVu getChucvu() {
		return chucvu;
	}
	public void setChucvu(ChucVu chucvu) {
		this.chucvu = chucvu;
	}
	public String getTendangnhap() {
		return tendangnhap;
	}
	public void setTendangnhap(String tendangnhap) {
		this.tendangnhap = tendangnhap;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	@Override
	public String toString() {
		return "NhanVien [manhanvien=" + manhanvien + ", hoten=" + hoten + ", diachi=" + diachi + ", CMND=" + CMND
				+ ", gioitinh=" + gioitinh + ", sodt=" + sodt + ", email=" + email + ", chucvu=" + chucvu
				+ ", tendangnhap=" + tendangnhap + ", matkhau=" + matkhau + "]";
	}
	
}
