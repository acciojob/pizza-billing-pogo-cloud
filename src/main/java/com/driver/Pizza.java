package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppings;

    public int getPrice(){
        return this.price;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg==true){
            this.price=300;
            this.toppings=70;
        }else{
            this.price=400;
            this.toppings=80;
        }
        this.bill="Base Price Of The Pizza:"+this.price+"\n";
        this.isExtraToppingsAdded=false;
        this.isTakeAway=false;
        this.isExtraCheeseAdded=false;
    }
    boolean isExtraCheeseAdded;
    boolean isExtraToppingsAdded;
    boolean isBillCreated;
    boolean isTakeAway;

    public void addExtraCheese(){
      if(!isExtraCheeseAdded){
          this.price+=80;
          isExtraCheeseAdded=true;
      }
    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded){
            this.price+=this.toppings;
            isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        if(!isTakeAway){
            this.price+=20;
            isTakeAway=true;
        }
    }

    public String getBill(){
        if(!isBillCreated) {
            if (isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added:80" + "\n";
            }
            if (isExtraToppingsAdded) {
                this.bill += "Extra Toppings Added:" + this.toppings + "\n";
            }
            if (isTakeAway) {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill+="Total Price:"+this.price+"\n";
            isBillCreated=true;
            return this.bill;
        }
        return "";
    }
}
