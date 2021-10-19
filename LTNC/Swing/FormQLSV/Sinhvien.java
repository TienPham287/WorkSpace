package FormQLSV;

import java.awt.List;
import java.io.ObjectInputStream;
import java.io.Serializable;



public class Sinhvien implements Serializable {
private String MaSV;
private String Hoten;
private int Tuoi;
public Sinhvien() {
	
}
public Sinhvien(String maSV, String hoten, int tuoi) {
	super();
	MaSV = maSV;
	Hoten = hoten;
	Tuoi = tuoi;
}
public String getMaSV() {
	return MaSV;
}
public void setMaSV(String maSV) {
	MaSV = maSV;
}
public String getHoten() {
	return Hoten;
}
public void setHoten(String hoten) {
	Hoten = hoten;
}
public int getTuoi() {
	return Tuoi;
} 
public void setTuoi(int tuoi) {
	Tuoi = tuoi;
}
public List getAll(){
	ObjectInputStream ois = null;
	try {
		
	} catch (Exception e) {
		
	}finally {
		
	}
	return null;
	
	
}

}
