package Tien;

import java.util.List;

public class Test {

	public static void display(List<Student> sts) {
		for(Student st: sts) System.out.println(st);
	}
	
	public static void main(String[] args) {
		University uni = new University("Đại học Nông Lâm");
		
		uni.addStudent(11111, "nguyễn văn an", 2, 11, 1999);
		uni.addStudent(22222, "Nguyễn Văn B", 30, 1, 1999);
		uni.addStudent(55555, "Nguyễn Văn C", 18, 12, 2000);
		
		uni.addSubject(11111, 1, "lập trình cơ bản", 4, 5);
		uni.addSubject(11111, 2, "lập trình nâng cao", 4, 9);
		
		uni.addSubject(55555, 1, "lập trình cơ bản", 4, 10);
		
		display(uni.getStudents());
		System.out.println("===================");
		
		display(uni.sortByGrade());
		
		System.out.println("===================");
		
		display(uni.sortByDate());
	}

}
