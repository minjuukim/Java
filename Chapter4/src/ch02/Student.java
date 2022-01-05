package ch02;

public class Student implements Cloneable {
	
	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	// toString 오버라이딩
	public String toString() {
		return studentNum + "," + studentName;
	}

	//같은 학번이면  논리적으로 같은 학생이라고 재정의.
	@Override
	public boolean equals(Object obj) {
		
		// obj가 Student인가
		if (obj instanceof Student) {
			Student std = (Student) obj;  // 다운캐스팅
			if( this.studentNum == std.studentNum )
				return true;
			else return false;
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
