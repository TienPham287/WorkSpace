package b8;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
int id;
String name;
int age;
String Address;
float gpa;
public Student() {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	Address = Address;
	this.gpa = gpa;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public float getGpa() {
	return gpa;
}
public void setGpa(float gpa) {
	this.gpa = gpa;
}
public void input() {
	Scanner input = new Scanner(System.in);
	System.out.println("Nhập id: ");
	id = Integer.parseInt(input.nextLine());
	
	Edit();
	
}
public void Edit() {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Nhập tên :");
	name = input.nextLine();
	
	System.out.println("Nhập tuổi : ");
	age = Integer.parseInt(input.nextLine());
	
	System.out.println("Nhập địa chỉ :");
	Address = input.nextLine();
	
	System.out.println("Nhập điểm trung bình:");
	gpa = Float.parseFloat(input.nextLine());
	
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + ", Address=" + Address + ", gpa=" + gpa + "]";
}
public void display() {
	System.out.println(toString());
}
}
