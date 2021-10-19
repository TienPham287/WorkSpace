package b4;

import java.util.Scanner;

public class Student extends Person{
String rollNo;
float mark;
String email;
public Student() {
	
}
@Override
	public void inputInfor() {
		super.inputInfor();
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap sinh vien :");
		while (true) {
			String rollNoinput = input.nextLine();
			boolean check = setRollNo(rollNo);
			if (check) {
				break;
				
			}
		}//code ngan 
		// while (!setRollNo(input.nextLine());
		System.out.println("Nhap lai diem sinh vien :");
		while (true) {
			float markinput = Float.parseFloat(input.nextLine());
			boolean check = setMark(markinput);
			if (check) {
				break;
			}
		}
		System.out.println("Nhap email sin vien :");
		while (true) {
			//nhap vao dia chi email
			String  emailInput = input.nextLine();
			//chuyen dia chi email voa thuoc tinh 
			boolean check = setEmail(emailInput);
			if (check) {
				break;
			}
		}
	}
public String getRollNo() {
	return rollNo;
}
public boolean setRollNo(String rollNo) {
	if (rollNo != null && rollNo.length()== 8) {
		this.rollNo = rollNo;
		return true;
	}else {
		System.out.println("Nhap lai ma sinh vien do dai 8 ki tu");
		return false;
	}
	
}
public float getMark() {
	return mark;
}
public boolean setMark(float mark) {
	if (mark <=0 && mark >= 10) {
		this.mark = mark;
		return true;
	}else {
		System.out.println("Nhap lai diem (diem lon hon 0 va nho hon 10 ");
		return false;
	}
	
}
public String getEmail() {
	return email;
}
public boolean setEmail(String email) {
	if (email != null && email.contains("@")&& !email.contains("")) {
		this.email = email;
		return true;
	}else {
		System.out.println("Nhap lai email");
		return false;
	}
	
}
public boolean checkScholarship() {
	if (mark >=8) {
		return true;
	}
	return false;
}

}
