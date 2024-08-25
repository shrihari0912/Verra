
public class DiscountCalculator {
	public static final double BOOKS_DISCOUNT = 0.05;
	public static final double FOOD_AND_DRINKS_DISCOUNT = 0.05;
	public static final double CLOTHS_DISCOUNT = 0.2;
	public static final double OTHER_DISCOUNT = 0.03;
	public static final double CLEARANCE_DISCOUNT = 0.2;
	public static double calculateDiscount(Item item) {
		double discount = 0;
		switch (item.getCategory()) {
		case BOOKS:
		case FOOD_AND_DRINKS:
			discount = item.getPrice() * BOOKS_DISCOUNT;
			break;
		case CLOTHS:
			discount = item.getPrice() * CLOTHS_DISCOUNT;
			break;
		case OTHER:
			discount = item.getPrice() * OTHER_DISCOUNT;
			break;
		}
		if (item.isClearanceItem()) {
			discount += (item.getPrice()-discount) * CLEARANCE_DISCOUNT;
		}
		return item.getPrice() - discount;
	}
}
