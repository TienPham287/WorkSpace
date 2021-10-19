package LTNC1;

import java.util.Scanner;

public class bai8 {
private static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Nhập hệ số bậc 2,a = ");
	float a = scanner.nextFloat();
	System.out.println("Nhâp hệ số bậc 1, b=");
	float b = scanner.nextFloat();
	System.out.println("Nhập hện số tự do, c =");
	float c= scanner.nextFloat();
	giaiPTbac2(a, b, c);
}
public static void giaiPTbac2(float a, float b, float c){ 
	if (a==0) {
		if (b==0) {
			System.out.println("Phương trình vô nghiệm !");
		} else {
				System.out.println("Phương trình có một nghiệm :"+"x="+(-c/b));
				
			}
		return;
		
		}
	//tính delta
	float delta = b*b - 4*a*c;
	float x1;
	float x2;
	//tính nghiệm
	if (delta > 0) {
		x1 = (float) ((-b + Math.sqrt(delta))/(2*a));
		x2 = (float) ((-b -Math.sqrt(delta))/(2*a));
				System.out.println("Phương trình có 2 ngiệm là:"+"x1 = "+x1+"va x2="+x2);
	}else if (delta== 0) {
		x1 = (-b/(2*a));
		System.out.println("Phương trình có nghiệm kép là:"+"x1=x2="+x1);
	}else {
		System.out.println("Phương trình vô nghiệm !");
				
				
				
			
	}
}
}
