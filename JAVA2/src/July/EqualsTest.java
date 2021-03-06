package July;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");
		
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
		// 인스턴스 생성시 만들어지는 heap 메모리 주소
		System.out.println("studentLee의 hashcode 값 : " + studentLee.hashCode());
		System.out.println("studentSang의 hashcode 값 : " + studentSang.hashCode());
		// 인스턴스 전에 주어지는 실제 주소
		System.out.println("studentLee의 실제 주소 값 : " + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소 값 : " + System.identityHashCode(studentSang));
	}

}
