package pizzaBill;

public class Main {

	public static void main(String[] args) {
//		Pizza basePrice=new Pizza(false);
//		basePrice.addExtraCheese();
//		basePrice.takeaway();
//		basePrice.addExtratoppings();
//		
//		basePrice.getBill();
		
		DeluxePizza dp=new DeluxePizza(true);
		
		dp.getBill();
	}

}
