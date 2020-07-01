package July;

class Book{
	String title;
	String author;

	public Book(String title, String author) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title + "," + author;
	}

	
}

public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("JAVA", "ȫ�浿");
		System.out.println(book.toString());
	}

}
