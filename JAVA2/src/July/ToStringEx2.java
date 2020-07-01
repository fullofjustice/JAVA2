package July;

class Bk{
	int bookNumber;
	String bookTitle;
	
	Bk(int bookNumber, String bookTitle){
		this.bookNumber=bookNumber;
		this.bookTitle=bookTitle;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookNumber + ", " + bookTitle;
	}
	
}

public class ToStringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bk book1 = new Bk(200, "°³¹Ì");
		System.out.println(book1);
	}

}
