package July;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVal1 = new String("��ȣ��");
		String strVal2 = "��ȿ��";
		//��������
		if(strVal1 == strVal2) {
			System.out.println("����");
		}
		else
			System.out.println("�ٸ�");
		//������
		if(strVal1.equals(strVal2)) {
			System.out.println("����");
		}
		else
			System.out.println("�ٸ�");
	}
	

}
