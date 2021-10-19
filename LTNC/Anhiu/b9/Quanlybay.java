package b9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Quanlybay {
	static Scanner input = new Scanner(System.in);
public static void main(String[] args) {
	
	List<Vemaybay> list = new ArrayList<>();
	int choose;
	do {
		ShowMenu();
		choose = input.nextInt();
		switch(choose) {
		case 1:
			input(list);
			break;
		case 2:
			save(list, "Dulieubay.dat");
			break;
		case 3:
		list =   read("Dulieubay.dat");
			break;
		case 4:
			sort(list);
			break;
		case 5:
			saveByAirLine(list);
			break;
		case 6:
			System.out.println("Thoat!!");
			break;
			default:
				System.out.println("Input failled!");
				break;
		}
		}while (choose != 6);
	
}
	 static List<Vemaybay> read(String filename) {
		List<Vemaybay> list = new ArrayList<>();
FileInputStream fis = null;
ObjectInputStream ois = null;
try {
	fis = new FileInputStream(filename);
	ois = new ObjectInputStream(fis);
	
	list = (List<Vemaybay>) ois.readObject();
} catch (Exception e) {
	e.printStackTrace();
} finally {
	if ( fis != null) {
		try {
			fis.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
}
	if (ois != null) {
		try {
			ois.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
return list;
}
	static void input(List<Vemaybay> list) {
		System.out.println("Nhap so ve may bay:");
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			Vemaybay vemaybay = new Vemaybay();
			vemaybay.input();
			list.add(vemaybay);
			
		}
	}
	static void save(List<Vemaybay> list, String filename) {
		FileOutputStream fos = null;
				ObjectOutputStream  oos = null;
				
				try {
					 fos = new FileOutputStream(filename);
					 oos = new ObjectOutputStream(fos);
					 oos.writeObject(list);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if ( fos != null) {
						try {
							fos.close();
						} catch (Exception e2) {
							e2.printStackTrace();
						}
				}
					if (oos != null) {
						try {
							oos.close();
						} catch (Exception e2) {
							e2.printStackTrace();
						}
					}
				}
				
			
				
	}
	static void sort(List<Vemaybay> list) {
		Collections.sort(list , new Comparator<Vemaybay>() {

			@Override
			public int compare(Vemaybay o1, Vemaybay o2) {
							if (o1.getPrice() < o2.getPrice()) {
								 return -1;
							}
							return 1;
			}
		});
		for (int i = 0; i < list.size(); i++) {
			list.get(i).display();
			
		}
		
	}
	static void saveByAirLine(List<Vemaybay> list) {
		List<Vemaybay> VietjetAirlist = getAirLine(list, "VJ");
		save(VietjetAirlist, "VietjetAirline.dat");
		
		List<Vemaybay> VietnamAirlist = getAirLine(list, "VN");
		save(VietjetAirlist, "VietnamAirline.dat");
		
		List<Vemaybay> Jetstarlist = getAirLine(list, "JET");
		save(VietjetAirlist, "Jetsatrline.dat");
		
		
	}
	static List<Vemaybay> getAirLine(List<Vemaybay> list, String prex){//tien to
		List<Vemaybay> airLinelist = new ArrayList<>();
		for (Vemaybay vemaybay : list) {
			if (vemaybay.getId().startsWith(prex)) {
				airLinelist.add(vemaybay);
			}
			
		}
		return airLinelist;
		
	}
static void ShowMenu() {
	System.out.println("1.Nhap thong tin cho n chuyen bay: ");
	System.out.println("2.Luu thong tin:");
	System.out.println("3.Doc thong tin tu file va hien thi");
	System.out.println("4.Sap xep theo gia");
	System.out.println("5.In thong tin moi hang bay ra mot file");
	System.out.println("6.Thoat");
	System.out.println("Choose");
}
}
