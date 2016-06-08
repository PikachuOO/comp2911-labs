import static org.junit.Assert.*;

import org.junit.Test;

public class TestSoup {

	@Test
	public void test() {
		Ingredient soup = new Ingredient("water", 0);
		Ingredient chicken = new Ingredient("chicken", 100);
		Ingredient chickpeas = new Ingredient("chickpeas", 30);
		Ingredient stock = new Ingredient("stock", 10);
		Ingredient carrot = new Ingredient("carrot", 20);
		Ingredient celery = new Ingredient("celery", 20);

		soup.addIngredient(chicken);
		soup.addIngredient(chickpeas);
		soup.addIngredient(stock);
		soup.addIngredient(carrot);
		soup.addIngredient(celery);
		
		assertEquals(soup.getCost(), 180);
		System.out.println("Soup! With.. " + soup.toString());
	}

}
