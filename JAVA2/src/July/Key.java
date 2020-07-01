package July;

public class Key {
	int number;

	Key(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Key) {
			// 다운 캐스팅으로 obj compareKey로 대입
			Key compareKey = (Key) obj;
			if (number == compareKey.number) {
				return true;
			} else {
				return false;
			}
		}
		return false;
		// this의 number와 compareKey의 number 값이 같으면 true 아니면 false
	}

}
