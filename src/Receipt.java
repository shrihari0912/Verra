import java.util.ArrayList;
import java.util.List;

public class Receipt {

	private List<Item> items;
	private List<Double> discountedPrices;
	public Receipt() {
		items = new ArrayList<>();
		discountedPrices = new ArrayList<>();
	}
	public void addItem(Item item) {
		items.add(item);
		discountedPrices.add(DiscountCalculator.calculateDiscount(item));
	}
	public double getTotalCost() {
		double totalCost = 0;
		for (double price : discountedPrices) {
			totalCost += price;
		}
		return totalCost;
	}
	public double getAmountSaved() {
		double amountSaved = 0;
		for (int i = 0; i < items.size(); i++) {
			amountSaved += items.get(i).getPrice() - discountedPrices.get(i);
		}
		return amountSaved;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < items.size(); i++) {
			sb.append(String.format("%d %s %.2f%n",
					1, items.get(i).getName(), discountedPrices.get(i)));
		}
		sb.append(String.format("Total: %.2f%n", getTotalCost()));
		sb.append(String.format("You saved: %.2f%n", getAmountSaved()));
		return sb.toString();
	}
}


