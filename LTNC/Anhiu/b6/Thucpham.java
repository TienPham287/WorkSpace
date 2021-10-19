 package b6;

import java.util.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Thucpham {
	private int mahang;
	private String tenhang;
	private double dongia;
	private Date date,nSX, hSD;
	public Thucpham() {
		
	}
	public Thucpham(int mahang, String tenhang, double dongia, Date nSX, Date hSD) {
		super();
		this.mahang = mahang;
		this.tenhang = tenhang;
		this.dongia = dongia;
		this.nSX = nSX;
		this.hSD = hSD;
	}
	public int getMahang() {
		return mahang;
	}
	public void setMahang(int mahang) {
		this.mahang = mahang;
	}
	public String getTenhang() {
		return tenhang;
	}
	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public Date getnSX() {
		return nSX;
	}
	public void setnSX(Date nSX) {
		this.nSX = nSX;
	}
	public Date gethSD() {
		return hSD;
	}
	public void sethSD(Date hSD) {
		this.hSD = hSD;
	}
	@Override
	public String toString() {
		//Sử dụng phương thức Locale để biến đỏi theo tiền tệ Việt Nam
		Locale localeVN = new Locale("vi", "VN" );
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
		String str = numberFormat.format(dongia);
		//Sử dụng phương thức SimpleDateFormat để biến đổi ngày tháng năm  theo dạng dd/mm/yy
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String str1 = simpleDateFormat.format(nSX);
		String str2 = simpleDateFormat.format(hSD);
		return "THông tin về thực phẩm: \n" +
				"Mã hàng: " +mahang+
				"\nTên hàng" + tenhang+
				"\nđơn giá:" +str+
				"\nngày sản xuất: " + str1+
				"\nHạn sử dụng: " + str2
				;
	}
	//Khởi tạo phương thức để nhập năm tháng ngày sản xuất
	public void setNSX(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month -1, day);
		this.nSX = (Date) calendar.getTime();
		
	}
	// Khởi tạo phương thức để nhập hạn sử dụng
	public void setHSD(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, day);
		this.hSD = (Date) calendar.getTime();
		
	}
// Tạo phương thức kiểm tra tên hàng không để trống 
	public boolean kiemtraTenHang(boolean k) {
		if (this.tenhang == ""|| this.tenhang.isEmpty()) {
			System.out.println("Tên hàng không dược để trống: ");
			
		}else {
			k = false;
		}
		return k;
	}
	// khởi tạo hàm kiểm tra ngày hết hạn không được nhỏ hơn ngày sản xuất
	public boolean kiemtrangay(boolean t) {
		if (this.getnSX().compareTo(this.gethSD()) < 0) {
			t =false;
			
		}else {
			System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất");
			
		}
		return t;
	}
	// Khởi tạo phương thức kiểm tra hạn sử dụng của sản phẩm đã hết hay còn hạn
	public void kiemtraHSD() {
		Date today = new Date();
		today.getTime();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String st = simpleDateFormat.format(today);
		if (this.gethSD().compareTo(today) < 0) {
			System.out.println("Hôm nay là ngày" +st+"hàng hóa đã hết hạn");
			
		}else {
			System.out.println("Hôm nay là ngày " + st+ "Hàng hóa vẫn còn hạn");
			
		}
	}
}
