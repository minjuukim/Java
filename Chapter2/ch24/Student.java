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
			System.out.println("학생 " + studentName + "의 " + subject.getSubName() + "과목 성적은 " + subject.getSubScore() + "입니다.");
			total += subject.getSubScore();
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다." );
	}
}