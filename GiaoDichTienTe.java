package bai3;
import java.time.LocalDate;
public class GiaoDichTienTe extends GiaoDich {
	public double tiGia;
	public String loaiTien;
	public GiaoDichTienTe(int maGD, LocalDate ngayGD, int soLuong, double donGia, double tiGia,String loaiTien) {
		super(maGD,ngayGD,soLuong,donGia);
		this.tiGia = tiGia;
		this.loaiTien = loaiTien;
	}
	public double getTiGia() {
		return tiGia;
	}
	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}
	public String getLoaiTien() {
		return loaiTien;
	}
	public void setLoaiTien(String loaiTien) {
		this.loaiTien = loaiTien;
	}
	@Override 
	public double thanhTien() {
		if (loaiTien.equalsIgnoreCase("USD")||loaiTien.equalsIgnoreCase("EURO")) {
			return this.soLuong * this.donGia * this.tiGia;
		} else {
			return this.soLuong * this.donGia;
		}
	}
	@Override
	public String toString () {
		return super.toString() + "Loai Tien " + loaiTien +
				"Ti Gia" + tiGia + 
				" |Thanh Tien: " + String.format("%,.0f", thanhTien());
	}
}
