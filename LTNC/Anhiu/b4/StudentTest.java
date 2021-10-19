package b4;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
public static void main(String[] args) {
	ArrayList<Student> studentList = new ArrayList<>();
	int choose;
	Scanner scan = new Scanner(System.in);
	do {
		showMenu();
		System.out.println("Choose: ");
		choose = Integer.parseInt(scan.nextLine());
	switch(choose) {
	case 1 :
		int n;
		System.out.println("Nhap so sinh vien can them:");
		n =  Integer.parseInt(scan.nextLine());
		for (int i=0; i< n; i++) {
			Student std = new Student();
			std.inputInfor(); 
		}

		
		break;
case 2 :
		
		break;
case 3 :
	
	break;
case 4 :
	
	break;
case 5 :
	
	break;
case 6 :
	
	break;
case 7 :
	
	break;
	default:
		 System.err.println("Nhap sai ");
	}
	}while (choose != 7);
		
	
}
	
static void showMenu() {
	System.out.println("1: Nhap vao n sinh vien");
	System.out.println("2: Hien thi thong tin sinh vien");
	System.out.println("3: Hien thi max va min theo diem trung binh ");
	System.out.println("4: Tim kiem theo ma sinh vien ");
	System.out.println("5: sort a->Z theo ten sinh vieen va hien thi ");
	System.out.println("6: Hien thi sinh vien theo duoc hoc bong & sort diem theo thu tu giam dan");
	System.out.println("7: Thoat");
}
}
