import static org.junit.Assert.*;

import org.junit.Test;

public class TestSoup {

	@Test
	public void test() {
		
		DecoratorSoup s = new DecoratorSoup();
		
		s = new Stock(s);
		s = new Chicken(s);
		s = new Celery(s);
		s = new Carrot(s);
		
		System.out.println("Soup! " + s);
		System.out.println("Cost: " + s.getCost());
	}
}
