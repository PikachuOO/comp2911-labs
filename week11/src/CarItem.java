
public class CarItem implements Item {

	private ItemType itemType;
	
	public enum ItemType {
		STEERING_WHEEL (100),
		CHASSIS (200),
		SEAT (300);

	    private int price;

	    ItemType(int price) {
	        this.price = price;
	    }

	    public int getPrice() {
	        return price;
	    }
	}
	
	public CarItem(ItemType itemType) {
		this.itemType = itemType;
	}
	
	public ItemType getType() {
		return itemType;
	}

	@Override
	public double getPrice() {
		return itemType.getPrice();
	}
}
