package July;

public class BoxingUnboxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		//Integer obj3 = new Integer(300);
		
		// Unboxing ��ü�� �⺻ Ÿ������
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		
		System.out.println(value1 +  " " + value2);
		
	}

}
