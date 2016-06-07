import java.util.LinkedList;

public class Car {

	private LinkedList<Item> items;
	
	public Car() {
		this.items = new LinkedList<Item>();
	}
	
	public void addItem(CarItem.ItemType itemType) {
		Item item = new CarItem(itemType);
	}
	
	public void discountItem(CarItem.ItemType itemType) {
		for (Item item : items) {
			if (item.getType() == itemType) {
				items.remove(item);
				DiscountedItem newDiscountedItem = new DiscountedItem(item);
				items.add(newDiscountedItem);
			}
		}
	}
	
	public double getPrice() {
		double totalPrice = 0;
		
		for (Item item : items) {
			totalPrice += item.getPrice();
		}

		return totalPrice;
	}
}
