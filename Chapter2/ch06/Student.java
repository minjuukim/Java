package ch06;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	// default 생성자
	public Student() {}	
	
	// 생성자
	public Student(int studentNumber, String studentName, int grade) {
		// 내 멤버변수에 초기화 시켜서 student를 생성하겠다
		// this.멤버변수 = 넘어온 값(매개변수)
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
	}
}
