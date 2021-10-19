package b6;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Thucpham tp = new Thucpham();
	boolean th = true;
	boolean  kt =true;
	System.out.println("Nhập mã hàng: ");
	tp.setMahang(scanner.nextInt());
	scanner.nextLine();
	do {
		System.out.println("Nhập tên hàng: ");
		tp.setTenhang(scanner.nextLine());
		
	}while (tp.kiemtraTenHang(th));
	System.out.println("Nhập đơn giá: ");
	tp.setDongia(scanner.nextDouble());
	
do {
	System.out.println("Nhập năm, tháng, ngày sản xuất: ");
	tp.setNSX(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
	System.out.println("Nhập năm, tháng, ngày Hết hạn ");
	tp.setHSD(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
	
}while (tp.kiemtrangay(kt));
System.out.println(tp);
tp.kiemtraHSD();

}
}
