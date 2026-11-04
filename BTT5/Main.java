
package BTT5;

import java.util.ArrayList;
import java.util.Scanner;

class Sach {
    String maSach;
    String tenSach;
    int soLuong;
    double donGia;

    Sach(String maSach, String tenSach, int soLuong, double donGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
}

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Sach> dsSach = new ArrayList<>();

    // BAI 1: NHAP N SACH
    public static void nhapSach() {

        System.out.print("Nhap so luong sach: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            System.out.println("\nNhap sach thu " + (i + 1));

            System.out.print("Ma sach: ");
            String ma = sc.nextLine();

            System.out.print("Ten sach: ");
            String ten = sc.nextLine();

            System.out.print("So luong: ");
            int sl = Integer.parseInt(sc.nextLine());

            System.out.print("Don gia: ");
            double gia = Double.parseDouble(sc.nextLine());

            Sach s = new Sach(ma, ten, sl, gia);
            dsSach.add(s);
        }

        System.out.println("\nNhap sach thanh cong!");
    }

    // BAI 2: THONG KE SACH
    public static void thongKe() {

        int tongSoLuong = 0;
        double tongGiaTri = 0;

        for (int i = 0; i < dsSach.size(); i++) {

            tongSoLuong += dsSach.get(i).soLuong;

            tongGiaTri += dsSach.get(i).soLuong
                        * dsSach.get(i).donGia;
        }

        System.out.println("\n===== THONG KE SACH =====");

        System.out.println("Tong so luong sach: " + tongSoLuong);

        System.out.printf("Tong gia tri sach: %,.0f VND\n", tongGiaTri);
    }

    // BAI 4: TIM SACH THEO MA
    public static void timSach() {

        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();

        boolean timThay = false;

        for (int i = 0; i < dsSach.size(); i++) {

            if (dsSach.get(i).maSach.equalsIgnoreCase(ma)) {

                System.out.println("\n===== THONG TIN SACH =====");

                System.out.println("Ma sach: " + dsSach.get(i).maSach);
                System.out.println("Ten sach: " + dsSach.get(i).tenSach);
                System.out.println("So luong: " + dsSach.get(i).soLuong);
                System.out.println("Don gia: " + dsSach.get(i).donGia);

                timThay = true;
                break;
            }
        }

        if (timThay == false) {
            System.out.println("Khong tim thay sach!");
        }
    }

    // BAI 3: MENU LAP DEN KHI CHON THOAT
    public static void main(String[] args) {

        int chon;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Nhap sach");
            System.out.println("2. Thong ke sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Thoat");
            System.out.println("==========================");

            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {

                case 1:
                    nhapSach();
                    break;

                case 2:
                    thongKe();
                    break;

                case 3:
                    timSach();
                    break;

                case 4:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 4);

        sc.close();
    }
}
