package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		
		
		// 두 객체의 주소값이 같은지 반환. false 반환됨.
		System.out.println(std1 == std2);
		
		// equals 재정의를 통해 같은 학번끼리는 true  반환.
		System.out.println(std1.equals(std2));
		
		// 논리적으로 같기 때문에 같은 해시코드 값이 반환. (hashCode 재정의)
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		// 진짜 해시코드 값 출력. (가상 메모리값)
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));

		std1.setStudentName("Kim");
		// clone의 return타입은 object이므로 student로 다운캐스팅.
		Student copyStudent = (Student) std1.clone();
		System.out.println(copyStudent);
		System.out.println(std1);
	}

}
