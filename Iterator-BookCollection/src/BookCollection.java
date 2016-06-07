
public class BookCollection implements Aggregate {

	private Book[] books;
	private int numBooks;
	private int maxBooks;
	
	public BookCollection() {
		numBooks = 0;
		maxBooks = 10;
		books = new Book[maxBooks];
	}

	@Override
	public Iterator createIterator() {
		return new BookIterator();
	}
	
	public boolean addBook(Book book) {
		
		for (Book iterBook : books) {
			if (iterBook == book) {
				return false;
			}
		}

		if (numBooks == maxBooks) {
			Book[] newBooks = new Book[maxBooks*2];
			System.arraycopy(this.books, 0, newBooks, 0, numBooks);
		}
		
		books[numBooks] = book;
		numBooks++;
		
		return true;
	}

	private class BookIterator implements Iterator {

		private int position;
		
		public BookIterator() {
			position = 0;
		}
		
		@Override
		public Object nextItem() {
			if (position == maxBooks) {
				return null;
			}
			position++;
			return books[position];
		}

		@Override
		public Object firstItem() {
			return books[0];
		}

		@Override
		public Object lastItem() {
			return books[numBooks-1];
		}

		@Override
		public boolean hasNext() {
			if (books[position+1] == null) {
				return false;
			}
			return true;
		}

		@Override
		public Object currItem() {
			return books[position];
		}
	}
}
