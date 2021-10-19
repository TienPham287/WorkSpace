package QuanLySV;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DanhSachSinhvien implements Serializable{
	private List<Sinhvien> ds;
	//Khởi tạo danh sách sinh vien
	public DanhSachSinhvien(){
		ds = new ArrayList<Sinhvien>();
		}
	//Thêm sinh viên vào danh sách
	//sv là sv cần thêm
	// return true nếu thành công
	//return false nếu bị trùng mssv
	public boolean addSinhvien(Sinhvien sv){
		if (ds.contains(sv)) {
			return false;
		}
		ds.add(sv);
		return true;
	}
	//lấy thông tin sv tại vị trí i trong danh sách
	// i là thứ tự sv trong danh sách
	// return null nếu vị trí i không hợp lệ
	// return 1 sv trong trường hợp hợp lệ ngược lại
	public Sinhvien getSinhvien(int i){ 
		if (i > 0 && i < ds.size())
		return ds.get(i);
		return null;
	}
	//  Tổng số sinh viên có trong danh sách
	public int sumSinhvien() {
		return ds.size();
	}
	//Tìm kiếm sv khi biết mssv
	//mssv là mã số cần tìm
	//return sinh viên nếu tìm thấy
	// return null null nếu không tìm thấy
	public Sinhvien Find(String masv) throws Exception{
		Sinhvien sv = new Sinhvien(masv);
		if (ds.contains(sv))
		return ds.get(ds.indexOf(sv));
		return null;
	}
	//xóa một sv khi biết masv
	//masv là mã số cần xóa 
	// return true nếu tồn tại sinh viên này
	// return false nếu ngược lại
	public boolean DeleteSinhvien(String masv) throws Exception{
		Sinhvien sv = new Sinhvien(masv);
		if (ds.contains(sv))
		{
			ds.remove(sv);
			return true;
		}
		return false;
		
	}
	//Sửa thông tin sinh vien
	//masv là mã số sv cần sửa thông tin
	//thông tin mới sv này
	//return false nếu như không tồn tại sinh viên có masv
	
	public boolean LoadSinhvien(String masv, Sinhvien svVersion2) throws Exception{
		Sinhvien sv = new Sinhvien(masv);
		if (ds.contains(sv)) {
			sv.setHoten(svVersion2.getHoten());
			sv.setdiemLT(svVersion2.getDiemLT());
			sv.setdiemTH(svVersion2.getDiemTH());
			return true;
		}
		return false;
	}
	{
}

}
