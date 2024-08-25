
public class Item {

	private String name;
	private double price;
	private Category category;
	private boolean isClearanceItem;
	public Item(String name, double price, Category category, boolean isClearanceItem) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.isClearanceItem = isClearanceItem;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public Category getCategory() {
		return category;
	}
	public boolean isClearanceItem() {
		return isClearanceItem;
	}
}
	

