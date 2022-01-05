package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		
		
		// �� ��ü�� �ּҰ��� ������ ��ȯ. false ��ȯ��.
		System.out.println(std1 == std2);
		
		// equals �����Ǹ� ���� ���� �й������� true  ��ȯ.
		System.out.println(std1.equals(std2));
		
		// �������� ���� ������ ���� �ؽ��ڵ� ���� ��ȯ. (hashCode ������)
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		// ��¥ �ؽ��ڵ� �� ���. (���� �޸𸮰�)
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));

		std1.setStudentName("Kim");
		// clone�� returnŸ���� object�̹Ƿ� student�� �ٿ�ĳ����.
		Student copyStudent = (Student) std1.clone();
		System.out.println(copyStudent);
		System.out.println(std1);
	}

}
