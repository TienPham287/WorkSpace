package QuanlyCD;

import java.io.Serializable;

public class Cd implements Serializable {
	private static final long serialVersionUID =	1L;
private final String maCD;
private String tuaCD, casy;
private int soBaiHat;
private double giathanh;
public Cd(String maCD, String tuaCD, String casy, int soBaiHat, double giathanh) {
	super();
	this.maCD = maCD;
	this.tuaCD = tuaCD;
	this.casy = casy;
	this.soBaiHat = soBaiHat;
	this.giathanh = giathanh;
}
public Cd(String maCD) {
	this(maCD, "", "", 0, 0);
}
public String getMaCD() {
	return maCD;
}

public String getTuaCD() {
	return tuaCD;
}
public void setTuaCD(String tuaCD) {
	this.tuaCD = tuaCD;
}
public String getCasy() {
	return casy;
}
public void setCasy(String casy) {
	this.casy = casy;
}
public int getSoBaiHat() {
	return soBaiHat;
}
public void setSoBaiHat(int soBaiHat) {
	this.soBaiHat = soBaiHat;
}
public double getGiathanh() {
	return giathanh;
}
public void setGiathanh(double giathanh) {
	this.giathanh = giathanh;
}

}
