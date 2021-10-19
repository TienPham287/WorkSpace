package b9;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vemaybay implements Serializable {
String id;
String name;
String date;
String bag;
int price;
public Vemaybay(String id, String name, String date, String bag, int price) {
	super();
	this.id = id;
	this.name = name;
	this.date = date;
	this.bag = bag;
	this.price = price;
}
public Vemaybay() {
	
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getBag() {
	return bag;
}
public void setBag(String bag) {
	this.bag = bag;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public void input() {
	Scanner input = new Scanner(System.in);
	System.out.println("Nhap ma ve: ");
	while(true) {
		id = input.nextLine();
		String pattermStr = "";
		if (id.startsWith("VJ")) {
			pattermStr = "VJ[1-9]{1}[0-9]{2}";
			
		}else if (id.startsWith("VN")) {
			pattermStr = "VN[1-9]{1}[0-9]{2}[0-9]?";
			
		}else if (id.startsWith("JET")) {
			pattermStr = "JET[1-9]{1}[0-9]{2}";
			
		}else {
			System.out.println("Nhap lai");
			continue;
		}
	Pattern pattern = Pattern.compile(pattermStr);
	Matcher matcher = pattern.matcher(id);
	if (matcher.find()) {
		break;
	}else {
		System.out.println("Nhap lai");
	}
	}
		System.out.println("Nhap ten chuyen bay: ");
	name = input.nextLine();
	System.out.println("Ngay bay:");
	date = input.nextLine();
	System.out.println("Nhap hanh ly ki gui:");
	bag = input.nextLine();
	System.out.println("Nhap gia: ");
	price = Integer.parseInt(input.nextLine());
	
}
@Override
public String toString() {
	return "Vemaybay [id=" + id + ", name=" + name + ", date=" + date + ", bag=" + bag + ", price=" + price + "]";
}
public void display() {
	System.out.println(toString());
}
}
