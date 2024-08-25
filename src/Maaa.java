import java.util.Arrays;
import java.util.Scanner;

public class Maaa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  int numItems = scanner.nextInt();
		  scanner.nextLine();
		  Receipt receipt = new Receipt();
		  for (int i = 0; i < numItems; i++) {
			  String line = scanner.nextLine();
			  String[] tokens = line.split(" ");
		     int quantity = Integer.parseInt(tokens[0]);
		     int priceIndex = Arrays.asList(tokens).indexOf("at") + 1;
		     double price = Double.parseDouble(tokens[priceIndex]);
		     String name = "";
		     for(int j = 1;j < priceIndex;j++) {
		    	 name += tokens[j] + " ";
		     }
		     name = name.trim();
		     boolean isClearanceItem = name.startsWith("clearance");
		     name = name.replaceAll("clearance ", "");
		     Category category;
		     
		     if(name.contains("chocolate") || name.contains("wine")) {
		    	 category = Category.FOOD_AND_DRINKS;
		     } else if(name.contains("shirt") || name.contains("dress")) {
		    	 category = Category.CLOTHS;
		     } else if(name.contains("book")){
			    	 category = Category.BOOKS;
		     }else {
		    	 category = Category.OTHER;
		     }
		     for (int j = 0; j < quantity; j++) {
		        receipt.addItem(new Item(name, price, category, isClearanceItem));
		     }
		  }
		  System.out.print(receipt);
		}
	}

