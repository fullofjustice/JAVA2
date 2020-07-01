package July;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student studentLee = new Student(100, "�̻��");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "�̻��");
		
		if(studentLee == studentLee2) {
			System.out.println("same");
		}
		else {
			System.out.println("diff");
		}
		
		if(studentLee.equals(studentLee2)) {
			System.out.println("same");
		}
		else {
			System.out.println("diff");
		}
		
		if(studentLee == studentSang) {
			System.out.println("same");
		}
		else {
			System.out.println("diff");
		}
		
		if(studentLee.equals(studentSang)) {
			System.out.println("same");
		}
		else {
			System.out.println("diff");
		}
		// �ν��Ͻ� ������ ��������� heap �޸� �ּ�
		System.out.println("studentLee�� hashcode �� : " + studentLee.hashCode());
		System.out.println("studentSang�� hashcode �� : " + studentSang.hashCode());
		// �ν��Ͻ� ���� �־����� ���� �ּ�
		System.out.println("studentLee�� ���� �ּ� �� : " + System.identityHashCode(studentLee));
		System.out.println("studentSang�� ���� �ּ� �� : " + System.identityHashCode(studentSang));
	}

}
