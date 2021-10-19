package b5;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
static Scanner sc = new Scanner(System.in);
static void nhapTK(Account tk) {
	System.out.println("Nhập số tài khoản: ");
	tk.setStk(sc.nextInt());
	sc.nextLine();
	System.out.println("Tên tài khoản: ");
	tk.setTenTK(sc.nextLine());
	tk.setSotientrongTK(50);
}

public static void main(String[] args) {
	Account a[] = null;
	int k, b, n = 0;
	long s, d, c, f;
	boolean flag = true;
	do {
		System.out.println("Bạn chọn làm gì :");
		System.out.println("1. Nhập thông tin khách hàng\n"+
		"2. Xuất danh sách thông tin của khách hàng\n"+"3.Nạp tiền\n "+"4.Rút tiền: \n"+"5.Đáo hạn\n"+"6.Chuyển khoản \n"+"số khác để thoát");
		b = sc.nextInt();
		switch (b) {
		case 1:
			System.out.println("Nhập số lượng khách hàng muốn nhập:");
			n =sc.nextInt();
			a = new Account[n];
			for (int i= 0; i < n ; i++) {
				System.out.println("Khách hàng số" +(i+1));
				a[i] = new Account();
				nhapTK(a[i]);
				
			}
			break;
		case 2:
			System.out.printf("%-10s %-20 %-20\n", "Số TK", "Tên TK", "Số tiền trong tài khoản");
			for (int i = 0; i<n ; i++) {
				a[i].inTK();
				
			}
			break;
		case 3:
			 System.out.println("Nhập số tài khoản khách hàng cần nạp tiền:");
			 s = sc.nextLong();
			 for (int i= 0; i< n; i++) {
				 d = a[i].getStk();
				 if (s == d ) {
					 System.out.println("Bạn chọn tài khoản "+d);
					 a[i].naptien();
				 }else {
					 System.out.println("");
					 
				 }
			 }
			 break;
		case 4:
			 System.out.println("Nhập số tài khoản khách hàng cần rút tiền:");
			 s = sc.nextLong();
			 for (int i=0 ; i< n; i++) {
				 d = a[i].getStk();
				 if (s == d) {
					 System.out.println("Bạn chọn tài khoản" +d);
					 a[i].ruttien();
					 
				 }else {
					 System.out.println("");
				 }
			 }
break;
		case 5:
			 System.out.println("Nhập số tài khoản khách hàng cần đáo hạn:");
			 s = sc.nextLong();
			 for (int i= 0 ; i<n; i++) {
				 d = a[i].getStk();
				 if (s == d) {
					 System.out.println("Bạn chọn tài khoản" +d);
					 a[i].daohanB();
					 
				 }else {
					 System.out.println("");
				 }
			 }
			break;
		case 6 :
			double chuyen, nhan, tienchuyen;
			System.out.println("Nhập số tài khoản khách hàng cần chuyển tiền: ");
			s =sc.nextLong();
			System.out.println("Nhập số tài khoản cần nhận tiền");
			c =sc.nextLong();
			for (int i = 0; i< n ;i++) {
				d = a[i].getStk();
				if (s == d ) {
					chuyen = a[i].getSotientrongTK();
					for (int j = 0; j<n; j++) {
						f = a[j].getStk();
						if (c == f) {
							nhan = a[j].getSotientrongTK();
							System.out.println("Nhập số tiền cần chuyển");
							tienchuyen = sc.nextDouble();
							if (tienchuyen <= chuyen) {
								chuyen = chuyen - tienchuyen;
								nhan = nhan+tienchuyen;
								a[i].setSotientrongTK(chuyen);
								a[j].setSotientrongTK(nhan);
								System.out.println("Tài khoản số"+d+"vừa chuyển: $"+tienchuyen);
								System.out.println("Số tài khoản" +f +"vừa nhận:$" + tienchuyen);
								
							}else {
								System.out.println("Số tiền nhập khôn hợp lế !");
								
							}
							
						}else {
							System.out.println("");
						}
								
								
					}
				
				}else {
					System.out.println("");
				}
					
				}
			break;
			default:
				System.out.println("Bye  !!");
				flag = false;
				break;
			}
			
}while (flag);
}
}