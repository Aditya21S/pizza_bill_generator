package pizzaBill;

public class Pizza {
  private int pizzaPrice =300;
   
  private  Boolean veg=true;
 private int extraTopping=20;
  private int takeAway=44; 
  private int extraCheese=40;
  private int basePizzaPrice;
   
  
  private Boolean isExtraCheeseAdded= false;
  private Boolean isExtraToppingsAdded= false;
  private Boolean isOptedTOTakeAway=false;
  
  
  
   public Pizza(Boolean veg) {
	   this.veg=veg;
	   if(this.veg) {
		   this.pizzaPrice=300;
	   }else {
		   this.pizzaPrice=400;
	   }  
	   basePizzaPrice=this.pizzaPrice;
   }
   
   public void addExtraCheese() {
	 isExtraCheeseAdded=true;
	   this.pizzaPrice+=extraCheese;

   }
   
   public void addExtratoppings() {
	   isExtraToppingsAdded= true;
	   this.pizzaPrice+=extraTopping;
	  
   }
   
   public void takeaway() {
	  isOptedTOTakeAway=true;
	   this.pizzaPrice+=takeAway;
	   
   }
   
   public void getBill() {
	  String bill="";
	  System.out.println("Pizza:"+basePizzaPrice);
	  if(isExtraCheeseAdded) {
		  
	  bill+="Extra Cheese added: "+extraCheese+"\n";
	  
	  }
	  if(isExtraToppingsAdded) {
		  
		 bill+="Toppings added :"+extraTopping+"\n";
		 
	    }
	if(isOptedTOTakeAway) {
		
		bill+="Take Away :"+takeAway+"\n";  
		
	   }
	bill+= "Bill :"+this.pizzaPrice+"\n";
	System.out.println(bill);
   }
}






