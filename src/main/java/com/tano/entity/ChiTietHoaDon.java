package com.tano.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "CHITIETHOADON")
public class ChiTietHoaDon {
	@EmbeddedId
	ChiTietHoaDonId chitiethoadonid;
	
	int soluong;
	int giatien;

	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public int getGiatien() {
		return giatien;
	}
	public void setGiatien(int giatien) {
		this.giatien = giatien;
	}
	public ChiTietHoaDonId getChitiethoadonid() {
		return chitiethoadonid;
	}
	public void setChitiethoadonid(ChiTietHoaDonId chitiethoadonid) {
		this.chitiethoadonid = chitiethoadonid;
	}
	
}
