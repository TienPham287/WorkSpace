package Tien;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int stId;
	private String name;
	private BirthDate birthDate;
	private List<Subject> subjects;

	public Student(int stId, String name, BirthDate bDate) {
		this.stId = stId;
		this.name = name;
		this.birthDate = bDate;
		this.subjects = new ArrayList<Subject>();
	}

	public Student(int stId, String name, int day, int month, int year) {
		 this(stId, name, new BirthDate(day, month, year));// this 1 constructor dc dinh nghia khac
	}

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addSubject(int id, String name, int credit, double score) {
		this.subjects.add(new Subject(id, name, credit, score));

	}

	public double getGrade() {
		if (this.subjects.isEmpty())
			return 0.0;

		int totalCredit = 0;
		double totalScore = 0;
		for (Subject su : this.subjects) {
			totalCredit += su.credit;
			totalScore += su.credit * su.score;
		}
		return totalScore / totalCredit;
	}

	public BirthDate getBirthDate() {
		return this.birthDate;
	}

	public String toString() {
		return this.stId + "\t" + this.name + "\t" + this.birthDate.toString() + "\t" + this.getGrade();
	}
}
