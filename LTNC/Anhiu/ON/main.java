package ON;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.sun.tools.javac.Main;
import com.sun.tools.sjavac.Log.Level;

import jdk.jfr.internal.LogLevel;

public class main {
	private static final String Level = null;
	static List<Student> studentList = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int choose;
		do {
			showMenu();
			choose = Integer.parseInt(scan.next());
			switch (choose) {
			case 1:
				inputStudent();
				break;
			case 2:
				editStudent();
				break;
			case 3:
				deleteStudent();
				break;
			case 4:
				sortStudentById();
				break;
			case 5:
				sortStudentByGPA();
				break;
			case 6:
				displayStudent();
				break;
			case 7:
				saveFile();
				break;
			case 8:
				readFile();
				break;
			case 9:
				System.out.println("thoat!!");
				break;
			default:
				System.out.println("nhap sai");

			}
		} while (choose != 9);

	}

	private static void editStudent() {
		System.out.println("nhap id sinh vien can sua:");
		int id = scan.nextInt();
		for (Student student : studentList) {
			if (student.getId() == id) {
				student.input();
				break;
			}
		}
		// TODO Auto-generated method stub

	}

	private static void readFile() {
		// TODO Auto-generated method stub

	}

	private static void saveFile() {
		//luu file
		System.out.println("bat dau luu");
		FileOutputStream fos = null;
		try {
		fos = new FileOutputStream("student.txt");
		} catch (FileNotFoundException ex)
		
		}


	private static void displayStudent() {
		for (Student student : studentList) {
			student.display();

		}
	}
	// TODO Auto-generated method stub

	private static void sortStudentByGPA() {
		Collections.sort(studentList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
				// z-a(a-z them - )

			}
		});
	}

	private static void sortStudentById() {
		Collections.sort(studentList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getGpa() > o2.getGpa()) {
					return -1;
				}

				// TODO Auto-generated method stub
				return 1;
			}
		});
	}
	// TODO Auto-generated method stub

	private static void deleteStudent() {
		System.out.println("nhap id sinh vien can xoa:");
		int id = scan.nextInt();
		for (Student student : studentList) {
			if(student.getId()==id) {
			studentList.remove(student);
			break ;
	
			
			
			
	}

	private static void inputStudent() {
		System.out.println("nhap so sinh vien");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			Student std = new Student();
			std.input();
			studentList.add(std);
		}
	}

	public static void showMenu() {
		System.out.println("1.them sinh vien");
		System.out.println("2.sua sinh vien theo id");
		System.out.println("3.xoa sinh vien theo id");
		System.out.println("4.sap xep theo id");
		System.out.println("5.sap xep theo ten");
		System.out.println("6.hien thi thong tin sinh vien");
		System.out.println("7.luu vao file student.txt");
		System.out.println("8.doc noi dung sinh vien tu student.txt");
		System.out.println("9.thoat");
		System.out.println("chon:");
	}
}