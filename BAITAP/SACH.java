
public class SACH {
    String maSach;
    String tieuDe;
    String tacGia;
    int namXuatBan;
    int soLuong;

    public SACH() {

    }

    public SACH(String ms, String td, String tg, int nxb, int sl) {
        maSach = ms;
        tieuDe = td;
        tacGia = tg;
        namXuatBan = nxb;
        soLuong = sl;
    }

    public SACH(SACH s) {
        maSach = s.maSach;
        tieuDe = s.tieuDe;
        tacGia = s.tacGia;
        namXuatBan = s.namXuatBan;
        soLuong = s.soLuong;
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
        System.out.println("--------------------------");
    }
}
