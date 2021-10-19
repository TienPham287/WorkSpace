package QuanlyCD;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class DanhSachCD implements Serializable {
	private static final long serialVersionUID =	1L;
	private List<Cd> ds;
	public DanhSachCD() {
		ds = new ArrayList<Cd>();
		
	}
	/*
	*Thêm vào một CD vào danh sách 
	*cd là CD cần thêm 
	*return false nếu không cần thêm(Trùng mã số)
	*return true nếu ngược lại 
*/
	public boolean themCd(Cd cd) {
		if (ds.contains(cd))
			return false;
		ds.add(cd);
		return true;
	}
	/*
	 * Lấy 1CD Tại vị trí trong danh sách
	 * i là vị trí cần lấy thông tin đĩa CD
	 * return null nếu i < 0 ||i > ds.size
	 * return 1 CD nếu ngược lại
	 */
	 public Cd getCD(int i) {
		 if ( i > 0 || i < ds.size()) 
			 return ds.get(i);
			 return null;
		 }
	 /*
	  * Xóa một CD khi biết mã số
	  * maDC là mã số CD cần xóa
	  * return true nếu không tồn tại
	  * reutrn true nếu xóa thành công 
	  */
	 public boolean xoaCD(String maCD) {
		 Cd cd = new Cd(maCD);
		 if (ds.contains(cd))
		 {
			 ds.remove(cd);
			 return true;
		 }
		 return false;
	 }
	 /*
	  * Tìm kiếm 1 CD khi biết mã số
	  * maCD là mã số CD cần tìm
	  * return null nếu không tìm thấy
	  * return 1CD nếu tìm thấy
	  */
	 public Cd timkiem(String maCD) {
		 Cd cd = new Cd(maCD);
		 if (ds.contains(cd))
		 return ds.get(ds.indexOf(cd));
		 return null;
	 }
	 /*
	  * cập nhật thông tin đĩa cD nếu biết mã số 
	  * maCD laf mã số cần cập nhật thông tin
	  * tua CD , tênCD, casy, soBaiHat, giathanh là thông tin mới
	  * return true nếu cập nhật thành công 
	  * return false nếu ngược lại
	  */
	 public boolean capnhat(String maCD, String tuaCD, String casy, int soBaiHat, double giathanh) {
		 Cd cd = new Cd(maCD);
		 if (ds.contains(cd)) {
			 cd = ds.get(ds.indexOf(cd));
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 cd.setTuaCD(tuaCD);
			 cd.setSoBaiHat(soBaiHat);
			 cd.setGiathanh(giathanh);
			 return true;
		 }
		 return false;
	 }
	 /*
	  * Tổng số Cd có trong danh sách
	  * null
	  * return int
	  */
	 public int tongCD() { 
		 return ds.size();
	 }
	 }
 












