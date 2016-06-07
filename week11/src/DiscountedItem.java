
public class DiscountedItem implements Item {

	private Item item;
	private double discount;
	
	public DiscountedItem(Item item) {
		this.item = item;
		this.discount = discount;
	}

	@Override
	public double getPrice() {
		return item.getPrice() * discount;
	}

	@Override
	public CarItem.ItemType getType() {
		return item.getType();
	}
}
