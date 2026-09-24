package bai3;
import java.time.LocalDate;
public class GiaoDichVang extends GiaoDich {
	public String loaiVang;
	
	public GiaoDichVang(int maGD, LocalDate ngayGD, int soLuong, double donGia, String loaiVang) {
		super(maGD, ngayGD, soLuong, donGia); // super dung de goi lai constructor cua lớp cha
		this.loaiVang = loaiVang;
	}
	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}
	@Override
	public double thanhTien() {
		return this.soLuong * this.donGia;
	}
	
	@Override
	public String toString () {
		return super.toString() + "Loai Vang: " + loaiVang +
				" |Thanh Tien: " + String.format("%,.0f", thanhTien());
	}
}
