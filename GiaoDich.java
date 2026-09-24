package bai3;
import java.time.LocalDate;
public class GiaoDich {
	public int maGD;
	public LocalDate ngayGD;
	public int soLuong;
	public double donGia;
	
	public GiaoDich(int maGD, LocalDate ngayGD, int soLuong, double donGia) {
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}
	
	public int getMaGD() {
		return maGD;
	}
	public void setMaGD(int maGD) {
		this.maGD = maGD;
	}
	public LocalDate getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double thanhTien(){
		return 0;
	}
	@Override 
	public String toString() {
		return "Ma Giao Dich: " + maGD + "|Ngay Giao Dich: " + ngayGD + "|So luong" + soLuong + 
				"DonGia" + String.format("%,.0f", donGia);
	}
}
