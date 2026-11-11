import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        SACH s1 = new SACH();

        s1.maSach = "S01";
        s1.tieuDe = "Lap trinh Java";
        s1.tacGia = "Nguyen Van A";
        s1.namXuatBan = 2024;
        s1.soLuong = 10;

        SACH s2 = new SACH("S02", "Lap trinh C",
                "Nguyen Van B", 2023, 20);

        SACH s3 = new SACH(s1);

        ArrayList<SACH> dsSach = new ArrayList<SACH>();

        dsSach.add(s1);
        dsSach.add(s2);
        dsSach.add(s3);

        System.out.println("DANH SACH SACH TRONG THU VIEN");

        for (int i = 0; i < dsSach.size(); i++) {
            dsSach.get(i).hienThiThongTin();
        }
    }
}