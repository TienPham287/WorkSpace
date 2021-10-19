package b7;
import java.util.Comparator;
public class SortStudentByName implements Comparable<Student> {
	public int compare(Student student1, Student student2) {
	return student1.getName().compareTo(student2.getName());
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
