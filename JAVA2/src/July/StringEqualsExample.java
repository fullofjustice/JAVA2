package July;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVal1 = new String("이호진");
		String strVal2 = "이효진";
		//물리적비교
		if(strVal1 == strVal2) {
			System.out.println("같음");
		}
		else
			System.out.println("다름");
		//논리적비교
		if(strVal1.equals(strVal2)) {
			System.out.println("같음");
		}
		else
			System.out.println("다름");
	}
	

}
