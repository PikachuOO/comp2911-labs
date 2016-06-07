import static org.junit.Assert.*;

import org.junit.Test;

public class TestBookCollection {

	@Test
	public void test() {
		BookCollection collection = new BookCollection();
		Iterator iterator = collection.createIterator();
		
		Book bookOne = new Book("book one", 1);
		Book bookTwo = new Book("book two", 2);
		Book bookThree = new Book("book three", 3);
		Book bookFour = new Book("book four", 4);
		Book bookFive = new Book("book five", 5);
		Book bookSix = new Book("book six", 6);

		collection.addBook(bookOne);
		collection.addBook(bookTwo);
		collection.addBook(bookThree);
		collection.addBook(bookFour);
		collection.addBook(bookFive);
		collection.addBook(bookSix);

		assertEquals(iterator.firstItem(), bookOne);
		assertEquals(iterator.lastItem(), bookSix);
		assertEquals(iterator.hasNext(), true);
		
		assertEquals(iterator.currItem(), bookOne);
		assertEquals(iterator.nextItem(), bookTwo);
		assertEquals(iterator.currItem(), bookTwo);
		assertEquals(iterator.nextItem(), bookThree);
		assertEquals(iterator.nextItem(), bookFour);
		assertEquals(iterator.nextItem(), bookFive);
		assertEquals(iterator.nextItem(), bookSix);

		assertEquals(iterator.hasNext(), false);
		
	}

}
