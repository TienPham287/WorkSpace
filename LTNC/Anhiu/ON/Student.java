package ON;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
//	id: tang 
	static int count = 0;
	int id, age;
	String name, address;
	float gpa;

	public Student(int id, int age, String name, String address, float gpa) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
		this.gpa = gpa;
		id = count++;
	}

	public Student() {
		id = count++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public void input() {
		int count = 0;
		Scanner abc = new Scanner(System.in);
		id = count++;
		System.out.println("nhap id:");
		id = abc.nextInt();

		System.out.println("nhap ten:");
		name = abc.next();
		System.out.println("nhap dia chi:");
		address = abc.next();

		System.out.println("nhap tuoi:");
		age = abc.nextInt();

		System.out.println("nhap GPA:");
		gpa = abc.nextFloat();

	}

	public String getFileLine() {
		return id + "," + name + "," + age + "," + address + "," + gpa + ", " + "\n";

	}

	public void display() { 
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", age=" + age + ", name=" + name + ", address=" + address + ", gpa=" + gpa + "]";

	}
}
