package July;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		String str1 = "Hi everybody";
		String str2 = "Have a nice day!";
		
		str = str1+str2;
		
		System.out.println(str);
		
		System.out.println("st1���ڼ� : " + str1.length());
		
		System.out.println("str1 d���� ��ġ  : " + str.indexOf("d"));
		
		System.out.println("str1 ��� �ҹ��ڷ� ��ȯ : " + str.toLowerCase());
		
		System.out.println("str1 ��� �빮�ڷ� ��ȯ : " + str.toUpperCase());
	}

}
