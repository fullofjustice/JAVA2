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
			// �ٿ� ĳ�������� obj compareKey�� ����
			Key compareKey = (Key) obj;
			if (number == compareKey.number) {
				return true;
			} else {
				return false;
			}
		}
		return false;
		// this�� number�� compareKey�� number ���� ������ true �ƴϸ� false
	}

}
