package ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		// 생성자가 하나도 없을 때 default 생성자가 만들어진다.
		Student studentLee = new Student();
		studentLee.grade = 1;
		
		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(123456, "Kim", 3);
		System.out.println(studentKim.showStudentInfo());

	}

}
