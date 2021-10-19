package B1;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	static Zoo zoo = new Zoo();

	public static void main(String[] args) {

		int choose;

		do {
			showMenu();
			choose = Integer.parseInt(input.nextLine());
			switch (choose) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;

			default:
				System.out.println("Nhap lai !");
				break;
			}
		} while (choose != 6);
	}

	static void inputRoom() {

	}

	static void showMenu() {
		System.out.println("1.Them Room");
		System.out.println("2.Xoa Room");
		System.out.println("3.Them con vat");
		System.out.println("4.Xoa con vat");
		System.out.println("5.Xem tat ca thong tin cac con vat");
		System.out.println("6.Thoat");
		System.out.println("Choose:");
	}
}
