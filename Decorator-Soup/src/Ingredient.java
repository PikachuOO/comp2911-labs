
public class Ingredient implements IIngredient {

	private String ingredientName;
	private int cost;
	private IIngredient decorator;
	
	public Ingredient(String ingredientName, int cost) {
		this.ingredientName = ingredientName;
		this.cost = cost;
		decorator = null;
	}
	
	@Override
	public void addIngredient(IIngredient ingredient) {
		if (decorator == null) {
			decorator = (Ingredient) ingredient;
		} else {
			decorator.addIngredient(ingredient);
		}
	}
	
	@Override
	public int getCost() {
		int result;
		result = cost;
		
		if (decorator != null) {
			result += decorator.getCost();
		}
	
		return result;
	}
	
	@Override
	public String toString() {
		String result;
		result = ingredientName;
		
		if (decorator != null) {
			result = result.concat(", " + decorator.toString());
		}
		
		return result;
	}
}
