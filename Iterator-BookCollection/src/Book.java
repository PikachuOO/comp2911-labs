
public class Book {

	private String title;
	private int Isbn;
	
	public Book(String title, int Isbn) {
		this.title = title;
		this.Isbn = Isbn;
	}
	
	@Override
	public String toString() {
		return title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getIsbn() {
		return Isbn;
	}
}
