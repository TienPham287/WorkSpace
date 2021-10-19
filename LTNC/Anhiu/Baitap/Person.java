package Baitap;

import java.util.Scanner;

public class Person {
	String name;
	String gender;
	String brithday;
	String address;
	public Person(String name, String gender, String brithday, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.brithday = brithday;
		this.address = address;
	}
	public void inputInfo() {
		Scanner input = new Scanner(System.in);
		System.out.println("nhap ten");
		name = input.nextLine();
		
		System.out.println("nhap gioi tinh:");
		gender = input.nextLine();
		
		System.out.println("nhap ngay sinh");
		brithday = input.nextLine();
		
		System.out.println("nhap dia chi");
		address = input.nextLine();
	}
	public void showinfor() {
		System.out.println("Ten : " + name +";gioi tinh:" + gender + ";ngay sinh :" + brithday + ";dia chi"+address);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBrithday() {
		return brithday;
	}
	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
