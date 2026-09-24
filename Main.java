package bai3;
import java.util.ArrayList;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ArrayList<GiaoDich> dsGiaoDich = new ArrayList<>();
        
        // giao dich vang
        dsGiaoDich.add(new GiaoDichVang(101, LocalDate.of(2026, 9, 24),10, 8000000, "SJC"));
        dsGiaoDich.add(new GiaoDichVang(102, LocalDate.of(2026, 9, 25),10, 12000000, "9999"));
        dsGiaoDich.add(new GiaoDichVang(103, LocalDate.of(2026, 9, 25),10, 7500000, "PNJ"));
        
        // giao dich tien te
        dsGiaoDich.add(new GiaoDichTienTe(104, LocalDate.of(2026, 1, 12), 10, 500000, 25000, "USD"));
        dsGiaoDich.add(new GiaoDichTienTe(105, LocalDate.of(2026, 2, 18), 10, 1000000, 1, "VN"));
        dsGiaoDich.add(new GiaoDichTienTe(108, LocalDate.of(2026, 3, 22), 20, 300000, 27000, "Euro"));

        // tinh tong so luong cho tung loai
        int tongSoLuongVang = 0;
        int tongSoLuongTienTe = 0;

        for (GiaoDich gd : dsGiaoDich) {
            if (gd instanceof GiaoDichVang) {
                tongSoLuongVang += gd.getSoLuong();
            } else if (gd instanceof GiaoDichTienTe) {
                tongSoLuongTienTe += gd.getSoLuong();
            }
        }

        System.out.println("Tổng số lượng giao dịch vàng: " + tongSoLuongVang);
        System.out.println("Tổng số lượng giao dịch tiền tệ: " + tongSoLuongTienTe);
        
        double tongThanhTienTienTe = 0;
        int demTienTe = 0;

        for (GiaoDich gd : dsGiaoDich) {
            if (gd instanceof GiaoDichTienTe) {
                tongThanhTienTienTe += gd.thanhTien();
                demTienTe++;
            }
        }

        double trungBinhTienTe = (demTienTe > 0) ? (tongThanhTienTienTe / demTienTe) : 0;
        System.out.println("Trung bình thành tiền: " + String.format("%,.2f", trungBinhTienTe) + " VNĐ");
        
        System.out.println("\n=== DANH SÁCH GIAO DỊCH CÓ ĐƠN GIÁ > 1 TỶ ===");
        double motTy = 1_000_000_000.0;
        
        for (GiaoDich gd : dsGiaoDich) {
            if (gd.getDonGia() > motTy) {
                System.out.println(gd);
            }
        }
    } 
}