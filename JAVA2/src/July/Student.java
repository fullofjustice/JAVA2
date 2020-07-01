package July;

public class Student {
	int studentId;
	String studentName;
	Student(int studentId, String studentName){
		this.studentId=studentId;
		this.studentName=studentName;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentId;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// instanceof : 연산자로써 객체타입 형변환이 가능한지의 여부를 판단.
		if(obj instanceof Student) {
			// 다운캐스팅 : 부모클래스 객체가 자식클래스 객체로 형변환
			Student std = (Student)obj;
			if(studentId == std.studentId)
				return true;
			else 
				return false;
		}
		return false;
	}
	
	
}
