package b7;

import java.util.Scanner;

public class Main {
public static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
	String choose = null;
	boolean exit = false;
	StudentManager studentmanager = new StudentManager();
	int studentid;
	showMenu();
	while (true) {
		choose = scanner.nextLine();
		switch (choose) {
		case "1":
			studentmanager.add();
			break;
		case "2":
			studentid = studentmanager.inputId();
		studentmanager.Edit(studentid);
			break;
		case "3":
			studentid = studentmanager.inputId();
			studentmanager.delete(studentid);
			break;
		case "4":
			studentmanager.sortStudentByGPA();
			break;
		case "5":
		studentmanager.sortStudentByName();
			break;
		case "6":
			studentmanager.show();
			break;
		case "0":
			System.out.println("exited!");
			exit = true;
			break;
		default:
			System.out.println("Invalid! please choose action in below menu"); 
			break;

		}
		if (exit) {
			break;
		}
		showMenu();
	}
}
private static void showMenu() {
	 System.out.println("_____Menu_____");
	 System.out.println("1.Add student.");
	 System.out.println("2.Edit student by id.");
	 System.out.println("3.Delete student by id.");
	 System.out.println("4.Sort student by gpa.");
	 System.out.println("5.Sort student by Name.");
	 System.out.println("6.Show student:");
	 System.out.println("0.Exit");
	 System.out.println("Please choose:");
}
}
