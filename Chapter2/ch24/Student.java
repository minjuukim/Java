package ch24;

import java.util.ArrayList;

public class Student {
	int studentId;
	private String studentName;

	ArrayList<Subject> subjectList = new ArrayList<>();
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public void addSubject(String name, int score) {
		//subjectList.add(new Subject(subName, subScore));
		Subject subject = new Subject();
		subject.setSubName(name);
		subject.setSubScore(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject subject : subjectList) {
			System.out.println("�л� " + studentName + "�� " + subject.getSubName() + "���� ������ " + subject.getSubScore() + "�Դϴ�.");
			total += subject.getSubScore();
		}
		System.out.println("�л� " + studentName + "�� ������ " + total + " �Դϴ�." );
	}
}