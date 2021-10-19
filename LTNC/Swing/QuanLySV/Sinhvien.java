package QuanLySV;

import java.io.Serializable;

public class Sinhvien implements Serializable{
private final String mssv;
private String hoten, malop;
private double diemLT, diemTH;
public Sinhvien(String mssv, String hoten, String malop, double diemLT, double diemTH) throws Exception {
	super();
	this.mssv = mssv;
	this.hoten = hoten;
	this.malop = malop;
	this.diemLT = diemLT;
	this.diemTH = diemTH;
}
public Sinhvien(String masv) throws Exception{
	this(masv, "FirstName", "LastName", 0.0, 0.0);
	
	}
	public Sinhvien(String masv, String ten) throws Exception{
		this(masv, ten, "LastName", 0.0, 0.0);
		
	}
	public boolean equals(Object obj) {
		return this.mssv.equalsIgnoreCase(((Sinhvien)obj).mssv);
		
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getMalop() {
		return malop;
	}
	public void setMalop(String malop) {
		this.malop = malop;
	}
	public double getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(double diemLT) {
		this.diemLT = diemLT;
	}
	public double getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(double diemTH) {
		this.diemTH = diemTH;
	}
	public String getMssv() {
		return mssv;
	}
	
	public void setdiemLT(double diemLT) throws Exception{
		if (diemLT >= 0 && diemLT <=10)
			this.diemLT = diemLT;
		else 
			throw new Exception("Diem li thuyet nhap tu 0 -> 10");
		
	}
	public  void setdiemTH(double diemTH) throws Exception{
		if (diemTH >=0 && diemTH<=10)
			this.diemTH = diemTH;
		else
			throw  new Exception("Diem thuc hanh nhap tu 0 -> 10");
	}
	public double diemTB() {
		return (diemLT + diemTH)/2;
	}
	public String ketqua() {
		return (diemTB() >=5)? "Đậu":"Rớt";
		
	}
	}



