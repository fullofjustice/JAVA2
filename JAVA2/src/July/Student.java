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
		// instanceof : �����ڷν� ��üŸ�� ����ȯ�� ���������� ���θ� �Ǵ�.
		if(obj instanceof Student) {
			// �ٿ�ĳ���� : �θ�Ŭ���� ��ü�� �ڽ�Ŭ���� ��ü�� ����ȯ
			Student std = (Student)obj;
			if(studentId == std.studentId)
				return true;
			else 
				return false;
		}
		return false;
	}
	
	
}
