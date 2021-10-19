
package LTNC1;

import java.util.Scanner;

public class Bai6 {
	

public static void main(String[] args) {
	int n, temp, max =100, k, c, d, l;
	Scanner scanner= new Scanner(System.in) ;
	int array[] = new int[max];
	do {
		System.out.println("Nhap so phan tu cua mang");
		n = scanner.nextInt();
		
	}while (n <= 0 || n >= max-1);
	System.out.println("Nhap gia trị cho các phần tử của mảng");
	for (int i=0; i<n; i++) {
	System.out.println("array["+i+ "]=");
	array[i] = scanner.nextInt();

}
	for (int i=0; i<n-1; i++) {
		for (int j = i+1; j<n-1; j++) {
			if (array[j] < array[i]) {
				temp = array[i];
				array[i]= array[j];
				array[j]= temp;
				
			}
		
		}
	}
	System.out.println("Nhap số nguyên càn tìm:");
	k = scanner.nextInt();
	d=0;
	c=n-1;
	while (d<=c) {
		l =(d+c)/2;
		if (array[l] == k) {
			System.out.println("Tìm thấy phần tử " +k+"Tại vị trí"+l);
			return;
		}else if (array[l] < k) {
			d = l +1;
			
		}else {
			c = l -1;
		}
	}
	
	System.out.println("Trong mảng không có phần tử nào chứa giá trị cần tìm");
}
}
