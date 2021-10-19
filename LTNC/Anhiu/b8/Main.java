package b8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	List<Student> studentList = new ArrayList<>();
	int choose;
	Scanner input = new Scanner(System.in);
	do {
		showMenu();
		choose = Integer.parseInt(input.nextLine());//Doc du lieu
	switch (choose) {
	case 1:
		System.out.println("Nhap so sinh vien can them");
		int n = Integer.parseInt(input.nextLine());
		for (int i = 0; i< n; i++) {
			Student std = new Student();
			std.input();
			studentList.add(std);
		}
		break;
case 2:
	System.out.println("Nhap id sinh vien can sua");
	int id = Integer.parseInt(System.console().readLine());
	for (int i =0; i< studentList.size(); i++) {
		if (studentList.get(i).getId() == id) {
			studentList.get(i).Edit();
		}
	}
		
		break;
case 3:
	System.out.println("Nhap id sinh vien can xoa");
	int deleteid = Integer.parseInt(System.console().readLine());
	for (int i =0; i< studentList.size(); i++) {
		if (studentList.get(i).getId() == deleteid) {
			studentList.remove(i);
	break;
		}
	}
case 4:
	Collections.sort(studentList, new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			if (o1.getGpa() < o2.getGpa()) return -1;
	
			return 1;
		}
	});
	for (int i = 0; i< studentList.size(); i++) {
		studentList.get(i).display();
	}
	break;
case 5:
	Collections.sort(studentList,  (o1, o2) -> o1.getName().compareTo(o2.getName()));
//	Collections.sort(studentList, new Comparator<Student>() {
//
//		@Override
//		public int compare(Student o1, Student o2) {
//			
//			return o1.getName().compareTo(o2.getName());
//		}
//	});
	break;
case 6:
	for (int i = 0; i< studentList.size(); i++) {
		studentList.get(i).display();
	}
	break;
case 7:
	FileOutputStream fos =null;
	ObjectOutputStream oos= null;
	
	try {
		fos = new FileOutputStream("student.dat");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(studentList);
		
	}catch (Exception ex ) {
	}finally {
		try {
			
		if (fos != null) {
			fos.close();
		}
		if (oos != null) {
			oos.close();
		}
		}catch (Exception ex) {}
	
	}
	break;
case 8:
	FileInputStream fis =null;
	ObjectInputStream ois = null;
	
	try {
		fis = new FileInputStream("student.dat");
		ois = new ObjectInputStream(fis);
		studentList = (List<Student>) ois.readObject();
		
	}catch (Exception ex ) {
	}finally {
		try {
			
		if (fis != null) {
			fis.close();
		}
		if (ois != null) {
			ois.close();
		}
		}catch (Exception ex) {}
	
	}
	break;

case 9:
	System.out.println("Good Bye!");
	break;

	default:
		System.out.println("Input failed!!");
		break;
	}
		
	} while (choose!= 9);
}
static void showMenu() {
System.out.println("1.Add student");//HasMap
System.out.println("2.Edit student by id");
System.out.println("3.Delete student by id");//HasMap & List
System.out.println("4. Sort student By GPA");//List
System.out.println("5.Sort student by name");//List
System.out.println("6.show student");//HasMap
System.out.println("7. Save");//HasMap & List
System.out.println("8. Read");
System.out.println("9.Exit");
System.out.println("Choose");
}
}
