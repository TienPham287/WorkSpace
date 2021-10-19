package b7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	public static final String STUDENT_FILE_NAME = "student.txt";
	public void write(List <Student> studentList) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(new File(STUDENT_FILE_NAME));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(studentList);
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally  {
			closeStream(fos);
			closeStream(oos);
		
		}
	}
	private void closeStream(ObjectOutputStream oos) {
		// TODO Auto-generated method stub
		
	}
	public List<Student> read(){
		List <Student> studentList = new ArrayList<>();
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(new File(STUDENT_FILE_NAME));
			ois = new ObjectInputStream(fis);
			studentList = (List<Student>) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} finally {
			closeStream(fis);
			closeStream(ois);
		}
		
		return studentList;
		
	}
	private void closeStream(FileInputStream fis) {
		// TODO Auto-generated method stub
		
	}
	private void closeStream(ObjectInputStream is) {
		if ( is != null) {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			}
		}
		
	
	
	private void closeStream(FileOutputStream os) {
	if (os != null) {
		try {
			os.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	}
	}


