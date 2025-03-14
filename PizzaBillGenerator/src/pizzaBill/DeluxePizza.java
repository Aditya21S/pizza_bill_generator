package pizzaBill;

public class DeluxePizza extends Pizza {
    public DeluxePizza(Boolean veg) {
    	super(veg);
    	super.addExtraCheese();
    	super.addExtratoppings();
    	
    
    }
    
    @Override
    public void addExtraCheese() {
    	
    }
    public void addExtratoppings() {
    	
    }
    
}
